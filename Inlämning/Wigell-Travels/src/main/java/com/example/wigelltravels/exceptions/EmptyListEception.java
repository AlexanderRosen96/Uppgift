package com.example.wigelltravels.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NO_CONTENT)
public class EmptyListEception extends RuntimeException{
    public EmptyListEception(String string){
        super(string);
    }
}
