package com.example.wigelltravels.services;

import com.example.wigelltravels.entites.Trips;

import java.util.List;

public interface TripsServiceInterface {

    List<Trips> fetchAll();

    Trips updateTripsById(int id, Trips trips);

    
}
