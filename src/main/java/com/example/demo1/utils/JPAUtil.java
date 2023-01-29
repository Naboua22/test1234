package com.example.demo1.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final String PERSISTENCE_UNIT_NAME = "medicineUnit";
    private static EntityManagerFactory factory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) {

            // JPA and Hibernate SessionFactory example
            /*EntityManagerFactory emf =
                    Persistence.createEntityManagerFactory("jpa-tutorial");
            EntityManager entityManager = emf.createEntityManager();
            // Get the Hibernate Session from the EntityManager in JPA
            Session session = entityManager.unwrap(org.hibernate.Session.class);
            SessionFactory factory = session.getSessionFactory();
            return factory;*/

            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    }

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }
}
