package hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TestGetAllTeacherSubject {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Query query =entityManager.createQuery("select t from Teacher t");

        List<Teacher> t =query.getResultList();

        for(Teacher i : t) {
            System.out.println("Teacher id   :  "+i.getID());
            System.out.println("Teacher name  :  "+i.getNAME());
            System.out.println("Teacher brand :  "+i.getSALARY());
            System.out.println("-------------------------------------------------------");
            System.out.println();
        }

        System.out.println(t);
    }
}
