package com.az.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class adhaar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String FATHER_NAME;
    private long NUMBER;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFATHER_NAME() {
        return FATHER_NAME;
    }

    public void setFATHER_NAME(String FATHER_NAME) {
        this.FATHER_NAME = FATHER_NAME;
    }

    public long getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(long NUMBER) {
        this.NUMBER = NUMBER;
    }
}
