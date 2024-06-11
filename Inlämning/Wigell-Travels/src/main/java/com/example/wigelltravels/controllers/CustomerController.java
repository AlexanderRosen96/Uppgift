package com.example.wigelltravels.controllers;

import com.example.wigelltravels.entites.Bookings;
import com.example.wigelltravels.entites.Customers;
import com.example.wigelltravels.entites.Trips;
import com.example.wigelltravels.services.BookingsService;
import com.example.wigelltravels.services.TripsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class CustomerController {
    @Autowired
    private TripsService tripsService;

    @Autowired
    private BookingsService bookingsService;

    @GetMapping("/trips")
    private List<Trips> fetchAllTrips(){
        return tripsService.fetchAll();
    }

    @PostMapping("/booktrip")
    private ResponseEntity<String> addTrip (@RequestBody Bookings bookings){
        bookingsService.addBooking(bookings);
        return new ResponseEntity<>("Your trip is now booked", HttpStatus.OK);
    }

    @PutMapping("/updatetrip/{id}")
    private ResponseEntity<Trips> updateTrip(@PathVariable int id, @RequestBody Trips trips){
        return ResponseEntity.ok(tripsService.updateTripsById(id,trips));
    }

    @GetMapping("/mybookings")
    private List<Bookings> fetchMyBookings(@RequestBody Customers customers){
        return bookingsService.getBookingsByCustomers(customers);
    }
}
