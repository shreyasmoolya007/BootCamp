package com.hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestGet {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teacher");
        EntityManager em =emf.createEntityManager();

        Subject s1=em.find(Subject.class, 1);

        if(s1!=null)
        {
            System.out.println("Subject id       :  "+s1.getId());
            System.out.println("Subject name     :  "+s1.getName());
            System.out.println("Subject duration :  "+s1.getDuration());

            List<Teacher> t1=s1.getT();

            for(Teacher t : t1) {
                System.out.println("Teacher id : "+t.getId());
                System.out.println("Teacher Name : "+t.getName());
                System.out.println("Teacher Salary : "+t.getSalary());
            }
        }
    }
}
