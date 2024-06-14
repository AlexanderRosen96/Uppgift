package com.example.wigelltravels.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Trips {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 45, nullable = false)
    private String hotalName;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    @JsonIgnoreProperties({"trips", "bookings"})
    private Destination destination;


    @OneToMany (mappedBy = "trip",cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"Trips", "trip", "destination"})
    private List<Bookings> bookings;

    public Trips() {
    }

    public Trips(String hotalName, Destination destination, List<Bookings> bookings) {
        this.hotalName = hotalName;
        this.destination = destination;
        this.bookings = bookings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public List<Bookings> getBookings() {
        return bookings;
    }

    public void setBookings(List<Bookings> bookings) {
        this.bookings = bookings;
    }

    public String getHotalName() {
        return hotalName;
    }

    public void setHotalName(String hotalName) {
        this.hotalName = hotalName;
    }

}
