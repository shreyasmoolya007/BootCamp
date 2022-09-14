package com.hibernatemanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TestGetMobileSim {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mobile");
        EntityManager em = emf.createEntityManager();

        Sim s=em.find(Sim.class, 1);

        if(s!=null)
        {
            System.out.println("Sim id    :  "+s.getID());
            System.out.println("Sim sp  :  "+s.getSP());
            System.out.println("Sim type :  "+s.getTYPE());
            System.out.println("---------------------------------------------------------");
            System.out.println();

            Query query = em.createQuery("select m from Mobile m");

            List<Mobile> list = query.getResultList();

            for(Mobile m : list) {
                System.out.println("Mobile id   :  "+m.getID());
                System.out.println("Mobile name  :  "+m.getNAME());
                System.out.println("Mobile brand :  "+m.getBRAND());
                System.out.println("-------------------------------------------------------");
                System.out.println();
            }
        }
    }
}
