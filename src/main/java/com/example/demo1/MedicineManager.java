package com.example.demo1;

import com.example.demo1.models.Medicine;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class MedicineManager {
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPU");
    static EntityManager entityManager = factory.createEntityManager();

    public void createEntity(){
        entityManager.getTransaction().begin();

        Medicine medicine = new Medicine();
        medicine.setName("DAMADA Jean-Luc");
        medicine.setCity("Cotonou");
        medicine.setPhoneNumber(21325825);

        entityManager.persist(medicine);

        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}