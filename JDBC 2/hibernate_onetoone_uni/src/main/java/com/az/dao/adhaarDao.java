package com.az.dao;

import com.az.dto.adhaar;
import com.az.dto.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class adhaarDao {
    public static void saveAdhaar(adhaar a){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(a);
        entityTransaction.commit();
    }

    public void deleteAadhaar(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        adhaar a = entityManager.find(adhaar.class, id);
        entityTransaction.begin();
        entityManager.remove(a);
        entityTransaction.commit();
    }

    public void updateAadhaarById(int id, adhaar aadhaar) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        adhaar a = entityManager.find(adhaar.class, id);
        a.setFATHER_NAME(aadhaar.getFATHER_NAME());
        a.setNUMBER(aadhaar.getNUMBER());
        entityTransaction.commit();
    }

}
