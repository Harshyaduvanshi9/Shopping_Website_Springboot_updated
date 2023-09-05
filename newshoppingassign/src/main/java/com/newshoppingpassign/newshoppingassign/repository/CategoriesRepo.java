package com.newshoppingpassign.newshoppingassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newshoppingpassign.newshoppingassign.model.CategoriesModel;

public interface CategoriesRepo extends JpaRepository<CategoriesModel,Integer>{
    
}
