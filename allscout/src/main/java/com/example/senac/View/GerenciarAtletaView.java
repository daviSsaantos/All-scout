package com.example.senac.View;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.example.senac.Controller.AtletasController;
import com.example.senac.Model.Atletas;
import com.example.senac.Model.Usuario;

public class GerenciarAtletaView extends JPanel{

    private javax.swing.JLabel alturaLabel;
    private javax.swing.JTextField alturaTextField;
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JLabel clubeLabel;
    private javax.swing.JTextField clubeTextField;
    private javax.swing.JButton excluirBotao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPesquisa;
    private javax.swing.JList<String> listPesquisa;
    private javax.swing.JLabel nacionalidadeLabel;
    private javax.swing.JTextField nacionalidadeTextField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JLabel pernaDominanteLabel;
    private javax.swing.JTextField pernaDominanteTextField;
    private javax.swing.JLabel posicaoLabel;
    private javax.swing.JTextField posicaoTextField;
    private javax.swing.JTextField textFieldPesquisa;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel dataNascimentoLabel;
    private javax.swing.JTextField dataNascimentoTextField;


    private AtletasController atletasController;

    public GerenciarAtletaView(AtletasController atletasController) {
        this.atletasController = atletasController;
        initComponents();
    }   

    private void initComponents() {

        javax.swing.JPanel panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPesquisa = new javax.swing.JList<>();
        textFieldPesquisa = new javax.swing.JTextField();
        labelPesquisa = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        posicaoTextField = new javax.swing.JTextField();
        posicaoLabel = new javax.swing.JLabel();
        clubeTextField = new javax.swing.JTextField();
        clubeLabel = new javax.swing.JLabel();
        nacionalidadeLabel = new javax.swing.JLabel();
        nacionalidadeTextField = new javax.swing.JTextField();
        numeroTextField = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        pernaDominanteTextField = new javax.swing.JTextField();
        pernaDominanteLabel = new javax.swing.JLabel();
        alturaLabel = new javax.swing.JLabel();
        alturaTextField = new javax.swing.JTextField();
        atualizarBotao = new javax.swing.JButton();
        excluirBotao = new javax.swing.JButton();
        dataNascimentoLabel = new javax.swing.JLabel();
        dataNascimentoTextField = new javax.swing.JTextField();

        panelView.setBackground(new java.awt.Color(2, 31, 57));

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

        textFieldPesquisa.setBackground(new java.awt.Color(2, 23, 43));
        textFieldPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textFieldPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        textFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldPesquisaKeyReleased(evt);
            }
        });

        labelPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        labelPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        labelPesquisa.setText("PESQUISA:");

        tituloLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 110, 255));
        tituloLabel.setText("GERENCIAR ATLETAS");

        nomeLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomeLabel.setText("NOME");

        nomeTextField.setBackground(new java.awt.Color(2, 23, 43));
        nomeTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nomeTextField.setForeground(new java.awt.Color(255, 255, 255));
        nomeTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        posicaoTextField.setBackground(new java.awt.Color(2, 23, 43));
        posicaoTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        posicaoTextField.setForeground(new java.awt.Color(255, 255, 255));
        posicaoTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        posicaoLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        posicaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        posicaoLabel.setText("POSIÇÃO");

        clubeTextField.setBackground(new java.awt.Color(2, 23, 43));
        clubeTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        clubeTextField.setForeground(new java.awt.Color(255, 255, 255));
        clubeTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        clubeLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        clubeLabel.setForeground(new java.awt.Color(255, 255, 255));
        clubeLabel.setText("CLUBE ATUAL");

        nacionalidadeLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nacionalidadeLabel.setForeground(new java.awt.Color(255, 255, 255));
        nacionalidadeLabel.setText("NACIONALIDADE");

        dataNascimentoLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        dataNascimentoLabel.setForeground(new java.awt.Color(255, 255, 255));
        dataNascimentoLabel.setText("DATA DE NASCIMENTO");

        dataNascimentoTextField.setBackground(new java.awt.Color(2, 23, 43));
        dataNascimentoTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        dataNascimentoTextField.setForeground(new java.awt.Color(255, 255, 255));
        dataNascimentoTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        nacionalidadeTextField.setBackground(new java.awt.Color(2, 23, 43));
        nacionalidadeTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nacionalidadeTextField.setForeground(new java.awt.Color(255, 255, 255));
        nacionalidadeTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        numeroTextField.setBackground(new java.awt.Color(2, 23, 43));
        numeroTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        numeroTextField.setForeground(new java.awt.Color(255, 255, 255));
        numeroTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        numeroLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(255, 255, 255));
        numeroLabel.setText("NÚMERO");

        pernaDominanteTextField.setBackground(new java.awt.Color(2, 23, 43));
        pernaDominanteTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        pernaDominanteTextField.setForeground(new java.awt.Color(255, 255, 255));
        pernaDominanteTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        pernaDominanteLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        pernaDominanteLabel.setForeground(new java.awt.Color(255, 255, 255));
        pernaDominanteLabel.setText("PERNA DOMINANTE");

        alturaLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        alturaLabel.setForeground(new java.awt.Color(255, 255, 255));
        alturaLabel.setText("ALTURA");

        alturaTextField.setBackground(new java.awt.Color(2, 23, 43));
        alturaTextField.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        alturaTextField.setForeground(new java.awt.Color(255, 255, 255));
        alturaTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));

        atualizarBotao.setBackground(new java.awt.Color(0, 110, 255));
        atualizarBotao.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        atualizarBotao.setForeground(new java.awt.Color(255, 255, 255));
        atualizarBotao.setText("ATUALIZAR");
        atualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBotaoActionPerformed(evt);
            }
        });

        excluirBotao.setBackground(new java.awt.Color(0, 110, 255));
        excluirBotao.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        excluirBotao.setForeground(new java.awt.Color(255, 255, 255));
        excluirBotao.setText("EXCLUIR");
        excluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(tituloLabel))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alturaLabel)
                            .addComponent(dataNascimentoLabel)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(alturaTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(nomeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacionalidadeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacionalidadeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataNascimentoTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(posicaoTextField)
                                        .addComponent(posicaoLabel)
                                        .addComponent(numeroTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                                    .addComponent(numeroLabel))
                                .addGap(18, 18, 18)
                                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pernaDominanteLabel)
                                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(atualizarBotao)
                                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(clubeLabel)
                                            .addComponent(clubeTextField)
                                            .addComponent(pernaDominanteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))))
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addGap(445, 445, 445)
                                .addComponent(excluirBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(labelPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(159, 159, 159))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPesquisa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(posicaoLabel)
                    .addComponent(clubeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidadeLabel)
                    .addComponent(numeroLabel)
                    .addComponent(pernaDominanteLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pernaDominanteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(alturaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alturaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dataNascimentoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataNascimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void textFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {
        String nomePesquisado = textFieldPesquisa.getText();
        List<Atletas> atletasEncontrados = atletasController.buscarAtletasPorNome(nomePesquisado);
        atualizarListaAtletas(atletasEncontrados);
    }

    private void atualizarListaAtletas(List<Atletas> atletas) {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Atletas atleta : atletas) {
            model.addElement(atleta.getNome());
        }
        listPesquisa.setModel(model);
    }

    private void listPesquisaMouseClicked(java.awt.event.MouseEvent evt) {
    if (evt.getClickCount() == 2) {
        String selectedNome = listPesquisa.getSelectedValue();
        if (selectedNome != null) {
            Atletas atleta = atletasController.obterDetalhesAtleta(selectedNome);
            if (atleta != null) {
                preencherCampos(atleta);
                }
            }
        }
    }

    private void preencherCampos(Atletas atleta) {
        nomeTextField.setText(atleta.getNome());
        posicaoTextField.setText(atleta.getPosicao());
        clubeTextField.setText(atleta.getClubeAtual());
        nacionalidadeTextField.setText(atleta.getNacionalidade());
        numeroTextField.setText(String.valueOf(atleta.getNumeroCamisa()));
        pernaDominanteTextField.setText(atleta.getPernaDominante());
        alturaTextField.setText(String.valueOf(atleta.getAlturaCm()));
        dataNascimentoTextField.setText(atleta.getDataNasc());
    }
    

    private void atualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = nomeTextField.getText();
        String posicao = posicaoTextField.getText();
        String clubeAtual = clubeTextField.getText();
        String nacionalidade = nacionalidadeTextField.getText();
        String pernaDominante = pernaDominanteTextField.getText();
        int numeroCamisa = Integer.parseInt(numeroTextField.getText());
        int altura = Integer.parseInt(alturaTextField.getText());
        String dataNascimento = dataNascimentoTextField.getText();
    
        Atletas atleta = atletasController.obterDetalhesAtleta(nome);
        if (atleta != null) {
            atleta.setNome(nome);
            atleta.setPosicao(posicao);
            atleta.setClubeAtual(clubeAtual);
            atleta.setNacionalidade(nacionalidade);
            atleta.setPernaDominante(pernaDominante);
            atleta.setNumeroCamisa(numeroCamisa);
            atleta.setAlturaCm(altura);
            atleta.setDataNasc(dataNascimento);
    
            if (atletasController.atualizarAtleta(atleta)) {
                JOptionPane.showMessageDialog(this, "Atleta atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar o atleta!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Atleta não encontrado!");
        }
    }

    private void excluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = nomeTextField.getText();
        Atletas atleta = atletasController.obterDetalhesAtleta(nome);
        if (atleta != null) {
            int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o atleta?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                if (atletasController.excluirAtleta(atleta)) {
                    JOptionPane.showMessageDialog(this, "Atleta excluído com sucesso!");
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir o atleta!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Atleta não encontrado!");
        }
    }
    private void limparCampos() {
        nomeTextField.setText("");
        posicaoTextField.setText("");
        clubeTextField.setText("");
        nacionalidadeTextField.setText("");
        numeroTextField.setText("");
        pernaDominanteTextField.setText("");
        alturaTextField.setText("");
        dataNascimentoTextField.setText("");
    }
}
