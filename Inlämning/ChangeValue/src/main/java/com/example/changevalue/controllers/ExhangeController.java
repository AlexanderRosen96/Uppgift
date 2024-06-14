package com.example.changevalue.controllers;

import com.example.changevalue.entites.ExchangeRate;
import com.example.changevalue.services.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExhangeController {
    @Autowired
    private ExchangeService exchangeService;

    @PostMapping("/exchange")
    public ResponseEntity<Double> exchangeValue(@RequestBody ExchangeRate exchangeRate){
        double converted = exchangeService.exchange(exchangeRate);
        return new ResponseEntity<>(converted, HttpStatus.CREATED);
    }


}
