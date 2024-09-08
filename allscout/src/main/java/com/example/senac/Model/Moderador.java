package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "moderadores")
public class Moderador extends Usuario {

    @Column(name = "ID_MODERADORES")
    private long id;

    @Column(name = "PERMISSOES", nullable = false)
    private String permissoes;

    @Column(name = "STATUS_ATIVIDADE", nullable = false)
    private boolean statusAtividade;

    public Moderador() {

    }

    public Moderador(String nome, String senha, String nomeUsuario, String permissoes, boolean statusAtividade) {
        super(nome, senha, nomeUsuario);
        this.permissoes = permissoes;
        this.statusAtividade = statusAtividade;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }

    public boolean isStatusAtividade() {
        return statusAtividade;
    }

    public void setStatusAtividade(boolean statusAtividade) {
        this.statusAtividade = statusAtividade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}