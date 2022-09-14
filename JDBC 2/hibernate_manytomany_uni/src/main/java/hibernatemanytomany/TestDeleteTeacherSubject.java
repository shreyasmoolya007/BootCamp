package hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestDeleteTeacherSubject {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Teacher teach = entityManager.find(Teacher.class, 1);

        List<Subject> subs = teach.getSubjects();

        entityManager.getTransaction().begin();
        entityManager.remove(teach);
        for(Subject s: subs) entityManager.remove(s);
        entityManager.getTransaction().commit();
    }
}
