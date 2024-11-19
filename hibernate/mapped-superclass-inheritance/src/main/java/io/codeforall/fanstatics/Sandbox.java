package io.codeforall.fanstatics;

import javax.persistence.*;

public class Sandbox {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();

        Customer customer1 = new Customer();
        Account account1 = new Account();
        customer1.setName("Cristiano");
        account1.setBalance(1000.0);

        em.getTransaction().begin();
        em.persist(customer1);
        em.getTransaction().commit();
        em.close();

        EntityManager em2 = emf.createEntityManager();

        Customer customer2 = new Customer();
        Account account2 = new Account();
        customer2.setName("Ronaldo");
        account2.setBalance(2000.0);

        em2.getTransaction().begin();
        em2.persist(customer2);
        em2.getTransaction().commit();
        em2.close();

        emf.close();
    }
}
