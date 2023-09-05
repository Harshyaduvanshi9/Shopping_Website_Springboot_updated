package com.newshoppingpassign.newshoppingassign.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer review_id;

     @Positive
    private String rating;
    private String review_text;
    @NotNull
    private LocalDate reviewDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
     @NotNull
    Users user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @NotNull
    ProductModel product_id;

    public Reviews() {
    }

    public Integer getReview_id() {
        return review_id;
    }

    public void setReview_id(Integer review_id) {
        this.review_id = review_id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview_text() {
        return review_text;
    }

    public void setReview_text(String review_text) {
        this.review_text = review_text;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

   

    public ProductModel getProduct_id() {
        return product_id;
    }

    public void setProduct_id(ProductModel product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "Reviews [review_id=" + review_id + ", rating=" + rating + ", review_text=" + review_text
                + ", reviewDate=" + reviewDate + ", user_id=" + user + ", product_id=" + product_id + "]";
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }


    


    
    
    
}
