package com.example.wigelltravels.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 12, nullable = false)
    private LocalDate timeOfDeparture;

    @Column(length = 20, nullable = false)
    private double totalPriceInSEK;

    private double totalPriceInEuro;

    @ManyToOne
    @JoinColumn(name = "id_Number", nullable = false)
    @JsonIgnoreProperties("bookingsList")
    @JsonProperty("customer")
    private Customers customer;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    @JsonIgnoreProperties({"bookings", "destination"})
    @JsonProperty("trip")
    private Trips trip;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    @JsonIgnoreProperties({"bookings", "trips"})
    @JsonProperty("destination")
    private Destination destination;

    public Bookings() {
    }

    public Bookings(LocalDate timeOfDeparture, double totalPriceInSEK, double totalPriceInEuro, Customers customer, Trips trip, Destination destination) {
        this.timeOfDeparture = timeOfDeparture;
        this.totalPriceInSEK = totalPriceInSEK;
        this.totalPriceInEuro = totalPriceInEuro;
        this.customer = customer;
        this.trip = trip;
        this.destination = destination;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public Trips getTrip() {
        return trip;
    }

    public void setTrip(Trips trip) {
        this.trip = trip;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
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
