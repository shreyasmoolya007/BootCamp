package com.hs.Controller;

import com.hs.dao.TeacherDao;
import com.hs.dto.Teacher;

import java.util.Scanner;


public class TestSaveTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher t = new Teacher();
        TeacherDao teacherDao = new TeacherDao();
        System.out.println("Enter the choice\n1]Insert\n2]Delete\n3]Update\n4]Display\n5]Display All");
        int ch=sc.nextInt();

        switch(ch){
            case 1:System.out.println("Enter the Id");
                int x=sc.nextInt();
                System.out.println("Enter the Name");
                String y=sc.next();
                System.out.println("Enter the Age");
                int z=sc.nextInt();
                t.setId(x);
                t.setName(y);
                t.setAge(z);
                teacherDao.saveTeacher(t);
                break;

            case 2:
                System.out.println("Enter the Id you want to delete");
                int a=sc.nextInt();
                teacherDao.deleteTeacher(a);
                   break;

            case 3:System.out.println("Enter the Id you want to update");
                int b=sc.nextInt();
                System.out.println("Enter the Name");
                String yy=sc.next();
                System.out.println("Enter the Age");
                int zz=sc.nextInt();
                teacherDao.updateTeacher(b,yy,zz);
                   break;

            case 4:
                System.out.println("Enter the Id of which you want to display");
                int c=sc.nextInt();
                teacherDao.getTeacher(c);
                   break;

            case 5:
                teacherDao.getAllTeacher();
                break;
        }

    }
}