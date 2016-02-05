package com.bobbbaich.config;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Bohdan Pohotilyi on 08.01.2016.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.bobbbaich.repository")
public class DataConfig {
    private static final Logger log = LoggerFactory.getLogger(DataConfig.class);

    private static final String STAND_SYSTEM_PROPERTY_NAME = "stand";
    private static final String DEV_PROPERTIES_PATH_TEMPLATE = "/dev/{stand}.properties";
    private static final String PROP_DATABASE_DRIVER = "db.driver";
    private static final String PROP_DATABASE_PASSWORD = "db.password";
    private static final String PROP_DATABASE_URL = "db.url";
    private static final String PROP_DATABASE_USERNAME = "db.username";
    private static final String PROP_HIBERNATE_DIALECT = "hibernate.dialect";
    private static final String PROP_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    private static final String PROP_ENTITY_MANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";
    private static final String PROP_HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";

    @Resource
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        entityManagerFactoryBean.setPackagesToScan(env.getRequiredProperty(PROP_ENTITY_MANAGER_PACKAGES_TO_SCAN));
        entityManagerFactoryBean.setJpaProperties(getHibernateProperties());
        return entityManagerFactoryBean;
    }

    @Bean
    public JpaTransactionManager transactionManager(){
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }

    @Bean
    public DataSource dataSource(){
        String stand = env.getProperty(STAND_SYSTEM_PROPERTY_NAME);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty(PROP_DATABASE_DRIVER));

        boolean testPhase = !StringUtils.isEmpty(env.getProperty(PROP_DATABASE_URL));
        if(testPhase){
            return setDbProperties(dataSource, env.getRequiredProperty(PROP_DATABASE_URL), env.getRequiredProperty(PROP_DATABASE_USERNAME), env.getRequiredProperty(PROP_DATABASE_PASSWORD));
        }


        try {
            Properties devProperties = PropertiesLoaderUtils.loadProperties(new ClassPathResource(DEV_PROPERTIES_PATH_TEMPLATE.replace("{stand}", stand)));
            DataSource ds = setDbProperties(dataSource, devProperties.getProperty(PROP_DATABASE_URL), devProperties.getProperty(PROP_DATABASE_USERNAME), devProperties.getProperty(PROP_DATABASE_PASSWORD));
            return ds;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return dataSource;
    }

    private DataSource setDbProperties(DriverManagerDataSource dataSource, String url, String username, String password) {
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put(PROP_HIBERNATE_DIALECT, env.getRequiredProperty(PROP_HIBERNATE_DIALECT));
        properties.put(PROP_HIBERNATE_SHOW_SQL, env.getRequiredProperty(PROP_HIBERNATE_SHOW_SQL));
        properties.put(PROP_HIBERNATE_HBM2DDL_AUTO, env.getRequiredProperty(PROP_HIBERNATE_HBM2DDL_AUTO));
        log.info("Hibernate properties was set successfully.");
        return properties;
    }
}
