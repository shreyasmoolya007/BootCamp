package com.hibernatemanytomany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double salary;

    @ManyToMany(mappedBy = "t")
    List<Subject> sub;


    public List<Subject> getSub() {
        return sub;
    }
    public void setSub(List<Subject> sub) {
        this.sub = sub;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
