package com.example.wigelltravels.entites;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Trips {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String hotalName;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Destination destination;


    @OneToMany (mappedBy = "trip",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Bookings> bookings;

    public Trips() {
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
