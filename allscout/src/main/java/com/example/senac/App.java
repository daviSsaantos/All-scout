package com.example.senac;

import com.example.senac.View.LoginView;
import com.example.senac.Model.Moderador;
import com.example.senac.Model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

public class App extends JFrame {
    public static void main(String[] args) {
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        Moderador adm1 = new Moderador("Junior Loureiro", "123", "Juzz", "admin", true);
        entityManager.persist(adm1);
        Moderador adm2 = new Moderador("Lucas Laner","123","Laner","admin",true);
        entityManager.persist(adm2);
        Moderador adm3 = new Moderador("Lucas Roppa","123","Roppa","admin",true);
        entityManager.persist(adm3);
        Moderador adm4 = new Moderador("Davi Santos","123","Davi","admin",true);
        entityManager.persist(adm4);
        Usuario user1 = new Usuario("Cleiton", "123", "Rasta");
        entityManager.persist(user1);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
       
        //SwingUtilities.invokeLater(() -> {
        App frame = new App();
        frame.setTitle("AllScout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new LoginView());
        frame.pack();
        frame.setLocationRelativeTo(null); // Centralizar a janela
        frame.setVisible(true);
    };
}