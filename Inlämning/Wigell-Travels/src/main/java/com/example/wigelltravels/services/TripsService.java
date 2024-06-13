package com.example.wigelltravels.services;

import com.example.wigelltravels.entites.Trips;
import com.example.wigelltravels.exceptions.ResourceNotFoundException;
import com.example.wigelltravels.repositores.TripsRepository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripsService implements TripsServiceInterface{
    private static final Logger logger = Logger.getLogger(TripsService.class);
    @Autowired
    private TripsRepository tripsRepository;
    @Autowired
    private DestinationService destinationService;

    @Override
    public List<Trips> fetchAll() {
        return tripsRepository.findAll();
    }

    @Override
    public Trips updateTripsById(int id, Trips trips) {
        Trips existningTrip = tripsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Trip", "id", id));
        if(trips.getHotalName() != null){
            existningTrip.setHotalName(trips.getHotalName());
        }
        if (trips.getDestination() != null) {
            existningTrip.setDestination(trips.getDestination());
            destinationService.updateDestinationById(existningTrip.getDestination().getId(), existningTrip.getDestination());
        }

        tripsRepository.save(existningTrip);
        logger.info("Customer updated the trip " + existningTrip.getId());
        return existningTrip;
    }
}
