package com.newshoppingpassign.newshoppingassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newshoppingpassign.newshoppingassign.model.Orders;

public interface OrdersRepo extends JpaRepository<Orders,Integer>{
    
}
