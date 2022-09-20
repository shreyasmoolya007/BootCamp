package com.av.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Branch {
    Address a;

    @Autowired
    public void setA(Address a) {
        this.a = a;
    }

    public void display(){
    a.disp();
    }
}
