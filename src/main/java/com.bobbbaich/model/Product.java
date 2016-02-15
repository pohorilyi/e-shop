package com.bobbbaich.model;

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
    @Column(name = "product_self_cost")
    private Double self_cost;
    @Column(name = "product_count")
    private int productCount;
    @Column(name = "product_size")
    @Enumerated(EnumType.STRING)
    private ProductSize productSize;
    @ManyToOne
    @JoinColumn(name = "product_card_products_id", foreignKey = @ForeignKey(name = "product_card_products_id_fk"))
    private ProductCard productCard;
    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private List<Purchase> purchases = new ArrayList<>();

    public Product() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSelf_cost() {
        return self_cost;
    }

    public void setSelf_cost(Double self_cost) {
        this.self_cost = self_cost;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public ProductSize getProductSize() {
        return productSize;
    }

    public void setProductSize(ProductSize productSize) {
        this.productSize = productSize;
    }

    public ProductCard getProductCard() {
        return productCard;
    }

    public void setProductCard(ProductCard productCard) {
        this.productCard = productCard;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }
}
