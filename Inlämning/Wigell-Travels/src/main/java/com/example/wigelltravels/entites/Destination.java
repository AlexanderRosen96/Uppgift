package com.example.wigelltravels.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String city;

    private String country;

    @OneToMany (mappedBy = "destination",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("Destination")
    private List<Trips> trips;

    @OneToMany(mappedBy = "destination",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("Destination")
    private List<Bookings> bookings;

    public Destination() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Trips> getTrips() {
        return trips;
    }

    public void setTrips(List<Trips> trips) {
        this.trips = trips;
    }

    public List<Bookings> getBookings() {
        return bookings;
    }

    public void setBookings(List<Bookings> bookings) {
        this.bookings = bookings;
    }
}
