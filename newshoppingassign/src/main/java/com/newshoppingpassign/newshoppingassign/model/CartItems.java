package com.newshoppingpassign.newshoppingassign.model;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CartItems")
public class CartItems {
    @Id
      @GeneratedValue(strategy= GenerationType.AUTO)


    
    private Integer cart_item_id;
    @NotNull
    private int quantity;
    @ManyToOne
    @JoinColumn(name="art_id")
    @NotNull
    CartsModel cart_id;
    @ManyToOne
    @JoinColumn(name="product_id")
    @NotNull
    ProductModel productModel;
    public Integer getCart_item_id() {
        return cart_item_id;
    }
    public void setCart_item_id(Integer cart_item_id) {
        this.cart_item_id = cart_item_id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public CartsModel getCart_id() {
        return cart_id;
    }
    public void setCart_id(CartsModel cart_id) {
        this.cart_id = cart_id;
    }
    
   
    public ProductModel getProductModel() {
        return productModel;
    }
    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }
    public CartItems() {
    }
    @Override
    public String toString() {
        return "CartItems [cart_item_id=" + cart_item_id + ", quantity=" + quantity + ", cart_id=" + cart_id
                + ", product_id=" + productModel + "]";
    }







    
}
