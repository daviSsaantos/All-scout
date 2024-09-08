package com.example.senac.Controller;

import com.example.senac.Model.Contato;
import java.util.*;


public class ContatoController {

    private List<Contato> contatos;

    public ContatoController() {
        this.contatos = new ArrayList<>();
    }

    // Método para adicionar um novo contato
    public void criarContato(String nomeContato, String telefone, String email) {
        Contato novoContato = new Contato(nomeContato, telefone, email);
        contatos.add(novoContato);
    }

    // Método para obter todos os contatos
    public List<Contato> getContatos() {
        return contatos;
    }
}
