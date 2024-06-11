package com.example.wigelltravels.services;

import com.example.wigelltravels.entites.Destination;

public interface DestinationServiceInterface {

    Destination updateDestinationById (int id, Destination destination);

    void deleteDestinationById(int id);

    Destination addDestination(Destination destination);
}
