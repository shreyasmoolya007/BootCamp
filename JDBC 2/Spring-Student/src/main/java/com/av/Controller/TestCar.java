package com.av.Controller;

import com.av.dto.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myobject.xml");
        Car car = (Car) applicationContext.getBean("mycar");
        car.playmusic.play();
    }
}
