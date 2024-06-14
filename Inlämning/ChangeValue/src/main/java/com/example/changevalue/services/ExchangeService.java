package com.example.changevalue.services;

import com.example.changevalue.entites.ExchangeRate;
import com.example.changevalue.repositories.ExchangeRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.ToDoubleFunction;

@Service
public class ExchangeService implements ExchangeServiceInteface {
    @Autowired
    private ExchangeRepositorie exchangeRepositorie;

    @Override
    public double exchange(ExchangeRate exchangeRate) {
        exchangeRate.setAmountInEuro(exchangeRate.getAmountInSEK()*exchangeRate.getRate());
        save(exchangeRate);
        return exchangeRate.getAmountInEuro();
    }

    @Override
    public ExchangeRate save(ExchangeRate exchangeRate) {
        exchangeRepositorie.save(exchangeRate);
        return exchangeRate;
    }
}
