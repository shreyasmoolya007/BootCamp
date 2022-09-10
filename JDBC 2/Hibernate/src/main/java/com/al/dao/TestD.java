package com.al.dao;

import com.al.dto.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestD {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shinichi");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Student student = entityManager.find(Student.class,1);

        if(student != null){
            System.out.println("Student ID :"+student.getId());
            System.out.println("Student Name :"+student.getName());
            System.out.println("Student Age :"+student.getAge());
        }
    }
}
