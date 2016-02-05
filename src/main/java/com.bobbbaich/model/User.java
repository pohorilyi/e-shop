package com.bobbbaich.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bohdan Pohotilyi on 08.01.2016.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_surname")
    private String surname;
    @Email
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_password")
    private String password;
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Basket basket;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Purchase> purchases = new ArrayList<>();

    public User() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public static class Builder{
        private User user = new User();
        public Builder setName(String name){
            user.setName(name);
            return this;
        }
        public Builder setSurname(String surname){
            user.setSurname(surname);
            return this;
        }
        public Builder setEmail(String email){
            user.setEmail(email);
            return this;
        }
        public Builder setPassword(String password){
            user.setPassword(password);
            return this;
        }
        public User build(){
            return user;
        }
    }
}
