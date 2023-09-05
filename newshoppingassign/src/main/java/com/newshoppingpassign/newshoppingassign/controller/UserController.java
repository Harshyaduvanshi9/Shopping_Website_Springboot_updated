package com.newshoppingpassign.newshoppingassign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import com.newshoppingpassign.newshoppingassign.model.ProductModel;
import com.newshoppingpassign.newshoppingassign.model.Users;
import com.newshoppingpassign.newshoppingassign.repository.UsersRepo;
import com.newshoppingpassign.newshoppingassign.services.UserService;



@Controller
public class UserController {

    @Autowired
    private UserService us;

    @Autowired
    private UsersRepo uRepo;


    //  @GetMapping("/")
    // public String index(){

    //     return "index";
    // }
     

    @GetMapping("/newsignup")
    public String signup(){
        return "SignUp";
    }


    @PostMapping("/createuser")
    public String saveUser(Users user)
    {
        us.save(user);

        return "login";
        
    }

    @GetMapping("/alreadylogin")
    public String login()
    {
        return "login";
    }


    // @GetMapping("/updateuser")
    // public String login1(){
    //     return "UpdateUser";
    // }

    @GetMapping("/gotomain")
    public String goToMain()
    {
        return "redirect:/";
    }

    @GetMapping("/admin")
    public String goToAdmin()
    {
        return "admin";
    }




    @GetMapping("/newhomepage")
    public String newhome()
    {
        return "redirect:/";
    }

    @PostMapping("/updateuser")
    public String loginmyid(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        Users user = uRepo.findByEmailAndPassword(email, password);

        if (user != null) {
            model.addAttribute("newUser", user);
            return "UpdateUser";
        } else {
           
            return "login";
        }
    }


    @PostMapping("/deletebutton/deleteuser")
    

    public String deleteownaccount( @RequestParam Long user_id )
    {
                
        uRepo.deleteById(user_id);


        return "redirect:/";

    }

    

   


    @GetMapping("/usermyeditbutton")

public String updateUser(@RequestParam("user_id") Long user_id, Model model) {
    Users user_obj = uRepo.findById(user_id).orElse(null);
    if (user_obj != null) {
        model.addAttribute("EditUser", user_obj);
        return "userEdit";
    } else {
        return "displayProduct";
    }
}



@PostMapping("/editkarouser")
  public String editaddProduct(Users pm) {
    Users pr = uRepo.findById(pm.getUser_id()).orElse(null);
    pr.setUsername(pm.getUsername());
    pr.setEmail(pm.getEmail());
    pr.setPassword(pm.getPassword());

    pr.setBilling_address(pm.getBilling_address());
    pr.setShipping_address(pm.getShipping_address());

   
   
   
    
    uRepo.save(pr);
    return "redirect:/";


  }






     

    







    
}
