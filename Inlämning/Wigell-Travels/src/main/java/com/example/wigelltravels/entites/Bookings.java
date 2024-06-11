package com.example.wigelltravels.entites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate timeOfDeparture;

    private double totalPriceInSEK;
    private double totalPriceInEuro;

    @ManyToOne
    @JoinColumn(name = "id_Number")
    private Customers customer;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Trips trip;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Destination destination;

    public Bookings() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(LocalDate timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public double getTotalPriceInSEK() {
        return totalPriceInSEK;
    }

    public void setTotalPriceInSEK(double totalPriceInSEK) {
        this.totalPriceInSEK = totalPriceInSEK;
    }

    public double getTotalPriceInEuro() {
        return totalPriceInEuro;
    }

    public void setTotalPriceInEuro(double totalPriceInEuro) {
        this.totalPriceInEuro = totalPriceInEuro;
    }
}
