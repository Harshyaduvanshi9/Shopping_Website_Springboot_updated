package com.newshoppingpassign.newshoppingassign.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newshoppingpassign.newshoppingassign.model.ProductModel;

import com.newshoppingpassign.newshoppingassign.repository.ProductRepo;

@Service

public class ProductService {
    @Autowired
    ProductRepo Pr;

    // public

    

     public ProductModel Productsave(ProductModel p)
    {
        return Pr.save(p);

    }

      public List<ProductModel> all()
    {
        List<ProductModel> result = new ArrayList<>();
        Pr.findAll().forEach( result::add );
        return result;
    }

    public void deletebutton( int itemId )
    {
        Pr.deleteById( itemId );
    }



    
}
