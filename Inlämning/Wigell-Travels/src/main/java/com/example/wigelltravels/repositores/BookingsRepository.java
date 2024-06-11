package com.example.wigelltravels.repositores;

import com.example.wigelltravels.entites.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingsRepository extends JpaRepository <Bookings, Integer> {
}
