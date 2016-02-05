package com.bobbbaich.repository;

import com.bobbbaich.model.Product;
import com.bobbbaich.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 09.01.2016.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductsByProductType(ProductType productType);
}
