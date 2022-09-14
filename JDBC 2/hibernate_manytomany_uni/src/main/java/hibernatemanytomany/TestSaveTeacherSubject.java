package hibernatemanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TestSaveTeacherSubject {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        s1.setSUB_NAME("Science");
        s1.setDURATION(1);

        Subject s2 = new Subject();
        s2.setSUB_NAME("Maths");
        s2.setDURATION(2);


        List<Subject> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);


        Teacher t = new Teacher();
        t.setNAME("Gojo");
        t.setSALARY(50000);
        t.setSubjects(list);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mobile");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(s1);
        entityManager.persist(s2);
        entityManager.persist(t);
        entityTransaction.commit();
    }
}
