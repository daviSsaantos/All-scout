package com.example.senac.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="enderecos")
public class Endereco {   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "ID_ENDERECO")
    private long id;

    @Column (name= "CEP")
    private String cep;

    @Column (name= "CIDADE")
    private String cidade;

    @Column (name= "ESTADO")
    private String estado;

    @Column (name= "PAIS")
    private String pais;

    @Column (name= "LOGRADOURO")
    private String rua;

    @Column (name= "NUMERO")
    private String numero;

    @Column (name= "COMPLEMENTO")
    private String complemento;

    public Endereco() {
        
    }

    public Endereco(String cep, String cidade, String estado, String pais, String rua, String numero, String complemento) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                ", logradouro='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }
}


