package com.example.demo1;

import com.example.demo1.models.Medicine;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.demo1.utils.JPAUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Medicine medicine = new Medicine();
        medicine.setName("DAMARA Jean-Luc");
        medicine.setCity("Cotonou");
        medicine.setPhoneNumber(21325825);

        entityManager.persist(medicine);

        entityManager.getTransaction().commit();
        entityManager.close();

        JPAUtil.shutdown();
        launch();
    }
}