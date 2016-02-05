package com.bobbbaich.model;

import javax.persistence.*;

/**
 * Created by Bohdan Pohotilyi on 08.01.2016.
 */
@Entity
@Table(name = "basket")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "basket_id")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private User user;
    public Basket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
