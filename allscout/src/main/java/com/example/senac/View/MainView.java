package com.example.senac.View;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

import com.example.senac.Controller.AtletasController;
import com.example.senac.Model.Usuario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JPanel {
    private JPanel sidePanel;
    private JPanel panelView;
    private JButton botaoSair;
    private JButton botaoPerfil;
    private JButton botaoPesquisa;
    private JLabel logoLabel;
    private Usuario usuario;

    public MainView(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
    }

    private void initComponents() {
        // Configurações do painel principal
        setBackground(new Color(2, 31, 57));
        setForeground(new Color(2, 31, 57));
        setPreferredSize(new Dimension(800, 600));
        setLayout(new BorderLayout());

        // Painel lateral
        sidePanel = new JPanel();
        sidePanel.setBackground(new Color(0, 0, 0));
        sidePanel.setForeground(new Color(0, 110, 255));
        sidePanel.setPreferredSize(new Dimension(200, 600));

        logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/com/example/senac/View/LogoMenu.png")));

        botaoPesquisa = criarBotao("PESQUISA");
        botaoPesquisa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        botaoPerfil = criarBotao("PERFIL");
        botaoPerfil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoPerfilActionPerformed(evt);
            }
        });

        botaoSair = criarBotao("SAIR");
        botaoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        // Painel de conteúdo
        panelView = new JPanel();
        panelView.setBackground(new Color(2, 31, 57));
        panelView.setPreferredSize(new Dimension(600, 600));
        panelView.setLayout(new BorderLayout());

        // Adicionando os painéis ao painel principal
        add(sidePanel, BorderLayout.WEST);
        add(panelView, BorderLayout.CENTER);
    }

    private JButton criarBotao(String texto) {
        JButton botao = new JButton();
        botao.setBackground(new Color(0, 0, 0));
        botao.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        botao.setForeground(new Color(0, 110, 255));
        botao.setText(texto);
        botao.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 3, true));
        return botao;
    }

    private void botaoPesquisaActionPerformed(ActionEvent evt) {
        AtletasController atletasController = new AtletasController();
        SearchView searchView = new SearchView(atletasController);
        setContentPanel(searchView);
    }


    private void botaoPerfilActionPerformed(ActionEvent evt) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    AlteraDadosUserView alteraDadosUserView = new AlteraDadosUserView(usuario, null, entityManager);
    setContentPanel(alteraDadosUserView);
    }
    

    private void botaoConfigActionPerformed(ActionEvent evt) {
        JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        LoginView loginView = new LoginView();
        loginFrame.setContentPane(loginView);
        loginFrame.revalidate();
        JOptionPane.showMessageDialog(loginFrame, "Desconectado com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    /*private void setContent(String content) {
        panelView.removeAll();
        panelView.add(new JLabel(content), BorderLayout.CENTER);
        panelView.revalidate();
        panelView.repaint();
    }*/

    private void setContentPanel(JPanel panel) {
        panelView.removeAll();
        panelView.add(panel, BorderLayout.CENTER);
        panelView.revalidate();
        panelView.repaint();
    }
}
