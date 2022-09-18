package com.av.dto;

public class Teacher {
    int ID;
    String NAME;
    double SALARY;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setSALARY(double SALARY) {
        this.SALARY = SALARY;
    }

    public void display(){
        System.out.println("Teacher Id :"+ID);
        System.out.println("Teacher Name :"+NAME);
        System.out.println("Teacher Salary :"+SALARY);
    }
}
