package com.hibernateonetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestDeleteMobileSim {
    public static void main(String[] args)
    {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("mobile");
        EntityManager em=emf.createEntityManager();

        Mobile m=em.find(Mobile.class, 1);

        List<Sim> sims = m.getSims();


        em.getTransaction().begin();
        for(Sim sim:sims){
            em.remove(sim);
        }
        em.remove(m);

        em.getTransaction().commit();
        System.out.println("Mobile entity has deleted!");
    }
}
