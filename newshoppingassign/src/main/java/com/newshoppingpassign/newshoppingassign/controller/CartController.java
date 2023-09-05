package com.newshoppingpassign.newshoppingassign.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newshoppingpassign.newshoppingassign.model.ProductModel;
import com.newshoppingpassign.newshoppingassign.repository.CartsItemRepo;
import com.newshoppingpassign.newshoppingassign.repository.ProductRepo;
import com.newshoppingpassign.newshoppingassign.services.CartServices;

@Controller
public class CartController {

    @Autowired
    CartServices Cs;

    @Autowired
    CartsItemRepo Ci_repo;

    @Autowired
    ProductRepo Pr;

    private List<ProductModel> cartItems = new ArrayList<>();




    @GetMapping("/add-to-cart")
    public String addToCart(@RequestParam("product_id") Integer product_id) {
        ProductModel product = Pr.findById(product_id).orElse(null);
        
        if (product != null) {
            cartItems.add(product);

        }
        return "redirect:/";
    }

    // @GetMapping("/gotocart")
    // public String gotocart()
    // {
    //     return "AddToCart";
    // }

      @GetMapping("/gotocart")
    public String viewCart(Model model) {
         model.addAttribute("totalAmount", calculateTotalAmount());
        if(calculateTotalAmount()!=0){
        model.addAttribute("cartItems", cartItems);
        System.out.println("///////////////////////////////"+cartItems);
        }
        else{
            
        String empty="Your Cart Is Empty";
            model.addAttribute("emptyCart", empty);
        }
        return "AddToCart";
    }


    private double calculateTotalAmount() {
        double totalAmount = 0;
        for (ProductModel item : cartItems) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }

    @GetMapping("/remove-from-cart")
    public String removeFromCart(@RequestParam("product_id") Integer productId) {
        boolean removed = false;
        for (ProductModel item : cartItems) {
            if (item.getProduct_id().equals(productId)) {
                cartItems.remove(item);
                removed = true;
                break;
            }
        }
        if (removed) {
            return "redirect:/gotocart";
        } else {
            // Item not found in the cart
            return "redirect:/gotocart"; // or handle the error condition as desired
        }
    }
   


















    
    
}
