package com.newshoppingpassign.newshoppingassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newshoppingpassign.newshoppingassign.model.OrderItems;

public interface OrderItemsRepo extends JpaRepository<OrderItems,Integer> {
    
}
