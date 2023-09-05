package com.newshoppingpassign.newshoppingassign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.newshoppingpassign.newshoppingassign.repository.UsersRepo;

@Controller
public class AboutUsController {

    @Autowired

    UsersRepo uRepo;

    @GetMapping("/gotoaboutUs")
    public String goToAboutUs()
    {
        return "About_us";

    }
    

    

    
}
