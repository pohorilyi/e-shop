package com.bobbbaich.service;

import com.bobbbaich.model.Product;
import com.bobbbaich.model.ProductCard;
import com.bobbbaich.model.ProductType;
import com.bobbbaich.repository.ProductCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 15.02.2016.
 */
@Service
public class ProductCardServiceImpl implements ProductCardService {
    @Autowired
    private ProductCardRepository productCardRepository;

    @Override
    public ProductCard saveProductCard(Product product) {
        return null;
    }

    @Override
    public ProductCard findProductCardById(Long id) {
        ProductCard productCard = productCardRepository.findOne(id);
        return productCard;
    }

    @Override
    public List<ProductCard> findProductCardsByProductType(ProductType type) {
        List<ProductCard> productCard = productCardRepository.findProductCardsByProductType(type);
        return productCard;
    }

    @Override
    public List<ProductCard> findAllProductCards() {
        List<ProductCard> productCard = productCardRepository.findAll();
        return productCard;
    }

    @Override
    public ProductCard deleteProductCard(Long id) {
        ProductCard productCard = productCardRepository.findOne(id);
        productCardRepository.delete(id);
        return productCard;
    }

    @Override
    public List<ProductCard> findRandomProductCards() {
        List<ProductCard> productCards = productCardRepository.findAll();
        Collections.shuffle(productCards);
        return productCards;
    }
}
