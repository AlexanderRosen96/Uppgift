package com.example.wigelltravels.services;

import com.example.wigelltravels.entites.Bookings;
import com.example.wigelltravels.entites.Customers;

import java.util.List;

public interface BookingsServiceInterface {

    Bookings addBooking (Bookings bookings);

    List<Bookings> getBookingsByCustomers(Customers customers);
}
