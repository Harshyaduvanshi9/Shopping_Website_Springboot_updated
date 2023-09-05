package com.newshoppingpassign.newshoppingassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import com.newshoppingpassign.newshoppingassign.model.Users;

// @Repository

public interface UsersRepo extends JpaRepository<Users,Long>{

    Users findByEmail(String email);

    Users findByPassword(String password);

    Users findByEmailAndPassword(String email, String password);
    
}
