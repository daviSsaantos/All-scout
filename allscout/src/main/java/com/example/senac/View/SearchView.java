package com.example.senac.View;

import com.example.senac.Model.Atletas;
import com.example.senac.Controller.AtletasController;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.List;

public class SearchView extends JPanel {

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPesquisa;
    private javax.swing.JList<String> listPesquisa;
    private javax.swing.JPanel panelView;
    private javax.swing.JTextField textFieldPesquisa;

    private AtletasController atletasController;

    public SearchView(AtletasController atletasController) {
        this.atletasController = atletasController;
        initComponents();
    }

    private void initComponents() {

        panelView = new javax.swing.JPanel();
        labelPesquisa = new javax.swing.JLabel();
        textFieldPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPesquisa = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(800, 600));

        panelView.setBackground(new java.awt.Color(2, 31, 57));

        labelPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 20));
        labelPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        labelPesquisa.setText("PESQUISA:");

        textFieldPesquisa.setBackground(new java.awt.Color(2, 23, 43));
        textFieldPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        textFieldPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        textFieldPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        textFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldPesquisaKeyReleased(evt);
            }
        });

        listPesquisa.setBackground(new java.awt.Color(2, 23, 43));
        listPesquisa.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        listPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 110, 255), 3, true));
        listPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        listPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPesquisa);

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
                panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelViewLayout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addGroup(panelViewLayout.createSequentialGroup()
                                                .addComponent(labelPesquisa)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(164, Short.MAX_VALUE))
        );
        panelViewLayout.setVerticalGroup(
                panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelViewLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelPesquisa))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(180, Short.MAX_VALUE))
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
            String nomeSelecionado = listPesquisa.getSelectedValue();
            Atletas atletaSelecionado = atletasController.obterDetalhesAtleta(nomeSelecionado);
            if (atletaSelecionado != null) {
                abrirDetalhesAtleta(atletaSelecionado);
            } else {
                JOptionPane.showMessageDialog(this, "Atleta não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void abrirDetalhesAtleta(Atletas atleta) {
        AtletaView atletaView = new AtletaView(atleta);
        JFrame frame = new JFrame("Detalhes do Atleta");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(atletaView);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    
}
