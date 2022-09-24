package com.av.Controller;


import com.av.dto.Employee;
import com.av.dto.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(String.valueOf(MyConfig.class));
        Employee employee = (Employee) applicationContext.getBean("employee");
        employee.display();
    }
}
