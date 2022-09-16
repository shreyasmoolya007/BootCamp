package com.hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestDelete {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teacher");
        EntityManager em = emf.createEntityManager();

        Teacher t11=em.find(Teacher.class, 2);

        List<Subject> list1 = t11.getSub();

        em.getTransaction().begin();

        for(Subject s: list1) {
            em.remove(s);
        }
        em.remove(t11);

        em.getTransaction().commit();

        System.out.println("Successfully deleted");
    }
}
