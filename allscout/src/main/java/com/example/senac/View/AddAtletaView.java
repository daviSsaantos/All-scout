package com.example.senac.View;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.*;



import com.example.senac.Model.Usuario;
import com.example.senac.salvar.AtletaException;
import com.example.senac.Controller.AtletasController;


public class AddAtletaView extends JPanel{

    private javax.swing.JButton jButtonAdicionaAtleta;
    private javax.swing.JButton jButtonLimpaAddAtleta;
    private javax.swing.JLabel jLabelAlturaAddAtleta;
    private javax.swing.JLabel jLabelClubeAddAtleta;
    private javax.swing.JLabel jLabelFotoAddAtleta;
    private javax.swing.JLabel jLabelNacionalidadeAddAtleta;
    private javax.swing.JLabel jLabelNomeAddAtleta;
    private javax.swing.JLabel jLabelNumeroCamisaAddAtleta;
    private javax.swing.JLabel jLabelPernaDominanteAddAtleta;
    private javax.swing.JLabel jLabelPosicaoAddAtleta;
    private javax.swing.JLabel jLabelTituloAddAtleta;
    private javax.swing.JPanel jPanelAddAtleta;
    private javax.swing.JTextField jTextFieldAlturaAddAtleta;
    private javax.swing.JTextField jTextFieldClubeAddAtleta;
    private javax.swing.JTextField jTextFieldNacionalidadeAddAtleta;
    private javax.swing.JTextField jTextFieldNomeAddAtleta;
    private javax.swing.JTextField jTextFieldNumeroCamisaAddAtleta;
    private javax.swing.JTextField jTextFieldPernaDominanteAddAtleta;
    private javax.swing.JTextField jTextFieldPosicaoAddAtleta;
    private AtletasController controller;

