package com.hibernateonetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TestSaveMobileSim {
    public static void main(String[] args) {
        Sim s1 = new Sim();
        s1.setSP("Jio");
        s1.setTYPE("4G");

        Sim s2 = new Sim();
        s2.setSP("BSNL");
        s2.setTYPE("4G");

        List<Sim> list = new ArrayList<Sim>();
        list.add(s1);
        list.add(s2);

        Mobile m1 = new Mobile();
        m1.setNAME("ROG");
        m1.setBRAND("Asus");

        m1.setSims(list);
        s1.setMobile(m1);
        s2.setMobile(m1);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(m1);
        entityManager.persist(s1);
        entityManager.persist(s2);
        entityTransaction.commit();
    }
}
