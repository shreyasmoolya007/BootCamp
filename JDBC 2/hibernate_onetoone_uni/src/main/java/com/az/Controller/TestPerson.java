package com.az.Controller;

import com.az.dao.adhaarDao;
import com.az.dao.personDao;
import com.az.dto.adhaar;
import com.az.dto.person;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        person p = new person();
        adhaar a = new adhaar();
        personDao personDao = new personDao();
        adhaarDao adhaarDao = new adhaarDao();
        System.out.println("Enter the choice\n1]Insert\n2]Delete\n3]Update\n4]Display\n5]Display All");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                //System.out.println("Enter the Id");
                //int x = sc.nextInt();
                System.out.println("Enter the Name");
                String y = sc.next();
                System.out.println("Enter the Age");
                int z = sc.nextInt();
                System.out.println("Enter the Father Name");
                String u = sc.next();
                System.out.println("Enter the Number");
                long v = sc.nextLong();
//                p.setID(x);
                p.setNAME(y);
                p.setAGE(z);
                a.setFATHER_NAME(u);
                a.setNUMBER(v);
                com.az.dao.personDao.savePerson(p);
                com.az.dao.adhaarDao.saveAdhaar(a);
                break;

            case 2:System.out.println("Enter the Id you want to delete");
                int q=sc.nextInt();
                com.az.dao.personDao.deletePerson(q);
                break;

            case 3:person person=new person();
                System.out.println("Enter the Id you want to update");
                int b=sc.nextInt();
                System.out.println("Enter the Name");
                String yy=sc.next();
                System.out.println("Enter the Age");
                int zz=sc.nextInt();

                personDao persondao=new personDao();
                persondao.updatePerson(b,yy,zz);
                break;
        }
    }
}
