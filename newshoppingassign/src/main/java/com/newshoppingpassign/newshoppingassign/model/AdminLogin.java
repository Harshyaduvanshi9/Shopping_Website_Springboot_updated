package com.newshoppingpassign.newshoppingassign.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(
    name = "admin_details"
)
public class AdminLogin {
    @Id
    private String admin;
    private String password;

    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAdmin() {
        return admin;
    }
    public void setAdmin(String admin) {
        this.admin = admin;
    }
    
    
}
