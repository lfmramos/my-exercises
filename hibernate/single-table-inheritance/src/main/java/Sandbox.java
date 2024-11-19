import javax.persistence.*;

public class Sandbox {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();

        Vehicle vehicle1 = new Car();
        vehicle1.setMaxSpeed(250);
        vehicle1.setGears(6);

        em.getTransaction().begin();
        em.persist(vehicle1);
        em.getTransaction().commit();
        em.close();

        EntityManager em2 = emf.createEntityManager();

        Vehicle vehicle2 = new Boat();
        vehicle2.setMaxSpeed(100);
        vehicle2.setEngines(2);

        em2.getTransaction().begin();
        em2.persist(vehicle2);
        em2.getTransaction().commit();
        em2.close();

        emf.close();
    }
}