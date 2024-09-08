package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/* 
@Entity
@Table (name = "estatisticas")
public class Estatistica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "NOME")
    private String nome;

    @Column (name = "NUMERO_DECIMAL")
    private Float  valor;

    @Column (name = "NUMERO_INTEIRO")
    private int valor2;

    @Column (name = "TEXTO")
    private String valor3;

    @ManyToOne
    @JoinColumn(name = "ID_ATLETA")
    private Atletas atleta;
    
    public Estatistica() {
        
    }

    public Estatistica(String nome, Float valor, int valor2, String valor3) {
        this.nome = nome;
        this.valor = valor;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public int getValor2() {
        return valor2;
    }
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    public String getValor3() {
        return valor3;
    }
    public void setValor3(String valor3) {
        this.valor3 = valor3;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
*/