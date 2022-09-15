package com.hibernatonetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestSavePersonAdhaar {

    public static EntityManager getConnection() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    public static void main(String[] args) {

        Person p = new Person();

        p.setNAME("Shinichi");
        p.setAGE(21);

        Adhaar a = new Adhaar();

        a.setFATHER_NAME("Kudo");
        a.setNUMBER(987654321);

        p.setAdhaar(a);
        a.setPerson(p);

        EntityManager e = getConnection();

        e.getTransaction().begin();

        e.persist(p);
        e.persist(a);

        e.getTransaction().commit();
    }
}