    public AddAtletaView(AtletasController controller) {
        this.controller = controller;
        initComponents();
    }
    private void initComponents() {

        jPanelAddAtleta = new javax.swing.JPanel();
        jLabelTituloAddAtleta = new javax.swing.JLabel();
        jTextFieldClubeAddAtleta = new javax.swing.JTextField();
        jTextFieldPosicaoAddAtleta = new javax.swing.JTextField();
        jLabelClubeAddAtleta = new javax.swing.JLabel();
        jLabelNomeAddAtleta = new javax.swing.JLabel();
        jTextFieldNomeAddAtleta = new javax.swing.JTextField();
        jLabelPosicaoAddAtleta = new javax.swing.JLabel();
        jTextFieldNacionalidadeAddAtleta = new javax.swing.JTextField();
        jLabelNacionalidadeAddAtleta = new javax.swing.JLabel();
        jTextFieldNumeroCamisaAddAtleta = new javax.swing.JTextField();
        jTextFieldAlturaAddAtleta = new javax.swing.JTextField();
        jTextFieldPernaDominanteAddAtleta = new javax.swing.JTextField();
        jLabelPernaDominanteAddAtleta = new javax.swing.JLabel();
        jLabelAlturaAddAtleta = new javax.swing.JLabel();
        jLabelNumeroCamisaAddAtleta = new javax.swing.JLabel();
        jLabelFotoAddAtleta = new javax.swing.JLabel();
        jButtonLimpaAddAtleta = new javax.swing.JButton();
        jButtonAdicionaAtleta = new javax.swing.JButton();

        setBackground(new java.awt.Color(2, 31, 57));

        jPanelAddAtleta.setBackground(new java.awt.Color(2, 31, 57));

        jLabelTituloAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabelTituloAddAtleta.setForeground(new java.awt.Color(0, 110, 255));
        jLabelTituloAddAtleta.setText("ADICIONAR ATLETA");

        jTextFieldClubeAddAtleta.setBackground(new java.awt.Color(2, 23, 43));
        jTextFieldClubeAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextFieldClubeAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldClubeAddAtleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255), 2));

        jTextFieldPosicaoAddAtleta.setBackground(new java.awt.Color(2, 23, 43));
        jTextFieldPosicaoAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextFieldPosicaoAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPosicaoAddAtleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255), 2));

        jLabelClubeAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelClubeAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClubeAddAtleta.setText("CLUBE ATUAL");

        jLabelNomeAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelNomeAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeAddAtleta.setText("NOME");

        jTextFieldNomeAddAtleta.setBackground(new java.awt.Color(2, 23, 43));
        jTextFieldNomeAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextFieldNomeAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeAddAtleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255), 2));

        jLabelPosicaoAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelPosicaoAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPosicaoAddAtleta.setText("POSIÇÃO");

        jTextFieldNacionalidadeAddAtleta.setBackground(new java.awt.Color(2, 23, 43));
        jTextFieldNacionalidadeAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextFieldNacionalidadeAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNacionalidadeAddAtleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255), 2));

        jLabelNacionalidadeAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelNacionalidadeAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNacionalidadeAddAtleta.setText("NACIONALIDADE");

        jTextFieldNumeroCamisaAddAtleta.setBackground(new java.awt.Color(2, 23, 43));
        jTextFieldNumeroCamisaAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextFieldNumeroCamisaAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNumeroCamisaAddAtleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255), 2));

        jTextFieldAlturaAddAtleta.setBackground(new java.awt.Color(2, 23, 43));
        jTextFieldAlturaAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextFieldAlturaAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAlturaAddAtleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255), 2));

        jTextFieldPernaDominanteAddAtleta.setBackground(new java.awt.Color(2, 23, 43));
        jTextFieldPernaDominanteAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextFieldPernaDominanteAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPernaDominanteAddAtleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 255), 2));

        jLabelPernaDominanteAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelPernaDominanteAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPernaDominanteAddAtleta.setText("PERNA DOMINANTE");

        jLabelAlturaAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelAlturaAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlturaAddAtleta.setText("ALTURA");

        jLabelNumeroCamisaAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabelNumeroCamisaAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumeroCamisaAddAtleta.setText("NÚMERO");

        jLabelFotoAddAtleta.setBackground(new java.awt.Color(2, 31, 57));
        jLabelFotoAddAtleta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelFotoAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFotoAddAtleta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFotoAddAtleta.setText("FOTO ATLETA");
        jLabelFotoAddAtleta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 2, true));

        jButtonLimpaAddAtleta.setBackground(new java.awt.Color(0, 110, 255));
        jButtonLimpaAddAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButtonLimpaAddAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpaAddAtleta.setText("LIMPAR");

        jButtonAdicionaAtleta.setBackground(new java.awt.Color(0, 110, 255));
        jButtonAdicionaAtleta.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButtonAdicionaAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdicionaAtleta.setText("ADICIONAR ");
        jButtonAdicionaAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerfomed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddAtletaLayout = new javax.swing.GroupLayout(jPanelAddAtleta);
        jPanelAddAtleta.setLayout(jPanelAddAtletaLayout);
        jPanelAddAtletaLayout.setHorizontalGroup(
            jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                            .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNomeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNomeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPosicaoAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldPosicaoAddAtleta)))
                        .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                            .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelClubeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldClubeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNacionalidadeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNacionalidadeAddAtleta)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddAtletaLayout.createSequentialGroup()
                            .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNumeroCamisaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNumeroCamisaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldPernaDominanteAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelPernaDominanteAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelAlturaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldAlturaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                            .addComponent(jLabelTituloAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFotoAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButtonLimpaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdicionaAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanelAddAtletaLayout.setVerticalGroup(
            jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFotoAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                        .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                                .addComponent(jLabelNomeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNomeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                                .addComponent(jLabelPosicaoAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPosicaoAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelClubeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldClubeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAddAtletaLayout.createSequentialGroup()
                        .addComponent(jLabelNacionalidadeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNacionalidadeAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPernaDominanteAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlturaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroCamisaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumeroCamisaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPernaDominanteAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAlturaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanelAddAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpaAddAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionaAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddAtleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAddAtleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    
    private void botaoCadastrarActionPerfomed(ActionEvent evt) {
        // Obtendo os valores dos campos de texto
        String alturaStr = jTextFieldAlturaAddAtleta.getText();
        String clube = jTextFieldClubeAddAtleta.getText();
        String nacionalidade = jTextFieldNacionalidadeAddAtleta.getText();
        String nome = jTextFieldNomeAddAtleta.getText();
        String numeroStr = jTextFieldNumeroCamisaAddAtleta.getText();
        String perna = jTextFieldPernaDominanteAddAtleta.getText();
        String posicao = jTextFieldPosicaoAddAtleta.getText();

        // Verifica se algum campo está vazio
        if (clube.isEmpty() || nacionalidade.isEmpty() || nome.isEmpty() || perna.isEmpty() || posicao.isEmpty() || alturaStr.isEmpty() || numeroStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return; // Sai do método se algum campo estiver vazio
        }

        try {
            // Converte os valores de altura e número para int
            int altura = Integer.parseInt(alturaStr);
            int numero = Integer.parseInt(numeroStr);

            // Chama o método do controlador para criar o atleta
            controller.criarAtleta(nome, "1990-01-01", clube, perna, posicao, nacionalidade, numero, altura); // Supondo uma data de nascimento fictícia
            JOptionPane.showMessageDialog(this, "Atleta salvo com sucesso!");

            // Limpa os campos de texto
            jTextFieldAlturaAddAtleta.setText("");
            jTextFieldClubeAddAtleta.setText("");
            jTextFieldNacionalidadeAddAtleta.setText("");
            jTextFieldNomeAddAtleta.setText("");
            jTextFieldNumeroCamisaAddAtleta.setText("");
            jTextFieldPernaDominanteAddAtleta.setText("");
            jTextFieldPosicaoAddAtleta.setText("");

        } catch (NumberFormatException e) {
            // Mostra uma mensagem de erro se a conversão falhar
            JOptionPane.showMessageDialog(this, "Por favor, insira um número válido para altura e número da camisa.");
        } catch (AtletaException e) {
            // Mostra uma mensagem de erro se o atleta já estiver cadastrado
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    /* 
    private void botaoAddAgenciadorActionPerformed(java.awt.event.ActionEvent evt) {
    }  

    private void botaoAddEstatisticaActionPerformed(java.awt.event.ActionEvent evt) {
    }*/
}
