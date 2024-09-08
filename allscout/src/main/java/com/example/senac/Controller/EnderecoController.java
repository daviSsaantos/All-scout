package com.example.senac.Controller;

import com.example.senac.Model.Endereco;
import java.util.*;


public class EnderecoController {

    private List<Endereco> enderecos;

    public EnderecoController() {
        this.enderecos = new ArrayList<>();
    }

    // Método para adicionar um novo endereço
    public void criarEndereco(String cep, String cidade, String estado, String pais, String rua, String numero, String complemento) {
        Endereco novoEndereco = new Endereco(cep, cidade, estado, pais, rua, numero, complemento);
        enderecos.add(novoEndereco);
    }

    // Método para obter todos os endereços
    public List<Endereco> getEnderecos() {
        return enderecos;
    }
}

