package com.example.wigelltravels.repositores;

import com.example.wigelltravels.entites.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
}
