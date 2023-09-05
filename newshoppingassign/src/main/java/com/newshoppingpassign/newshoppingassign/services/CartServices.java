package com.newshoppingpassign.newshoppingassign.services;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newshoppingpassign.newshoppingassign.model.CartItems;
import com.newshoppingpassign.newshoppingassign.model.CartsModel;
import com.newshoppingpassign.newshoppingassign.repository.CartRepo;
import com.newshoppingpassign.newshoppingassign.repository.CartsItemRepo;

@Service
public class CartServices {

    @Autowired
    CartRepo cr;

    @Autowired
    CartsItemRepo cir;

     public void setOrderDate(CartsModel ad)
    {
        LocalDateTime l=LocalDateTime.now();
        // LocalDate newDate = l.plusDays(7);

        ad.setCreated_at(l);
    }

    List<CartItems> all()
    {
        List<CartItems> result = new ArrayList<>();
        cr.findAll().forEach( result::add );
        return result;
    }

    
  






    
}
