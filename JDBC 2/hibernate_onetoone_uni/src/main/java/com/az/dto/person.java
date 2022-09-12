package com.az.dto;

import javax.persistence.*;

@Entity
public class person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String NAME;
    private int AGE;

    @OneToOne
    adhaar aadar;

    public adhaar getAadar() {
        return aadar;
    }

    public void setAadar(adhaar aadar) {
        this.aadar = aadar;
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
