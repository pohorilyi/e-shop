package com.bobbbaich.service;

import com.bobbbaich.model.Product;
import com.bobbbaich.model.ProductType;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 05.02.2016.
 */
public interface ProductService {
    public Product saveProduct(Product product);
    public Product findProductrById(Long id);
    public List<Product> findProductsByProductType(ProductType type);
    public List<Product> findAllProducts();
    public Product deleteProduct(Long id);
}
