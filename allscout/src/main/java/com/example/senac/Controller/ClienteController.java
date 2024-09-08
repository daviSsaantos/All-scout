package com.example.senac.Controller;

import com.example.senac.Model.Cliente;

public class ClienteController {
        
    private Cliente cliente;

    public void criarCliente(String nome, String senha, String nomeUsuario,String identificacao) {
       
        cliente = new Cliente (nome, senha,nomeUsuario, identificacao );
        // FUTURA implementação para gravar em um banco de dados ou realizar outras operações necessárias.
    }

    public Cliente getCliente() {
        return cliente;
    }
}
