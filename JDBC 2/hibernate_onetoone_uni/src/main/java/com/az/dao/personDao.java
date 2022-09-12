package com.az.dao;

import com.az.dto.adhaar;
import com.az.dto.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class personDao {
    public static void savePerson(person p){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(p);
        entityTransaction.commit();
    }

    public static void deletePerson(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        person p = entityManager.find(person.class, id);
        int aadhaarId = p.getAadar().getID();

        entityTransaction.begin();
        entityManager.remove(p);
        entityTransaction.commit();
        adhaarDao aadhaarDao = new adhaarDao();
        aadhaarDao.deleteAadhaar(aadhaarId);
    }

    public void updatePersonById(int id, person person, adhaar aadhaar) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("person");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        person person1 = entityManager.find(person.class, id);

        entityTransaction.begin();
        person1.setNAME(person.getNAME());
        person1.setAGE(person.getAGE());
        entityTransaction.commit();

        adhaarDao aadharDao = new adhaarDao();
        aadharDao.updateAadhaarById(person1.getAadar().getID(), aadhaar);

    }
}
