package hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class TestUpdateTeacherSubject {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Teacher t = entityManager.find(Teacher.class,1);

        t.setNAME("All_Might");
        t.setSALARY(20000);

        List<Subject> subjects = t.getSubjects();

        System.out.println(subjects);

        subjects.get(1).setDURATION(10);

        entityManager.getTransaction().begin();

        entityManager.merge(t);
        for(Subject s: subjects)entityManager.merge(s);

        entityManager.getTransaction().commit();
    }
}
