package com.av.Controller;

import com.av.dto.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class J2EEContainer {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("myteacher");
        teacher.display();
    }
}
