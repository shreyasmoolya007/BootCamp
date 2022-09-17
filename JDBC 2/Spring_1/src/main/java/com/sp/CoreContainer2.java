package com.sp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CoreContainer2 {
    public static void main(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
        BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
        Student student = (Student) beanFactory.getBean("student");

        student.setID(1);
        student.setNAME("Shinichi");
        student.setPHONE(987654321);

        System.out.println(student.getID());
        System.out.println(student.getNAME());
        System.out.println(student.getPHONE());
    }
}
