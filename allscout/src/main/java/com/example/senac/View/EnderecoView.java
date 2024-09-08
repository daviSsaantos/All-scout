package com.example.senac.View;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.senac.Model.Endereco;
import com.example.senac.Controller.EnderecoController;
import com.example.senac.Controller.ContatoController;
import com.example.senac.Model.Usuario;

import java.awt.*;

public class EnderecoView extends JPanel {

    private JTextField nomeRuaField;
    private JTextField nomeCidadeField;
    private JTextField numeroRuaField;
    private JTextField cepField;
    private JTextField complementoField;
    private JTextField nomePaisField;
    private JTextField nomeEstadoField;
    private CadastroUserView parentView;
    private CadastroUserView cadastroUserView;
    private JButton cadastraEndereco;
    private javax.swing.JButton botaoCadastrarEndereco;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDesign1;
    private javax.swing.JPanel jPanelDesign2;
    private javax.swing.JPanel jPanelDesign3;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelLogradouro;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelTituloEndereco;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel logoAllScout;
    private javax.swing.JTextField textFieldCidade;
    private javax.swing.JTextField textFieldComplemento;
    private javax.swing.JTextField textFieldEstado;
    private javax.swing.JTextField textFieldLogradouro;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JTextField textFieldPais;
    private javax.swing.JTextField textFieldCEP;
    private EnderecoController controller;
    


    public EnderecoView(EnderecoController controller, CadastroUserView parentView) {
        this.controller = controller;
        this.parentView = parentView;
        initUI();
    }

