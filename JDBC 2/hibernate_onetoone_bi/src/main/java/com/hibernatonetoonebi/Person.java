package com.hibernatonetoonebi;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String NAME;
    private int AGE;

    @OneToOne(mappedBy = "person")
    Adhaar adhaar;

    public Adhaar getAdhaar() {
        return adhaar;
    }

    public void setAdhaar(Adhaar adhaar) {
        this.adhaar = adhaar;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }
}
