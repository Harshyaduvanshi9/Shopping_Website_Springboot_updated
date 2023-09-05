package com.newshoppingpassign.newshoppingassign.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer order_id;

    @NotNull
    private LocalDate order_date;

    @NotNull
    private float total_amount;
    private String shippingaddress;
    String  payment_status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull
    Users user;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public LocalDate getOrder_date() {
        return order_date;
    }

    public void setOrder_date(LocalDate order_date) {
        this.order_date = order_date;
    }

    public float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }

    public String getShippingaddress() {
        return shippingaddress;
    }

    public void setShippingaddress(String shippingaddress) {
        this.shippingaddress = shippingaddress;
    }

   

   

    public Orders() {
    }

    @Override
    public String toString() {
        return "Orders [order_id=" + order_id + ", order_date=" + order_date + ", total_amount=" + total_amount
                + ", shippingaddress=" + shippingaddress + ", payment_status=" + payment_status + ", user_id=" + user
                + "]";
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }



    
}
