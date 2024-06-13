package com.example.wigelltravels.controllers;

import com.example.wigelltravels.entites.Customers;
import com.example.wigelltravels.entites.Destination;
import com.example.wigelltravels.services.CustomerService;
import com.example.wigelltravels.services.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class AdminController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private DestinationService destinationService;

    @GetMapping("/customers")
    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
    public List<Customers> fetchAllCustomer() {
        return customerService.fetchAllCustomer();
    }

    @PostMapping("/add-destination")
    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
    public ResponseEntity<String> addDestination(@RequestBody Destination destination) {
        destinationService.addDestination(destination);
        return new ResponseEntity<>("Customer is added", HttpStatus.OK);
    }

    @DeleteMapping("/deletedestination/{id}")
    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
    public ResponseEntity<String> deleteDestination(@PathVariable int id) {
        destinationService.deleteDestinationById(id);
        return new ResponseEntity<>("Destination is deleted", HttpStatus.OK);
    }

    @PutMapping("/updatedestination/{id}")
    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
    public ResponseEntity<Destination> updateDestination(@PathVariable int id, @RequestBody Destination destination) {
        return ResponseEntity.ok(destinationService.updateDestinationById(id, destination));
    }
}
