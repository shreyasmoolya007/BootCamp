package com.hibernatonetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestUpdatePersonAdhaar {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("person");
        EntityManager em = emf.createEntityManager();

        Person p = em.find(Person.class, 2);
        p.setAGE(23);
        p.setNAME("Kaito");

        Adhaar a = em.find(Adhaar.class, 2);
        a.setFATHER_NAME("Kuruba");
        a.setNUMBER(987456123);

        em.getTransaction().begin();
        em.merge(p);
        em.merge(a);
        em.getTransaction().commit();

    }
}
