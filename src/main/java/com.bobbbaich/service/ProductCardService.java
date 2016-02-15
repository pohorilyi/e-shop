package com.bobbbaich.service;

import com.bobbbaich.model.Product;
import com.bobbbaich.model.ProductCard;
import com.bobbbaich.model.ProductType;

import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 15.02.2016.
 */
public interface ProductCardService {
    public ProductCard saveProductCard(Product product);
    public ProductCard findProductCardById(Long id);
    public List<ProductCard> findProductCardsByProductType(ProductType type);
    public List<ProductCard> findAllProductCards();
    public ProductCard deleteProductCard(Long id);
    public List<ProductCard> findRandomProductCards();
}
