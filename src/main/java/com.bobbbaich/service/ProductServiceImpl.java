package com.bobbbaich.service;

import com.bobbbaich.model.Product;
import com.bobbbaich.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 05.02.2016.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public Product findProductById(Long id) {
        Product product = productRepository.findOne(id);
        return product;
    }

//    @Override
//    public List<Product> findProductsByProductType(ProductType type) {
//        List<Product> products = productRepository.findProductsByProductType(type);
//        return products;
//    }

    @Override
    public List<Product> findAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product deleteProduct(Long id) {
        Product product = productRepository.findOne(id);
        productRepository.delete(id);
        return product;
    }

    @Override
    public List<Product> findRandomProducts() {
        List<Product> products = productRepository.findAll();
        Collections.shuffle(products);
        return products;
    }
}
