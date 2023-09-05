package com.newshoppingpassign.newshoppingassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newshoppingpassign.newshoppingassign.model.Payments;

public interface PaymentsRepo extends JpaRepository<Payments,Integer>{
    
}
