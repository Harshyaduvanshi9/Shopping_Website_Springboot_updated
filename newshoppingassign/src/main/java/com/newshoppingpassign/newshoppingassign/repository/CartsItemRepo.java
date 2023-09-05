package com.newshoppingpassign.newshoppingassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newshoppingpassign.newshoppingassign.model.CartItems;

public interface CartsItemRepo extends JpaRepository<CartItems,Integer>{
    
}
