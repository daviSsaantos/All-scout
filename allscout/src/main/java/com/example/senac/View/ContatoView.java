package com.example.senac.View;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.example.senac.Controller.ContatoController;
import com.example.senac.Model.Contato;

import java.awt.*;

public class ContatoView extends JPanel {

    private JTextField nomeContatoField;
    private JTextField numTelefoneField;
    private JTextField emailField;
    private ContatoController controller;
    private CadastroUserView cadastroUserView;
    private JButton cadastraContato;
    private EnderecoView parentView;
    private javax.swing.JButton botaoCadastrarContato;
    private javax.swing.JPanel jPanelContato;
    private javax.swing.JPanel jPanelDesign1;
    private javax.swing.JPanel jPanelDesign2;
    private javax.swing.JPanel jPanelDesign3;
    private javax.swing.JLabel labelEmailContato;
    private javax.swing.JLabel labelNomeDoContato;
    private javax.swing.JLabel labelTelefoneContato;
    private javax.swing.JLabel labelTituloContato;
    private javax.swing.JLabel logoAllScout;
    private javax.swing.JTextField textFieldEmailContato;
    private javax.swing.JTextField textFieldNomeDoContato;
    private javax.swing.JTextField textFieldTelefoneContato;
    


    public ContatoView(ContatoController controller,EnderecoView parentView) {
        this.controller = controller;
        this.parentView = parentView;
        initUI();
    }

    private void initUI(){

        jPanelContato = new javax.swing.JPanel();
        labelTituloContato = new javax.swing.JLabel();
        botaoCadastrarContato = new javax.swing.JButton();
        textFieldEmailContato = new javax.swing.JTextField();
        labelEmailContato = new javax.swing.JLabel();
        logoAllScout = new javax.swing.JLabel();
        jPanelDesign1 = new javax.swing.JPanel();
        jPanelDesign2 = new javax.swing.JPanel();
        jPanelDesign3 = new javax.swing.JPanel();
        textFieldNomeDoContato = new javax.swing.JTextField();
        labelNomeDoContato = new javax.swing.JLabel();
        textFieldTelefoneContato = new javax.swing.JTextField();
        labelTelefoneContato = new javax.swing.JLabel();
        

        setBackground(new java.awt.Color(2, 31, 57));

        jPanelContato.setBackground(new java.awt.Color(0, 0, 0));
        jPanelContato.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 110, 255)));

        labelTituloContato.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTituloContato.setForeground(new java.awt.Color(0, 110, 255));
        labelTituloContato.setText("CONTATO DO USUÁRIO");

        botaoCadastrarContato.setBackground(new java.awt.Color(0, 110, 255));
        botaoCadastrarContato.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoCadastrarContato.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrarContato.setText("CADASTRAR CONTATO");
        botaoCadastrarContato.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarContatoActionPerfomed(evt);
            }

        });

        textFieldEmailContato.setBackground(new java.awt.Color(0, 0, 0));
        textFieldEmailContato.setForeground(new java.awt.Color(0, 110, 255));
        textFieldEmailContato.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldEmailContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelEmailContato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEmailContato.setForeground(new java.awt.Color(0, 110, 255));
        labelEmailContato.setText("EMAIL");

        logoAllScout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/example/senac/View/LogoCadastrar.png")));

        jPanelDesign1.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanelDesign1Layout = new javax.swing.GroupLayout(jPanelDesign1);
        jPanelDesign1.setLayout(jPanelDesign1Layout);
        jPanelDesign1Layout.setHorizontalGroup(
            jPanelDesign1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanelDesign1Layout.setVerticalGroup(
            jPanelDesign1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelDesign2.setBackground(new java.awt.Color(0, 110, 255));
        jPanelDesign2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        javax.swing.GroupLayout jPanelDesign2Layout = new javax.swing.GroupLayout(jPanelDesign2);
        jPanelDesign2.setLayout(jPanelDesign2Layout);
        jPanelDesign2Layout.setHorizontalGroup(
            jPanelDesign2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanelDesign2Layout.setVerticalGroup(
            jPanelDesign2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanelDesign3.setBackground(new java.awt.Color(0, 110, 255));
        jPanelDesign3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        javax.swing.GroupLayout jPanelDesign3Layout = new javax.swing.GroupLayout(jPanelDesign3);
        jPanelDesign3.setLayout(jPanelDesign3Layout);
        jPanelDesign3Layout.setHorizontalGroup(
            jPanelDesign3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanelDesign3Layout.setVerticalGroup(
            jPanelDesign3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        textFieldNomeDoContato.setBackground(new java.awt.Color(0, 0, 0));
        textFieldNomeDoContato.setForeground(new java.awt.Color(0, 110, 255));
        textFieldNomeDoContato.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldNomeDoContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelNomeDoContato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNomeDoContato.setForeground(new java.awt.Color(0, 110, 255));
        labelNomeDoContato.setText("NOME DO CONTATO");

        textFieldTelefoneContato.setBackground(new java.awt.Color(0, 0, 0));
        textFieldTelefoneContato.setForeground(new java.awt.Color(0, 110, 255));
        textFieldTelefoneContato.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldTelefoneContato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelTelefoneContato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTelefoneContato.setForeground(new java.awt.Color(0, 110, 255));
        labelTelefoneContato.setText("TELEFONE");

        javax.swing.GroupLayout jPanelContatoLayout = new javax.swing.GroupLayout(jPanelContato);
        jPanelContato.setLayout(jPanelContatoLayout);
        jPanelContatoLayout.setHorizontalGroup(
            jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContatoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanelDesign1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDesign2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDesign3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelContatoLayout.createSequentialGroup()
                            .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNomeDoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNomeDoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelContatoLayout.createSequentialGroup()
                                .addComponent(labelTituloContato)
                                .addGap(63, 63, 63)
                                .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(botaoCadastrarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanelContatoLayout.setVerticalGroup(
            jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContatoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelDesign2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDesign3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDesign1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContatoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContatoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTituloContato)
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addComponent(labelNomeDoContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNomeDoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTelefoneContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldTelefoneContato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelEmailContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(botaoCadastrarContato, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(jPanelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>     

    private void botaoCadastrarContatoActionPerfomed(ActionEvent evt) {
        String nomeContato = textFieldNomeDoContato.getText();
        String numTelefone = textFieldTelefoneContato.getText();
        String email = textFieldEmailContato.getText();
    
        if (nomeContato.isEmpty() || numTelefone.isEmpty() || email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return; 
        }
        else{
         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Contato contato = new Contato(nomeContato, numTelefone, email);
        controller.criarContato(nomeContato, numTelefone, email);

        entityManager.persist(contato);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        JOptionPane.showMessageDialog(this, "Endereço cadastrado com sucesso!.");

        textFieldNomeDoContato.setText("");
        textFieldTelefoneContato.setText("");
        textFieldEmailContato.setText("");
        

        showLoginView ();
        }
        
        }

        private void showLoginView (){

            JFrame contatofFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

          
            LoginView login = new LoginView();

   
            contatofFrame.setContentPane(login);


            contatofFrame.revalidate();
            contatofFrame.repaint();

        }
    }