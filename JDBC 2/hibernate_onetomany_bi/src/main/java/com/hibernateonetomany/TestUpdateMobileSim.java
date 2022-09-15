package com.hibernateonetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUpdateMobileSim {
    public static void main(String[] args)
    {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("mobile");
        EntityManager em=emf.createEntityManager();

        Sim sim1=em.find(Sim.class,1);
        sim1.setSP("Vi");
        sim1.setTYPE("4G");

        Sim sim2=em.find(Sim.class,2);
        sim2.setSP("airtel");
        sim2.setTYPE("3G");


        Mobile mobile=em.find(Mobile.class,3);
        mobile.setNAME("x2");
        mobile.setBRAND("Realme");

        em.getTransaction().begin();
        em.merge(sim1);
        em.merge(sim2);
        em.merge(mobile);
        em.getTransaction().commit();

        emf.close();
        em.close();

    }
}
