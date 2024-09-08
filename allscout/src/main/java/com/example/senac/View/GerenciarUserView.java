package com.example.senac.View;

import java.util.List;
import javax.swing.*;
import com.example.senac.Controller.UsuarioController;
import com.example.senac.Model.Usuario;

public class GerenciarUserView extends JPanel {
    private javax.swing.JButton addUserBotao;
    private javax.swing.JButton excluirUserBotao;
    private javax.swing.JButton pesquisarBotao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> listPesquisa;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JTextField textFieldPesquisa;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel userLabel;

    private UsuarioController usuarioController;
    private Usuario usuarioSelecionado;

    public GerenciarUserView(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
        initComponents();
    }

    private void initComponents() {
        javax.swing.JPanel panelView = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        textFieldPesquisa = new javax.swing.JTextField();
        pesquisarBotao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPesquisa = new javax.swing.JList<>();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        excluirUserBotao = new javax.swing.JButton();
        addUserBotao = new javax.swing.JButton();
        senhaPasswordField = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(800, 600));

        panelView.setBackground(new java.awt.Color(2, 31, 57));

        tituloLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 110, 255));
        tituloLabel.setText("GERENCIAR USUÁRIOS");

        textFieldPesquisa.setBackground(new java.awt.Color(2, 23, 43));
        textFieldPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textFieldPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        textFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldPesquisaKeyReleased(evt);
            }
        });

        pesquisarBotao.setBackground(new java.awt.Color(0, 110, 255));
        pesquisarBotao.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        pesquisarBotao.setForeground(new java.awt.Color(255, 255, 255));
        pesquisarBotao.setText("PESQUISAR");
        

        listPesquisa.setBackground(new java.awt.Color(2, 23, 43));
        listPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        listPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        listPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        listPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPesquisa);

        nomeLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("NOME COMPLETO");

        nomeTextField.setBackground(new java.awt.Color(2, 23, 43));
        nomeTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nomeTextField.setForeground(new java.awt.Color(255, 255, 255));
        nomeTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        userLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("USERNAME");

        jTextField1.setBackground(new java.awt.Color(2, 23, 43));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        senhaLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(255, 255, 255));
        senhaLabel.setText("SENHA");

        excluirUserBotao.setBackground(new java.awt.Color(0, 110, 255));
        excluirUserBotao.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        excluirUserBotao.setForeground(new java.awt.Color(255, 255, 255));
        excluirUserBotao.setText("EXCLUIR USER");
        excluirUserBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUserBotaoActionPerformed(evt);
            }
        });

        addUserBotao.setBackground(new java.awt.Color(0, 110, 255));
        addUserBotao.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        addUserBotao.setForeground(new java.awt.Color(255, 255, 255));
        addUserBotao.setText("INCLUIR USER");
        addUserBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBotaoActionPerformed(evt);
            }
        });

        senhaPasswordField.setBackground(new java.awt.Color(2, 23, 43));
        senhaPasswordField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        senhaPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        senhaPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(excluirUserBotao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addUserBotao))
                            .addComponent(senhaLabel)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userLabel)
                                .addComponent(nomeLabel)
                                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nomeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                                        .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pesquisarBotao))
                                    .addComponent(jTextField1)
                                    .addComponent(senhaPasswordField)))))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(tituloLabel)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluirUserBotao)
                    .addComponent(addUserBotao))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void atualizarListaUsuarios(List<Usuario> usuarios) {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Usuario usuario : usuarios) {
            model.addElement(usuario.getNome());
        }
        listPesquisa.setModel(model);
    }

    private void listPesquisaMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            String nomeSelecionado = listPesquisa.getSelectedValue();
            usuarioSelecionado = usuarioController.buscarUsuariosPorNome(nomeSelecionado).get(0); //Assuming first result for now

            if (usuarioSelecionado != null) {
                nomeTextField.setText(usuarioSelecionado.getNome());
                jTextField1.setText(usuarioSelecionado.getNomeUsuario());
                senhaPasswordField.setText(usuarioSelecionado.getSenha());
            }
        }
    }

    private void textFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {
        String nomePesquisado = textFieldPesquisa.getText();
        List<Usuario> usuariosEncontrados = usuarioController.buscarUsuariosPorNome(nomePesquisado);
        atualizarListaUsuarios(usuariosEncontrados);
    }

    private void addUserBotaoActionPerformed(java.awt.event.ActionEvent evt) {
        String nomeCompleto = nomeTextField.getText();
        String username = jTextField1.getText();
        String senha = new String(senhaPasswordField.getPassword());

        usuarioController.criarUsuario(nomeCompleto, senha, username);
        JOptionPane.showMessageDialog(this, "Usuário salvo com sucesso!");

        // Limpa os campos após salvar
        nomeTextField.setText("");
        jTextField1.setText("");
        senhaPasswordField.setText("");

        // Atualiza a lista de usuários
        List<Usuario> usuarios = usuarioController.buscarUsuariosPorNome("");
        atualizarListaUsuarios(usuarios);
    }

    private void excluirUserBotaoActionPerformed(java.awt.event.ActionEvent evt) {
        if (usuarioSelecionado != null) {
            usuarioController.excluirUsuario(usuarioSelecionado);
            JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso!");

            // Limpa os campos após excluir
            nomeTextField.setText("");
            jTextField1.setText("");
            senhaPasswordField.setText("");

            // Atualiza a lista de usuários
            List<Usuario> usuarios = usuarioController.buscarUsuariosPorNome("");
            atualizarListaUsuarios(usuarios);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum usuário selecionado!");
        }
    }
}
