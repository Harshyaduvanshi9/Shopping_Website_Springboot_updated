package com.newshoppingpassign.newshoppingassign.model;

import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinTable;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
// import java.util.HashSet;
// import java.util.Set;

@Entity
@Table(name="New_users")

public class Users {
   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @NotBlank
    private String username;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private String shipping_address;
    private String billing_address;

    // @ManyToMany(fetch = FetchType.EAGER)
    // @JoinTable(name = "user_roles",
    //         joinColumns = @JoinColumn(name = "user_id"),
    //         inverseJoinColumns = @JoinColumn(name = "role_id"))
            
    // private Set<Roles> roles = new HashSet<>();
    

    public Long getUser_id() {
        return user_id;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
   
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
  
    public String getShipping_address() {
        return shipping_address;
    }
    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }
    public String getBilling_address() {
        return billing_address;
    }
    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    
    

  
    


    public Users() {
    }
    public Users(@NotBlank String username, @Email @NotBlank String email, @NotBlank String password,
            String shipping_address, String billing_address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.shipping_address = shipping_address;
        this.billing_address = billing_address;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    

    
    



    
}
