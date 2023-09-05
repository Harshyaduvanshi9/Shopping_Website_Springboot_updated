package com.newshoppingpassign.newshoppingassign.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newshoppingpassign.newshoppingassign.model.ProductModel;
import com.newshoppingpassign.newshoppingassign.repository.ProductRepo;
import com.newshoppingpassign.newshoppingassign.services.ProductService;

@Controller
public class ProductController {

    @Autowired

    ProductService Ps;

    @Autowired 
    ProductRepo Preop;

    

    public ProductController(@Autowired ProductService ps) {
        Ps = ps;
    }

     @GetMapping("/")
    public String displayItems(Model model) {
        List<ProductModel>product =Ps.all();
       
         model.addAttribute("myregfir", product);
        return "index"; // Return the name of your HTML template
    }


    @GetMapping("/addproducts")
    public String saveP()
    {
        
        return "Add_Product";

    }


    @PostMapping("/add_product")
    public String addProduct(ProductModel p)
    {
         Ps.Productsave(p);
         return "redirect:/showProductshop";

    }


    @GetMapping("/showProductshop")

    public String showProduct(Model model)
    {
         List<ProductModel>product =Ps.all();
       
         model.addAttribute("myreg", product);

        

        return "displayProduct";

    }

 


     @PostMapping("/deletebutton/delete")

    public String deletemyp( @RequestParam Integer product_id )
    {
                
        Preop.deleteById( product_id );


        return "redirect:/showProductshop";

    }



@GetMapping("/myeditbutton")

public String updateUser(@RequestParam("product_id") Integer product_id, Model model) {
    ProductModel product_obj = Preop.findById(product_id).orElse(null);
    if (product_obj != null) {
        model.addAttribute("product", product_obj);
        return "productEdit";
    } else {
        return "displayProduct";
    }
}



@PostMapping("/editproduct")
  public String editaddProduct(ProductModel pm) {
    ProductModel pr = Preop.findById(pm.getProduct_id()).orElse(null);
    pr.setDescription(pm.getDescription());
    pr.setProduct_name(pm.getProduct_name());
    pr.setPrice(pm.getPrice());
    pr.setImageUrl(pm.getImageUrl());
    pr.setStock_quantity(pm.getStock_quantity());
    pr.setCategoriesModel(pm.getCategoriesModel());
    
    Preop.save(pr);
    return "redirect:/showProductshop";


  }

  @GetMapping("/backtomain")

  public String backToMain()
    {
        
         return "index";

    }

    @GetMapping("/editedADD")
    public String editedADD()
    {
        return "Add_Product";

    }

  

   


    
}
