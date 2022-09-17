package com.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class J2EEContainer2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Student student = (Student) applicationContext.getBean("student");
        student.setID(1);
        student.setNAME("Shinichi");
        student.setPHONE(987654321);

        System.out.println(student.getID());
        System.out.println(student.getNAME());
        System.out.println(student.getPHONE());
    }
}
