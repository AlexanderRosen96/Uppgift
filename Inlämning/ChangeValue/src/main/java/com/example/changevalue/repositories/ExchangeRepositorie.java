package com.example.changevalue.repositories;

import com.example.changevalue.entites.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepositorie extends JpaRepository <ExchangeRate, Integer> {
}
