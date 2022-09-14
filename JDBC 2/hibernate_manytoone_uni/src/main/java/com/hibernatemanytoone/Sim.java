package com.hibernatemanytoone;

import javax.persistence.*;

@Entity
public class Sim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String SP;
    private String TYPE;

    @ManyToOne
    Mobile mob;

    public Mobile getMob() {
        return mob;
    }

    public void setMob(Mobile mob) {
        this.mob = mob;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSP() {
        return SP;
    }

    public void setSP(String SP) {
        this.SP = SP;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }
}
