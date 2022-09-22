package com.av.springbootpersonadhaar.dto;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String Email;
    private String Password;
    private int Age;

    @OneToOne
    private Adhaar adhaar;

    public Adhaar getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(Adhaar adhaar) {
        this.adhaar = adhaar;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}

