package com.example.senac.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.example.senac.Controller.UsuarioController;
import com.example.senac.Controller.ContatoController;
import com.example.senac.Controller.EnderecoController;

import com.example.senac.Model.Usuario;

public class CadastroUserView extends javax.swing.JPanel {

    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JLabel labelNomeCompleto;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTituloCadastro;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel logoAllScout;
    private javax.swing.JTextField textFieldNomeCompleto;
    private javax.swing.JPasswordField textFieldSenha;
    private javax.swing.JTextField textFieldUsername;


    UsuarioController controller =  new UsuarioController();

    public CadastroUserView( ) {
       
        panelCadastro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void panelCadastro() {

        JPanel jPanel1 = new javax.swing.JPanel();
        JPanel jPanel2 = new javax.swing.JPanel();
        JPanel jPanel3 = new javax.swing.JPanel();
        JPanel jPanel4 = new javax.swing.JPanel();
        textFieldUsername = new javax.swing.JTextField();
        labelTituloCadastro = new javax.swing.JLabel();
        textFieldNomeCompleto = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        textFieldSenha = new javax.swing.JPasswordField();
        labelSenha = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelNomeCompleto = new javax.swing.JLabel();
        logoAllScout = new javax.swing.JLabel();

        setBackground(new java.awt.Color(2, 31, 57));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 110, 255)));

        textFieldUsername.setBackground(new java.awt.Color(0, 0, 0));
        textFieldUsername.setForeground(new java.awt.Color(0, 110, 255));
        textFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));
        textFieldUsername.setFont(new java.awt.Font("Segoe UI Black", 0, 18));

        labelTituloCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTituloCadastro.setForeground(new java.awt.Color(0, 110, 255));
        labelTituloCadastro.setText("CADASTRO DE USUÁRIO");

        textFieldNomeCompleto.setBackground(new java.awt.Color(0, 0, 0));
        textFieldNomeCompleto.setForeground(new java.awt.Color(0, 110, 255));
        textFieldNomeCompleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));
        textFieldNomeCompleto.setFont(new java.awt.Font("Segoe UI Black", 0, 18));

        botaoCadastrar.setBackground(new java.awt.Color(0, 110, 255));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerfomed(evt);
            }
        });

        textFieldSenha.setBackground(new java.awt.Color(0, 0, 0));
        textFieldSenha.setForeground(new java.awt.Color(0, 110, 255));
        textFieldSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));
        textFieldSenha.setFont(new java.awt.Font("Segoe UI Black", 0, 18));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(0, 110, 255));
        labelSenha.setText("SENHA");

        labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(0, 110, 255));
        labelUsername.setText("USERNAME");

        labelNomeCompleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeCompleto.setForeground(new java.awt.Color(0, 110, 255));
        labelNomeCompleto.setText("NOME COMPLETO ");

        logoAllScout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/example/senac/View/LogoCadastrar.png"))); 

        jPanel2.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloCadastro)
                    .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(labelNomeCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40,40,40)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180,180,180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36,36,36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold> 

  
    private void botaoCadastrarActionPerfomed(ActionEvent evt) {
        String nomeCompleto = textFieldNomeCompleto.getText();
        String username = textFieldUsername.getText();
        String senha = new String(textFieldSenha.getPassword());
    
        if (nomeCompleto.isEmpty() || username.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Campos Vazios",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        cadastrarUsuario();
        showCadastroEnderecoView();
    }
    
    protected void cadastrarUsuario() {
        String nome = textFieldNomeCompleto.getText();
        String user = textFieldUsername.getText();
        String senha = textFieldSenha.getText();
    
        if (nome.isEmpty() || user.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        // Removendo inicializações do banco de dados
        Usuario usuario = new Usuario(nome, senha, user);
        controller.criarUsuario(nome, senha, user);
    
        JOptionPane.showMessageDialog(this, "Usuario cadastrado com sucesso.");
    
        textFieldSenha.setText("");
        textFieldUsername.setText("");
        textFieldNomeCompleto.setText("");
    }
    
    private void showCadastroEnderecoView() {
        // Obtém o frame pai do JPanel atual
        JFrame cadastroUserFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
    
        // Cria uma nova instância de EnderecoView
        EnderecoView enderecoView = new EnderecoView(new EnderecoController(), this);
    
        // Define o conteúdo do frame como o EnderecoView
        cadastroUserFrame.setContentPane(enderecoView);
    
        // Revalida e redesenha o frame
        cadastroUserFrame.revalidate();
        cadastroUserFrame.repaint();
    }
}