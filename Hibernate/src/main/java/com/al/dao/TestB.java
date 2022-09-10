package com.al.dao;

import com.al.dto.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestB {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(2);
        student.setName("Kuruba");
        student.setAge(17);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shinichi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(student);
        entityTransaction.commit();
    }
}
