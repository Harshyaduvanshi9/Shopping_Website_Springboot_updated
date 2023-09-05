package com.newshoppingpassign.newshoppingassign.model;


import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Carts")
public class CartsModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer cart_id;

     @NotNull
    private LocalDateTime created_at;
    @ManyToOne
    @JoinColumn(name="user_id")

    @NotNull
    Users user;
    
    public CartsModel() {
    }
    public Integer getCart_id() {
        return cart_id;
    }
    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }
    public LocalDateTime getCreated_at() {
        return created_at;
    }
    public void setCreated_at(LocalDateTime l) {
        this.created_at = l;
    }
   
    @Override
    public String toString() {
        return "CartsModel [cart_id=" + cart_id + ", created_at=" + created_at + ", user_id=" + user + "]";
    }
    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }


    
}
