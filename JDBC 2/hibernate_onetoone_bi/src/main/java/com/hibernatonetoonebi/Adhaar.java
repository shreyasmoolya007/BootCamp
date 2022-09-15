package com.hibernatonetoonebi;

import javax.persistence.*;

@Entity
public class Adhaar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String FATHER_NAME;
    private long NUMBER;

    @OneToOne
    @JoinColumn
    Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

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
