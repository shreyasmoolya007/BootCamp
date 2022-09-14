package hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TestGetTeacherSubject {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Subject sub=entityManager.find(Subject.class,1);

        if(sub!=null) {
            System.out.println("Subject id    :  " + sub.getID());
            System.out.println("Subject Name  :  " + sub.getSUB_NAME());
            System.out.println("Subject Duration :  " + sub.getDURATION());
            System.out.println("---------------------------------------------------------");
            System.out.println();


            Query query = entityManager.createQuery("select t from Teacher t");

            List<Teacher> t = query.getResultList();

            for (Teacher i : t) {
                System.out.println("Teacher id   :  " + i.getID());
                System.out.println("Teacher name  :  " + i.getNAME());
                System.out.println("Teacher Salary :  " + i.getSALARY());
                System.out.println("-------------------------------------------------------");
                System.out.println();
            }
        }

    }
}
