package com.hibernatonetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TestGetAllPersonAdhaar {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("person");
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("select p from Person p");

        List<Person> list = query.getResultList();

        for (Person p : list) {
            System.out.println("============================================");
            System.out.println("Person id:" + p.getID());
            System.out.println("Person name:" + p.getNAME());
            System.out.println("Person age:" + p.getAGE());
            System.out.println("============================================");
        }

        Query query1 = em.createQuery("select a from Adhaar a");

        List<Adhaar> list2 = query1.getResultList();

        for (Adhaar a : list2) {
            System.out.println("============================================");
            System.out.println("aadhar id:" + a.getID());
            System.out.println("aadhar FatherName:" + a.getFATHER_NAME());
            System.out.println("aadhar number:" + a.getNUMBER());
            System.out.println("============================================");
        }
    }
}
