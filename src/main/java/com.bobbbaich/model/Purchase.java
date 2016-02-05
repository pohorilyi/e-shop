package com.bobbbaich.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 08.01.2016.
 */
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_id")
    private Long id;
    @DateTimeFormat
    @Column(name = "purchase_creation_date")
    private Date creationDate;
    @Column(name = "purchase_status")
    @Enumerated
    private PurchaseStatus purchaseStatus;
    @ManyToOne
    @JoinColumn(name = "purchase_user_id", foreignKey = @ForeignKey(name = "purchase_user_id_fk"))
    private User user;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "purchase_product",
            joinColumns = @JoinColumn(name = "purchase_binding_product_id"),
            foreignKey = @ForeignKey(name = "purchase_binding_product_id_fk"),
            inverseJoinColumns = @JoinColumn(name = "product_binding_purchase_id"),
            inverseForeignKey = @ForeignKey(name = "product_binding_purchase_id_fk")
    )
    private List<Product> products = new ArrayList<>();

    public Purchase() {
        this.purchaseStatus = PurchaseStatus.IN_BASKET;
    }

    public Long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public PurchaseStatus getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(PurchaseStatus purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }
}
