package com.example.senac.View;

import com.example.senac.Controller.UsuarioController;
import com.example.senac.Controller.ModeradorController;
import com.example.senac.Model.Usuario;
import com.example.senac.Model.Moderador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class LoginView extends javax.swing.JPanel {
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNaoTenhoConta;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel logoAllScout;
    private javax.swing.JPasswordField textFieldSenha;
    private javax.swing.JTextField textFieldUsername;
    private UsuarioController usuarioController;
    private ModeradorController moderadorController;

    public LoginView() {
        initComponents();
        usuarioController = new UsuarioController();
        moderadorController = new ModeradorController();
    }
                     
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        labelSenha = new javax.swing.JLabel();
        logoAllScout = new javax.swing.JLabel();
        textFieldSenha = new javax.swing.JPasswordField();
        labelUsername = new javax.swing.JLabel();
        textFieldUsername = new javax.swing.JTextField();
        botaoLogin = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        labelNaoTenhoConta = new javax.swing.JLabel();

        setBackground(new java.awt.Color(2, 31, 57));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 110, 255)));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(0, 110, 255));
        labelSenha.setText("SENHA");

        logoAllScout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/example/senac/View/Login.png")));

        textFieldSenha.setBackground(new java.awt.Color(0, 0, 0));
        textFieldSenha.setForeground(new java.awt.Color(0, 110, 255));
        textFieldSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));
        textFieldSenha.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(0, 110, 255));
        labelUsername.setText("USERNAME");

        textFieldUsername.setBackground(new java.awt.Color(0, 0, 0));
        textFieldUsername.setForeground(new java.awt.Color(0, 110, 255));
        textFieldUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));
        textFieldUsername.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N

        botaoLogin.setBackground(new java.awt.Color(0, 110, 255));
        botaoLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoLogin.setForeground(new java.awt.Color(0, 0, 0));
        botaoLogin.setText("LOGIN");
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(textFieldSenha.getPassword());
                
                try {
                    Moderador moderador = moderadorController.login(username, password);
                    Usuario usuario = usuarioController.login(username, password);
        
                    if (moderador != null) {
                        showAdmMainView(moderador);
                    } else if (usuario != null) {
                        showMainView(usuario);
                    } else {
                        JOptionPane.showMessageDialog(LoginView.this, "Credenciais inválidas.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(LoginView.this, "Ocorreu um erro durante o login.", "Erro", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace(); // Isso é apenas para depuração. Considere lidar com isso de forma mais apropriada em um ambiente de produção.
                }
            }
        });
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelSenha)
                            .addComponent(textFieldSenha)
                            .addComponent(labelUsername)
                            .addComponent(textFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                            .addComponent(botaoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        botaoCadastrar.setBackground(new java.awt.Color(0, 110, 255));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCadastroUserView();
            }
        });

        labelNaoTenhoConta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNaoTenhoConta.setForeground(new java.awt.Color(0, 110, 255));
        labelNaoTenhoConta.setText("NÃO TENHO CONTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelNaoTenhoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(labelNaoTenhoConta))
                .addGap(48, 48, 48))
        );
    }// </editor-fold> 
    
    private void showMainView(Usuario usuario) {
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        MainView mainView = new MainView(usuario);
        mainFrame.setContentPane(mainView);
        mainFrame.revalidate();
    }

    private void showAdmMainView(Moderador moderador) {
        JFrame admMainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        AdmMainView admMainView = new AdmMainView(moderador);
        admMainFrame.setContentPane(admMainView);
        admMainFrame.revalidate();
    }

    private void showCadastroUserView() {
        JFrame cadastroFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        CadastroUserView cadastroView = new CadastroUserView();
        cadastroFrame.setContentPane(cadastroView);
        cadastroFrame.revalidate();
        cadastroFrame.repaint();
    }                  
}