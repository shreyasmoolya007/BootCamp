package com.hibernatonetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDeletePersonAdhaar {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("person");
        EntityManager em=emf.createEntityManager();

        Person p=em.find(Person.class,0);

        Adhaar a=p.getAdhaar();

        em.getTransaction().begin();
        em.remove(p);
        em.remove(a);
        em.getTransaction().commit();

    }
}
