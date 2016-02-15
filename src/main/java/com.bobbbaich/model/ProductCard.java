package com.bobbbaich.model;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 13.02.2016.
 */
@Entity
@Table(name = "product_card")
public class ProductCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_card_id")
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_cost")
    private Double cost;
    @Column(name = "product_description")
    private String description;
    @Column(name = "product_discount")
    private Double discount;
    @Column(name = "product_type")
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    @Column(name = "product_card_products_count")
    private int productsCount;
    @Column(name = "product_card_sizes")
    @ElementCollection(targetClass = ProductSize.class)
    @Enumerated(value = EnumType.STRING)
    private List<ProductSize> productSizes = new ArrayList<>();
    @Column(name = "product_pictures_url")
    @URL
    @ElementCollection(targetClass = String.class)
    private List<String> picturesUrl;
    @OneToMany(mappedBy = "productCard", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

    public ProductCard() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getProductsCount() {
        return productsCount;
    }

    public void setProductsCount(int productsCount) {
        this.productsCount = productsCount;
    }

    public List<ProductSize> getProductSizes() {
        return productSizes;
    }

    public void setProductSizes(List<ProductSize> productSizes) {
        this.productSizes = productSizes;
    }

    public List<String> getPicturesUrl() {
        return picturesUrl;
    }

    public void setPicturesUrl(List<String> picturesUrl) {
        this.picturesUrl = picturesUrl;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