    private void initUI(){

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanelEndereco = new javax.swing.JPanel();
        labelTituloEndereco = new javax.swing.JLabel();
        textFieldPais = new javax.swing.JTextField();
        botaoCadastrarEndereco = new javax.swing.JButton();
        textFieldComplemento = new javax.swing.JTextField();
        labelComplemento = new javax.swing.JLabel();
        labelLogradouro = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        logoAllScout = new javax.swing.JLabel();
        jPanelDesign1 = new javax.swing.JPanel();
        jPanelDesign2 = new javax.swing.JPanel();
        jPanelDesign3 = new javax.swing.JPanel();
        labelEstado = new javax.swing.JLabel();
        textFieldEstado = new javax.swing.JTextField();
        textFieldNumero = new javax.swing.JTextField();
        textFieldCidade = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        textFieldCEP = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        textFieldLogradouro = new javax.swing.JTextField();

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
            .addGap(0, 19, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(2, 31, 57));

        jPanelEndereco.setBackground(new java.awt.Color(0, 0, 0));
        jPanelEndereco.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 110, 255)));

        labelTituloEndereco.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTituloEndereco.setForeground(new java.awt.Color(0, 110, 255));
        labelTituloEndereco.setText("ENDEREÇO DO USUÁRIO");

        textFieldPais.setBackground(new java.awt.Color(0, 0, 0));
        textFieldPais.setForeground(new java.awt.Color(0, 110, 255));
        textFieldPais.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldPais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        botaoCadastrarEndereco.setBackground(new java.awt.Color(0, 110, 255));
        botaoCadastrarEndereco.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        botaoCadastrarEndereco.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrarEndereco.setText("CADASTRAR ENDEREÇO");
        botaoCadastrarEndereco.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarEnderecoActionPerfomed(evt);
            }
        });

        textFieldComplemento.setBackground(new java.awt.Color(0, 0, 0));
        textFieldComplemento.setForeground(new java.awt.Color(0, 110, 255));
        textFieldComplemento.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldComplemento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelComplemento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelComplemento.setForeground(new java.awt.Color(0, 110, 255));
        labelComplemento.setText("COMPLEMENTO");

        labelLogradouro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLogradouro.setForeground(new java.awt.Color(0, 110, 255));
        labelLogradouro.setText("LOGRADOURO");

        labelPais.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPais.setForeground(new java.awt.Color(0, 110, 255));
        labelPais.setText("PAÍS");

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

        jPanelDesign3.setBackground(new java.awt.Color(0, 0, 0));
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

        labelEstado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(0, 110, 255));
        labelEstado.setText("ESTADO");

        textFieldEstado.setBackground(new java.awt.Color(0, 0, 0));
        textFieldEstado.setForeground(new java.awt.Color(0, 110, 255));
        textFieldEstado.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        textFieldNumero.setBackground(new java.awt.Color(0, 0, 0));
        textFieldNumero.setForeground(new java.awt.Color(0, 110, 255));
        textFieldNumero.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        textFieldCidade.setBackground(new java.awt.Color(0, 0, 0));
        textFieldCidade.setForeground(new java.awt.Color(0, 110, 255));
        textFieldCidade.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelCidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCidade.setForeground(new java.awt.Color(0, 110, 255));
        labelCidade.setText("CIDADE");

        textFieldCEP.setBackground(new java.awt.Color(0, 0, 0));
        textFieldCEP.setForeground(new java.awt.Color(0, 110, 255));
        textFieldCEP.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldCEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        labelCEP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCEP.setForeground(new java.awt.Color(0, 110, 255));
        labelCEP.setText("CEP");

        labelNumero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNumero.setForeground(new java.awt.Color(0, 110, 255));
        labelNumero.setText("NÚMERO");

        textFieldLogradouro.setBackground(new java.awt.Color(0, 0, 0));
        textFieldLogradouro.setForeground(new java.awt.Color(0, 110, 255));
        textFieldLogradouro.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldLogradouro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255)));

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(labelTituloEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEstado)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldLogradouro)
                                    .addComponent(textFieldComplemento))
                                .addGap(18, 18, 18))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(labelLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(223, 223, 223)))
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumero)
                            .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(labelComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(223, 223, 223)
                                .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                                .addComponent(jPanelDesign1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelDesign2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelDesign3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoCadastrarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelDesign2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDesign3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDesign1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(logoAllScout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(labelTituloEndereco)
                        .addGap(30, 30, 30)))
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPais)
                        .addComponent(labelEstado))
                    .addComponent(labelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogradouro)
                    .addComponent(labelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelComplemento)
                    .addComponent(labelCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(botaoCadastrarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>  
    
    
    private void botaoCadastrarEnderecoActionPerfomed(ActionEvent evt) {
        String rua = textFieldLogradouro.getText();
        String numero = textFieldNumero.getText();
        String complemento = textFieldComplemento.getText();
        String cidade = textFieldEstado.getText();
        String estado = textFieldCidade.getText();
        String pais = textFieldPais.getText();
        String cep = textFieldCEP.getText();
    
        // Verifica se todos os campos estão preenchidos
        if (rua.isEmpty() || numero.isEmpty() || complemento.isEmpty()|| cidade.isEmpty()|| estado.isEmpty()|| pais.isEmpty()|| cep.isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return; 
        }
        else{

       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Endereco end = new Endereco(cep, cidade, estado, pais, rua, numero, complemento);
        controller.criarEndereco(cep, cidade, estado, pais, rua, numero, complemento);

        entityManager.persist(end);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        JOptionPane.showMessageDialog(this, "Endereço cadastrado com sucesso!.");

        textFieldLogradouro.setText("");
        textFieldNumero.setText("");
        textFieldComplemento.setText("");
        textFieldEstado.setText("");
        textFieldCidade.setText("");
        textFieldPais.setText("");
        textFieldCEP.setText("");
        
    
        showCadastroContatoView();
        }
        
    }

    

    private void showCadastroContatoView() {
    // Obtém o frame pai do JPanel atual
    JFrame enderecoFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

    // Cria uma nova instância de ContatoView
    ContatoView contatoView = new ContatoView(new ContatoController(), this);

    // Define o conteúdo do frame como o ContatoView
    enderecoFrame.setContentPane(contatoView);

    // Revalida e redesenha o frame
    enderecoFrame.revalidate();
    enderecoFrame.repaint();
}
}