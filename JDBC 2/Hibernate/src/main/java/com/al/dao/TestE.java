package com.al.dao;

import com.al.dto.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestE {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shinichi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Student student = entityManager.find(Student.class,2);
        student.setName("Shinichi");
        student.setAge(20);

        entityTransaction.begin();
        entityManager.merge(student);
        entityTransaction.commit();

        System.out.println("Student data is updated");
    }
}
