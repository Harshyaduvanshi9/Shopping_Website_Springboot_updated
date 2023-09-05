package com.newshoppingpassign.newshoppingassign.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Categories")
public class CategoriesModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer category_id;
    @NotBlank
    private String category_name;
    
    @Override
    public String toString() {
        return "CategoriesModel [category_id=" + category_id + ", category_name=" + category_name + "]";
    }
    public CategoriesModel() {
    }
    public Integer getCategory_id() {
        return category_id;
    }
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
    public String getCategory_name() {
        return category_name;
    }
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    
    
}
