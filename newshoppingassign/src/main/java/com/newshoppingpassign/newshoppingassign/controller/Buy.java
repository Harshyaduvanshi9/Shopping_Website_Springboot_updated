package com.newshoppingpassign.newshoppingassign.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import com.newshoppingpassign.newshoppingassign.model.Payments;
// import com.newshoppingpassign.newshoppingassign.model.Payments;
import com.newshoppingpassign.newshoppingassign.model.ProductModel;
import com.newshoppingpassign.newshoppingassign.repository.PaymentsRepo;
import com.newshoppingpassign.newshoppingassign.repository.ProductRepo;

@Controller
public class Buy {

    @Autowired
    ProductRepo PRepo;
    @Autowired
    PaymentsRepo payrepo;

    @PostMapping("/buy")
    public String buy(@RequestParam("product_id") Integer product_id, Model model) {

        ProductModel product_obj = PRepo.findById(product_id).orElse(null);
        if (product_obj != null) {
            model.addAttribute("product", product_obj);
            return "Payment";
        } else {
            return "redirect:/";
        }

    }

    @GetMapping("/paymentnew/pay")
    public String newaction(Model model)
    {
        
        

        return "SuccessfulPayment";
    }

    @GetMapping("/buyall")
    public String buyall()
    {
        return "Payment";
    }

}
