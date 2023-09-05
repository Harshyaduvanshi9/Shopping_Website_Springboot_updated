package com.newshoppingpassign.newshoppingassign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newshoppingpassign.newshoppingassign.model.AdminLogin;
import com.newshoppingpassign.newshoppingassign.model.ProductModel;
import com.newshoppingpassign.newshoppingassign.repository.AdminLogin_Repo;
import com.newshoppingpassign.newshoppingassign.services.ProductService;


@Controller
public class AdminController {

    @Autowired
    AdminLogin_Repo Ar;

    @Autowired

    ProductService Ps;



    //  @PostMapping("/admin_login" )
    // public String adminLogin(AdminLogin Ars)
    // {
    //     Ar.save(Ars);

    //     return "Add_Product";
        
    // }


     @PostMapping("/admin_login")
    public String adminLoginDetails(@RequestParam("admin") String admin, @RequestParam("password") String password, Model model) {
        AdminLogin adminn = Ar.findByAdminAndPassword(admin,password);
        List<ProductModel>product =Ps.all();
       
         model.addAttribute("myreg", product);


        if (adminn != null) {
            return "displayProduct";
        } else {
            
            return "admin";
        }
    }
    
}
