package com.bobbbaich.model;

import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 08.01.2016.
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_cost")
    private Double cost;
    @Column(name = "product_description")
    private String description;
    @Column(name = "product_type")
    private ProductType productType;
    @URL
    @Column(name = "product_picture_url")
    private String pictureUrl;
    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private List<Purchase> purchases = new ArrayList<>();

    public Product() {}

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

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
