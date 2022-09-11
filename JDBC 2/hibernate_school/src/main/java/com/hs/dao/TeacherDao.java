package com.hs.dao;

import com.hs.dto.Teacher;

import javax.persistence.*;
import java.util.List;
import java.util.Scanner;

public class TeacherDao {


    public static void saveTeacher(Teacher t) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("teacher");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(t);
        entityTransaction.commit();
    }

    public static void deleteTeacher(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("teacher");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        Teacher t = entityManager.find(Teacher.class, id);
        entityManager.remove(t);
        entityTransaction.commit();

        System.out.println("Teacher data deleted successfully");
    }

    public static void getTeacher(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("teacher");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Teacher teacher = entityManager.find(Teacher.class, id);

        if (teacher != null) {
            System.out.println("Teacher ID :" + teacher.getId());
            System.out.println("Teacher Name :" + teacher.getName());
            System.out.println("Teacher Age :" + teacher.getAge());
        }
    }

    public static void updateTeacher(int id,String name,int age){
        Scanner scan=new Scanner(System.in);
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("teacher");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Teacher teacher = entityManager.find(Teacher.class,id);
        teacher.setName(name);
        teacher.setAge(age);

        entityTransaction.begin();
        entityManager.merge(teacher);
        entityTransaction.commit();

        System.out.println("Teacher data is updated");
    }

    public void getAllTeacher(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("teacher");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select t from Teacher t");

        List<Teacher> list=query.getResultList();

        for(Teacher t : list)
        {
            System.out.println("Teacher ID :"+t.getId());
            System.out.println("Teacher Name :"+t.getName());
            System.out.println("Teacher Age :"+t.getAge());
            System.out.println("---------------------------");
        }
    }
}
