package com.newshoppingpassign.newshoppingassign.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer product_id;
    @NotBlank
    private String product_name;
    
    @Positive
    private int price;
    
    private String description;
    
    @Positive
    private int stock_quantity;

    @Positive

    @NotBlank
    private String imageUrl;

    public ProductModel() {
    }

    @ManyToOne
    @JoinColumn(name="category_id")
    CategoriesModel categoriesModel;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

  
   

    public CategoriesModel getCategoriesModel() {
        return categoriesModel;
    }

    public void setCategoriesModel(CategoriesModel categoriesModel) {
        this.categoriesModel = categoriesModel;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;

    }

    @Override
    public String toString() {
        return "ProductModel [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price
                + ", description=" + description + ", stock_quantity=" + stock_quantity + ", imageUrl=" + imageUrl
                + ", categoriesModel=" + categoriesModel + "]";
    }


    

    
}
