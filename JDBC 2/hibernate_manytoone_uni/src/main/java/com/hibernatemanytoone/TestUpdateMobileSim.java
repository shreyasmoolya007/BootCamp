package com.hibernatemanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUpdateMobileSim {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mobile");
        EntityManager em = emf.createEntityManager();

        Sim s2 = em.find(Sim.class, 2);
        s2.setSP("AIRTEL");
        s2.setTYPE("3G");

        Mobile m1 = em.find(Mobile.class, 1);
        m1.setNAME("SAMSUNG");
        m1.setBRAND("OPPO");

        em.getTransaction().begin();
        em.merge(s2);

        em.merge(m1);
        em.getTransaction().commit();

    }
}
