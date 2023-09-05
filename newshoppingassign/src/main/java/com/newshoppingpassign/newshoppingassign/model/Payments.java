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
@Table(name="Payments")
public class Payments {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int payment_id;
    @NotNull
    private LocalDate paymentDate;
    @NotNull
    private float payment_amount;
    @NotNull
    private String payment_status;

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    @ManyToOne
    @JoinColumn(name = "order_id")
    @NotNull
    Orders order;

    public Payments() {
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public float getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(float payment_amount) {
        this.payment_amount = payment_amount;
    }

    

  

    @Override
    public String toString() {
        return "Payments [payment_id=" + payment_id + ", paymentDate=" + paymentDate + ", payment_amount="
                + payment_amount + ", payment_status=" + payment_status + ", order_id=" + order + "]";
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }





    
}
