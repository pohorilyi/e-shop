package com.bobbbaich.repository;

import com.bobbbaich.model.ProductCard;
import com.bobbbaich.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 15.02.2016.
 */
@Repository
public interface ProductCardRepository extends JpaRepository<ProductCard, Long> {
    List<ProductCard> findProductCardsByProductType(ProductType productType);
}
