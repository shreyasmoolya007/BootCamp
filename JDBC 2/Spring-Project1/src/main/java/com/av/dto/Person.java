package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
@Autowired
Adhaar a;

public void display(){
    System.out.println("Inside person details");
    a.number();
}
}
