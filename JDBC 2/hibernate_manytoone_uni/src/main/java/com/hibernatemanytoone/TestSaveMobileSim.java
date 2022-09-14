package com.hibernatemanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TestSaveMobileSim {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.setNAME("ROG");
        m1.setBRAND("Asus");

        Sim s1 = new Sim();
        s1.setSP("Jio");
        s1.setTYPE("4G");

        s1.setMob(m1);

        Sim s2 = new Sim();
        s2.setSP("BSNL");
        s2.setTYPE("4G");

        s2.setMob(m1);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(s1);
        entityManager.persist(s2);
        entityManager.persist(m1);
        entityTransaction.commit();
    }
}
