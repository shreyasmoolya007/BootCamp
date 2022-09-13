package com.aq.hibernateonetomany;

import javax.persistence.*;
import java.util.List;

public class TestGetAllMobileAndSim {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Query query =entityManager.createQuery("select m from Mobile m");
        List<Mobile> mobiles=query.getResultList();

        for (Mobile mobile:mobiles) {
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
