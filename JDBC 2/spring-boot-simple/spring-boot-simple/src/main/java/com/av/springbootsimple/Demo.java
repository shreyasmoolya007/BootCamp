package com.av.springbootsimple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.LocalDateTime;

@RestController
public class Demo {

    @GetMapping("/hello")
    public String getData(){
        return "Hi Hello "+LocalDateTime.now().toString();
    }

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("Shinichi");
        student.setAge(22);
        return student;
    }

    @PostMapping("/savestudent")
    public Student saveStudent(@RequestBody Student student){
        if(student != null){
            System.out.println("Student Id :"+student.getId());
            System.out.println("Student Name :"+student.getName());
            System.out.println("Student Age :"+student.getAge());
        }
        return student;
    }
}
