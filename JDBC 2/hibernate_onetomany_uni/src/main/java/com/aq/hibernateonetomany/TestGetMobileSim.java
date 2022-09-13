package com.aq.hibernateonetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class TestGetMobileSim {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Mobile mobile = entityManager.find(Mobile.class,1);

        if(mobile!=null){
            System.out.println("Mobile ID :"+mobile.getID());
            System.out.println("Mobile Name :"+mobile.getNAME());
            System.out.println("Mobile Brand :"+mobile.getBRAND());

            List<Sim> list = mobile.getSims();

            for(Sim sim : list){
                System.out.println("Sim Id :"+sim.getID());
                System.out.println("Sim Service Provider :"+sim.getSP());
                System.out.println("Sim Type :"+sim.getTYPE());
                System.out.println("------------------------");
            }
        }
    }
}
