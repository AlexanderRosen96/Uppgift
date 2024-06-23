package com.example.changevalue.entites;

import jakarta.persistence.*;

@Entity
public class ExchangeRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 20)
    private double amountInSEK;
    private double amountInEuro;
    private double rate = 0.1;

    public ExchangeRate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmountInSEK() {
        return amountInSEK;
    }

    public void setAmountInSEK(double amountInSEK) {
        this.amountInSEK = amountInSEK;
    }

    public double getAmountInEuro() {
        return amountInEuro;
    }

    public void setAmountInEuro(double amountInEuro) {
        this.amountInEuro = amountInEuro;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
