package com.bobbbaich;

import com.bobbbaich.config.AppConfig;
import com.bobbbaich.config.AppInitialiser;
import com.bobbbaich.config.DataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Bohdan Pohotilyi on 08.01.2016.
 */
@SpringBootApplication
@ComponentScan
@PropertySource("classpath:application.properties")
@Import({DataConfig.class, AppConfig.class, AppInitialiser.class})
public class EshopApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {SpringApplication.run(EshopApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EshopApplication.class);
    }


}