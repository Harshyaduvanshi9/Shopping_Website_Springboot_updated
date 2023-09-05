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
@Table(name="OrderItems")
public class OrderItems {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer order_item_id;
    
    @NotNull
    private int quantity;

    @NotNull
    private float price;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    @NotNull
    ProductModel product;

    public OrderItems() {
    }

    public Integer getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(Integer order_item_id) {
        this.order_item_id = order_item_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

   

    @Override
    public String toString() {
        return "OrderItems [order_item_id=" + order_item_id + ", quantity=" + quantity + ", price=" + price
                + ", product_id=" + product + "]";
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }



    
    

    
}
