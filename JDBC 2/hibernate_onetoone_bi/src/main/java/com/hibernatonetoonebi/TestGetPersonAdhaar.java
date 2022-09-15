package com.hibernatonetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonAdhaar {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("person");
        EntityManager em = emf.createEntityManager();

        Person p = em.find(Person.class, 1);

        if (p != null) {
            System.out.println("============================================");
            System.out.println("Person id:" + p.getID());
            System.out.println("Person name:" + p.getNAME());
            System.out.println("Person age:" + p.getAGE());
            System.out.println();
            System.out.println("aadhar id:" + p.getAdhaar().getID());
            System.out.println("aadhar FatherName:" + p.getAdhaar().getFATHER_NAME());
            System.out.println("aadhar number:" + p.getAdhaar().getNUMBER());
            System.out.println("============================================");

        }


    }
}
