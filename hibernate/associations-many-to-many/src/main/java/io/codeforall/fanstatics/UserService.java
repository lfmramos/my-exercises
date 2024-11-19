package io.codeforall.fanstatics;

import javax.persistence.*;
import java.util.*;

public class UserService {

    private EntityManagerFactory emf;

    public UserService() {
        this.emf = Persistence.createEntityManagerFactory("test");
    }

    public void persistUsersAndGroups() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Create SecurityGroup instances
        SecurityGroup group1 = new SecurityGroup();
        group1.setId(1);
        group1.setName("Admin");

        SecurityGroup group2 = new SecurityGroup();
        group2.setId(2);
        group2.setName("User");

        // Create User instances
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("john_doe");
        user1.setPassword("password123");
        user1.setSgroups(Arrays.asList(group1, group2));

        User user2 = new User();
        user2.setId(2);
        user2.setUsername("jane_doe");
        user2.setPassword("password456");
        user2.setSgroups(Arrays.asList(group1));

        // Persist SecurityGroup instances
        em.persist(group1);
        em.persist(group2);

        // Persist User instances
        em.persist(user1);
        em.persist(user2);

        em.getTransaction().commit();
        em.close();
    }

    public void fetchUsersAndGroups() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Fetch User instances
        User fetchedUser1 = em.find(User.class, 1);
        User fetchedUser2 = em.find(User.class, 2);

        // Access associated SecurityGroups
        List<SecurityGroup> user1Groups = fetchedUser1.getSgroups();
        List<SecurityGroup> user2Groups = fetchedUser2.getSgroups();

        em.getTransaction().commit();
        em.close();
    }

    public void close() {
        emf.close();
    }
}