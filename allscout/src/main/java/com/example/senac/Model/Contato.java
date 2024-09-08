package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="contatos")
public class Contato {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "ID_CONTATO")
    private long id;

    @Column (name= "NOME")
    private String nomeContato;

    @Column (name= "TELEFONE")
    private String telefone;
    
    @Column (name= "EMAIL")
    private String email;

    public Contato() {
        
    }

    public Contato(String nomeContato,String telefone, String email) {
        this.nomeContato = nomeContato;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNomeContato() {
        return nomeContato;
    }
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
}
  