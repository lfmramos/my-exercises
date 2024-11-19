package io.codeforall.fanstatics;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sandbox {

    public static void main(String[] args) {
        // Use the test persistence unit to configure a new
        // entity manager factory and start up JPA
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        // Open a new database connection by getting a new
        // entity manager from the entity manager factory
        EntityManager em = emf.createEntityManager();

        // Create a new Cadet entity and set its properties
        Cadet cadet1 = new Cadet();
        Cfa cfa1 = new Cfa();
        cfa1.setUnity("Porto");
        cfa1.setClass_name("fanSTATICS");
        cadet1.setName("Cristiano");
        cadet1.setAge(39);
        cadet1.setCfa(cfa1);

        // Begin a transaction, persist the Cadet entity, and commit the transaction
        em.getTransaction().begin();
        em.persist(cadet1);
        em.getTransaction().commit();

        // Close the database connection
        em.close();

        // Open a new database connection by getting a new
        // entity manager from the entity manager factory
        EntityManager em2 = emf.createEntityManager();

        // Create a new Cadet entity and set its properties
        Cadet cadet2 = new Cadet();
        Cfa cfa2 = new Cfa();
        cfa2.setUnity("Lisbon");
        cfa2.setClass_name("CTRLfreaks");
        cadet2.setName("Ronaldo");
        cadet2.setAge(39);
        cadet2.setCfa(cfa2);

        // Begin a transaction, persist the Cadet entity, and commit the transaction
        em2.getTransaction().begin();
        em2.persist(cadet2);
        em2.getTransaction().commit();

        // Close the database connection
        em2.close();

        // Shutdown JPA
        emf.close();
    }
}