package com.al.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

interface Person{
    public static void main(String[] args) {
    }
}
public class TestA {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shinichi");
        System.out.println(entityManagerFactory);
    }
}
