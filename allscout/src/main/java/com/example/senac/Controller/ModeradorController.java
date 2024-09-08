package com.example.senac.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.example.senac.Model.Moderador;

public class ModeradorController {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private Moderador moderador;

    public ModeradorController() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    public void criarModerador(String nome, String senha, String nomeUsuario,String permissoes, boolean statusAtividade) {
        moderador = new Moderador (nome, senha,nomeUsuario,permissoes,statusAtividade );
        entityManager.getTransaction().begin();
        entityManager.persist(moderador);
        entityManager.getTransaction().commit();
    }

    public Moderador getModerador() {
        return moderador;
    }

    public Moderador login(String nomeUsuario, String senha) {
        try {
            TypedQuery<Moderador> query = entityManager.createQuery(
                "SELECT m FROM Moderador m WHERE m.nomeUsuario = :nomeUsuario AND m.senha = :senha", Moderador.class);
            query.setParameter("nomeUsuario", nomeUsuario);
            query.setParameter("senha", senha);
            return query.getSingleResult(); // Se encontrar um moderador, retorna-o
        } catch (NoResultException e) {
            return null; // Se não encontrar nenhum moderador, retorna null
        }
    }
}
