package com.example.senac.Controller;

import com.example.senac.Model.Usuario;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;;

public class UsuarioController {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private Usuario usuario;

    public UsuarioController() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }

    public void criarUsuario(String nome, String senha, String nomeUsuario) {
        Usuario usuario = new Usuario(nome, senha, nomeUsuario);
        adicionarUsuario(usuario);
    }

    private void adicionarUsuario(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
    }

    public void excluirUsuario(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(usuario) ? usuario : entityManager.merge(usuario));
        entityManager.getTransaction().commit();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Usuario> buscarUsuariosPorNome(String nome) {
        TypedQuery<Usuario> query = entityManager.createQuery(
                "SELECT a FROM Usuario a WHERE lower(a.nome) LIKE lower(:nome)", Usuario.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    public Usuario login(String nomeUsuario, String senha) {
        try {
            TypedQuery<Usuario> query = entityManager.createQuery(
                "SELECT u FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario AND u.senha = :senha", Usuario.class);
            query.setParameter("nomeUsuario", nomeUsuario);
            query.setParameter("senha", senha);
            return query.getSingleResult(); // Se encontrar um usuário, retorna-o
        } catch (NoResultException e) {
            return null; // Se não encontrar nenhum usuário, retorna null
        }
    }
}