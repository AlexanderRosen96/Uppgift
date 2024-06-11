package com.example.wigelltravels.services;

import com.example.wigelltravels.entites.Destination;
import com.example.wigelltravels.exceptions.ResourceNotFoundException;
import com.example.wigelltravels.repositores.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService implements DestinationServiceInterface{
    @Autowired
    private DestinationRepository destinationRepository;

    @Override
    public Destination updateDestinationById(int id, Destination destination) {
        Destination existningDestination = destinationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Destination", "id", id));
        if(destination.getCity() != null){
            existningDestination.setCity(destination.getCity());
        }
        if(destination.getCountry() != null){
            existningDestination.setCountry(destination.getCountry());
        }
        if(destination.getBookings() != null){
            existningDestination.setBookings(destination.getBookings());
        }
        if(destination.getTrips() != null){
            existningDestination.setTrips(destination.getTrips());
        }

        destinationRepository.save(existningDestination);
        return null;

    }

    @Override
    public void deleteDestinationById(int id) {
        destinationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("destination", "id", id));
    }

    @Override
    public Destination addDestination(Destination destination) {
        destinationRepository.save(destination);
        return destination;
    }
}
