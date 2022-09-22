package com.av.springbootpersonadhaar.dto;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
public class Adhaar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private long Number;
    private String fname;

    @OneToOne
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public long getNumber() {
        return Number;
    }

    public void setNumber(long number) {
        Number = number;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
}
