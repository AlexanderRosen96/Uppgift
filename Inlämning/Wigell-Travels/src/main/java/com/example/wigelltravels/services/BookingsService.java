package com.example.wigelltravels.services;

import org.apache.log4j.Logger;
import com.example.wigelltravels.entites.Bookings;
import com.example.wigelltravels.entites.Customers;
import com.example.wigelltravels.exceptions.EmptyListEception;
import com.example.wigelltravels.exceptions.ResourceNotFoundException;
import com.example.wigelltravels.repositores.BookingsRepository;
import com.example.wigelltravels.repositores.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


@Service
public class BookingsService implements BookingsServiceInterface{
    private static final Logger logger = Logger.getLogger(BookingsService.class);

    @Autowired
    private BookingsRepository bookingsRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Bookings addBooking(Bookings bookings) {
        bookingsRepository.save(bookings);
        logger.info("Customer created booking " + bookings.getId());
        return bookings;
    }

    @Override
    public List<Bookings> getBookingsByCustomers(Customers customers) {
        Customers existingCustomer = customerRepository.findById(customers.getIdNumber()).orElseThrow(() -> new ResourceNotFoundException("Customer", "id", customers.getIdNumber()));
        if(existingCustomer != null) {
            if (!existingCustomer.getBookingsList().isEmpty()) {
                return existingCustomer.getBookingsList();
            }
            throw new EmptyListEception("The list is empty");
        }
        else {
            return Collections.emptyList();
        }
    }
}
