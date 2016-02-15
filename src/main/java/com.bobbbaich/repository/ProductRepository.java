package com.bobbbaich.repository;

import com.bobbbaich.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bohdan Pohotilyi on 09.01.2016.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
