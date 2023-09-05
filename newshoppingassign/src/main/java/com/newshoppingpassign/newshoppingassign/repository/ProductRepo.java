package com.newshoppingpassign.newshoppingassign.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.newshoppingpassign.newshoppingassign.model.ProductModel;

public interface ProductRepo extends JpaRepository<ProductModel,Integer>{
    
}
