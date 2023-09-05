package com.newshoppingpassign.newshoppingassign.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newshoppingpassign.newshoppingassign.model.AdminLogin;



@Repository
public interface AdminLogin_Repo extends JpaRepository<AdminLogin,String>{
    AdminLogin findByAdmin(String admin);
    AdminLogin findByPassword(String password);

    AdminLogin findByAdminAndPassword(String admin, String password);
    
}
