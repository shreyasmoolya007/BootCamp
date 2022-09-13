package com.aq.hibernateonetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDeleteMobileSim {
    public static void main(String[] args)
    {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("mobile");
        EntityManager em=emf.createEntityManager();

        Mobile m=em.find(Mobile.class, 1);

        em.getTransaction().begin();
        em.remove(m);
        em.getTransaction().commit();
        System.out.println("Mobile entity has deleted!");
    }
}
