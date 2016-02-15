package com.bobbbaich.service;

import com.bobbbaich.model.Product;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 05.02.2016.
 */
public interface ProductService {
    public Product saveProduct(Product product);
    public Product findProductById(Long id);
    public List<Product> findAllProducts();
    public Product deleteProduct(Long id);
    public  List<Product> findRandomProducts();
}
