package com.example.senac.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.senac.Model.Usuario;
import com.example.senac.Controller.UsuarioController;

public class AlteraDadosUserView extends JPanel {

    private JButton botaoSalvar;
    private JLabel labelAlterarDados;
    private JCheckBox nomeCompletoCheckBox;
    private JTextField nomeCompletoTextField;
    private JPanel panelAlterarDados;
    private JCheckBox senhaCheckBox;
    private JTextField senhaTextField;
    private JCheckBox usernameCheckBox;
    private JTextField usernameTextField;
    private JLabel jLabel1;

    private Usuario usuario; // Adicionado para armazenar o usuário atual
    private UsuarioController controller;
    private EntityManager entityManager;

    public AlteraDadosUserView(Usuario usuario, UsuarioController controller, EntityManager entityManager) {
        this.usuario = usuario;
        this.controller = controller;
        this.entityManager = entityManager;
        initComponents();
        loadUserData();
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        panelAlterarDados = new JPanel();
        labelAlterarDados = new JLabel();
        nomeCompletoCheckBox = new JCheckBox();
        usernameTextField = new JTextField();
        senhaTextField = new JTextField();
        nomeCompletoTextField = new JTextField();
        usernameCheckBox = new JCheckBox();
        senhaCheckBox = new JCheckBox();
        botaoSalvar = new JButton();

        jLabel1.setText("jLabel1");

        setBackground(new Color(2, 31, 57));
        setPreferredSize(new Dimension(600, 600));

        panelAlterarDados.setBackground(new Color(2, 31, 57));

        labelAlterarDados.setFont(new Font("Segoe UI Black", 0, 48)); // NOI18N
        labelAlterarDados.setForeground(new Color(0, 110, 255));
        labelAlterarDados.setText("ALTERAR DADOS");

        nomeCompletoCheckBox.setBackground(new Color(2, 31, 57));
        nomeCompletoCheckBox.setForeground(new Color(0, 110, 255));
        nomeCompletoCheckBox.setAlignmentY(0.0F);
        nomeCompletoCheckBox.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        nomeCompletoCheckBox.setBorderPaintedFlat(true);
        nomeCompletoCheckBox.setContentAreaFilled(false);
        nomeCompletoCheckBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        nomeCompletoCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        nomeCompletoCheckBox.setHorizontalTextPosition(SwingConstants.CENTER);
        nomeCompletoCheckBox.setMaximumSize(new Dimension(30, 30));
        nomeCompletoCheckBox.setMinimumSize(new Dimension(30, 30));
        nomeCompletoCheckBox.setPreferredSize(new Dimension(30, 30));
        nomeCompletoCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NomeCompletoCheckBoxActionPerformed(evt);
            }
        });

        usernameTextField.setBackground(new Color(2, 31, 57));
        usernameTextField.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        usernameTextField.setForeground(new Color(0, 110, 255));
        usernameTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        usernameTextField.setEnabled(false); // Inicialmente desativado
        usernameTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        senhaTextField.setBackground(new Color(2, 31, 57));
        senhaTextField.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        senhaTextField.setForeground(new Color(0, 110, 255));
        senhaTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        senhaTextField.setEnabled(false); // Inicialmente desativado
        senhaTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SenhaTextFieldActionPerformed(evt);
            }
        });

        nomeCompletoTextField.setBackground(new Color(2, 31, 57));
        nomeCompletoTextField.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        nomeCompletoTextField.setForeground(new Color(0, 110, 255));
        nomeCompletoTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        nomeCompletoTextField.setEnabled(false); // Inicialmente desativado
        nomeCompletoTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NomeCompletoTextFieldActionPerformed(evt);
            }
        });

        usernameCheckBox.setBackground(new Color(2, 31, 57));
        usernameCheckBox.setForeground(new Color(0, 110, 255));
        usernameCheckBox.setAlignmentY(0.0F);
        usernameCheckBox.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        usernameCheckBox.setBorderPaintedFlat(true);
        usernameCheckBox.setContentAreaFilled(false);
        usernameCheckBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        usernameCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        usernameCheckBox.setHorizontalTextPosition(SwingConstants.CENTER);
        usernameCheckBox.setMaximumSize(new Dimension(30, 30));
        usernameCheckBox.setMinimumSize(new Dimension(30, 30));
        usernameCheckBox.setPreferredSize(new Dimension(30, 30));
        usernameCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UsernameCheckBoxActionPerformed(evt);
            }
        });

        senhaCheckBox.setBackground(new Color(2, 31, 57));
        senhaCheckBox.setForeground(new Color(0, 110, 255));
        senhaCheckBox.setAlignmentY(0.0F);
        senhaCheckBox.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        senhaCheckBox.setBorderPaintedFlat(true);
        senhaCheckBox.setContentAreaFilled(false);
        senhaCheckBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        senhaCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        senhaCheckBox.setHorizontalTextPosition(SwingConstants.CENTER);
        senhaCheckBox.setMaximumSize(new Dimension(30, 30));
        senhaCheckBox.setMinimumSize(new Dimension(30, 30));
        senhaCheckBox.setPreferredSize(new Dimension(30, 30));
        senhaCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SenhaCheckBoxActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new Color(0, 110, 255));
        botaoSalvar.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        botaoSalvar.setForeground(new Color(2, 31, 57));
        botaoSalvar.setText("SALVAR");
        botaoSalvar.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 1, true));
        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                salvarAlteracoes();
            }
        });

        GroupLayout PanelAlterarDadosLayout = new GroupLayout(panelAlterarDados);
        panelAlterarDados.setLayout(PanelAlterarDadosLayout);
        PanelAlterarDadosLayout.setHorizontalGroup(
            PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, PanelAlterarDadosLayout.createSequentialGroup()
                    .addContainerGap(150, Short.MAX_VALUE)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(usernameCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomeCompletoCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(senhaCheckBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoSalvar, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(nomeCompletoTextField, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
                                .addComponent(usernameTextField, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)))
                        .addComponent(senhaTextField, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE))
                    .addGap(54, 54, 54))
                .addGroup(PanelAlterarDadosLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(labelAlterarDados)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAlterarDadosLayout.setVerticalGroup(
            PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(PanelAlterarDadosLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(labelAlterarDados)
                    .addGap(65, 65, 65)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(nomeCompletoTextField, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(nomeCompletoCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(48, 48, 48)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(usernameTextField, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(usernameCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(48, 48, 48)
                    .addGroup(PanelAlterarDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(senhaTextField, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(senhaCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(53, 53, 53)
                    .addComponent(botaoSalvar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(panelAlterarDados, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelAlterarDados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
    }

    private void NomeCompletoCheckBoxActionPerformed(ActionEvent evt) {
        nomeCompletoTextField.setEnabled(nomeCompletoCheckBox.isSelected());
    }

    private void UsernameTextFieldActionPerformed(ActionEvent evt) {
    }

    private void SenhaTextFieldActionPerformed(ActionEvent evt) {
    }

    private void NomeCompletoTextFieldActionPerformed(ActionEvent evt) {
    }

    private void UsernameCheckBoxActionPerformed(ActionEvent evt) {
        usernameTextField.setEnabled(usernameCheckBox.isSelected());
    }

    private void SenhaCheckBoxActionPerformed(ActionEvent evt) {
        senhaTextField.setEnabled(senhaCheckBox.isSelected());
    }

    private void salvarAlteracoes() {
        String novoNomeCompleto = nomeCompletoTextField.getText();
        String novoUsername = usernameTextField.getText();
        String novaSenha = senhaTextField.getText();

        entityManager.getTransaction().begin();

        if (nomeCompletoCheckBox.isSelected() && !novoNomeCompleto.isEmpty()) {
            usuario.setNome(novoNomeCompleto);
        }

        if (usernameCheckBox.isSelected() && !novoUsername.isEmpty()) {
            usuario.setNomeUsuario(novoUsername);
        }

        if (senhaCheckBox.isSelected() && !novaSenha.isEmpty()) {
            usuario.setSenha(novaSenha);
        }

        entityManager.merge(usuario);
        entityManager.getTransaction().commit();

        JOptionPane.showMessageDialog(this, "Dados do usuário atualizados com sucesso.");
    }

    private void loadUserData() {
        nomeCompletoTextField.setText(usuario.getNome());
        usernameTextField.setText(usuario.getNomeUsuario());
        senhaTextField.setText("*****************");
    }
}
