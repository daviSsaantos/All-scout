package com.example.senac.Model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table (name ="clientes")
public class Cliente extends Usuario {

   
    @Column (name= "ID_CLIENTE")
    private long id;

    @Column(name="IDENTIFICACAO")
    private String identificacao;


    public Cliente() {
        super();
    }

    public Cliente(String nome, String senha, String nomeUsuario, String identificacao) {
        super(nome, senha, nomeUsuario);
        this.identificacao = identificacao;
    }

    public String getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}