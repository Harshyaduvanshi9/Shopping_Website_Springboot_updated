package com.newshoppingpassign.newshoppingassign.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newshoppingpassign.newshoppingassign.model.Users;
import com.newshoppingpassign.newshoppingassign.repository.UsersRepo;

@Service
public class UserService {
    @Autowired
    UsersRepo Ur;

    public Users save(Users u)
    {
        return Ur.save(u);

    }
    
    
}
