package com.av.dto;

import com.av.dto.Config;
import com.av.dto.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonDriver {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Person p = (Person) applicationContext.getBean("person");
        p.display();
    }
}
