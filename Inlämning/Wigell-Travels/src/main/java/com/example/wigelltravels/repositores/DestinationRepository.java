package com.example.wigelltravels.repositores;

import com.example.wigelltravels.entites.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}
