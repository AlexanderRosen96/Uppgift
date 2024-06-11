package com.example.wigelltravels.repositores;

import com.example.wigelltravels.entites.Trips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripsRepository extends JpaRepository<Trips, Integer> {
}
