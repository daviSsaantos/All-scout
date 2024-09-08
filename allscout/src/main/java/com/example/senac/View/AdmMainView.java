package com.example.senac.View;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;

import com.example.senac.Controller.AtletasController;
import com.example.senac.Controller.UsuarioController;
import com.example.senac.Model.Moderador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmMainView extends JPanel {
    private JButton botaoAddAtleta;
    private JButton botaoAgcAtleta;
    private JButton botaoAgcUsuario;
    private JButton botaoSair;
    private JLabel labelMenu;
    private JLabel labelModerador;
    private JLabel miniLogo;
    private JPanel panelView;
    private JPanel sidePanel;
    private Moderador moderador;

    public AdmMainView(Moderador moderador) {
        this.moderador = moderador;
        initComponents();
    }

    private void initComponents() {
        sidePanel = new JPanel();
        botaoAddAtleta = new JButton();
        botaoAgcAtleta = new JButton();
        botaoAgcUsuario = new JButton();
        botaoSair = new JButton();
        labelMenu = new JLabel();
        labelModerador = new JLabel();
        miniLogo = new JLabel();
        panelView = new JPanel();

        setBackground(new Color(2, 31, 57));
        setForeground(new Color(2, 31, 57));
        setPreferredSize(new Dimension(800, 600));

        sidePanel.setBackground(new Color(0, 0, 0));
        sidePanel.setForeground(new Color(0, 110, 255));
        sidePanel.setPreferredSize(new Dimension(230, 600));

        botaoAddAtleta.setBackground(new Color(0, 0, 0));
        botaoAddAtleta.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        botaoAddAtleta.setForeground(new Color(0, 110, 255));
        botaoAddAtleta.setText("ADICIONAR ATLETA");
        botaoAddAtleta.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 3, true));
        botaoAddAtleta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoAddAtletaActionPerformed(evt);
            }
        });

        botaoAgcAtleta.setBackground(new Color(0, 0, 0));
        botaoAgcAtleta.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        botaoAgcAtleta.setForeground(new Color(0, 110, 255));
        botaoAgcAtleta.setText("GERENCIAR ATLETA");
        botaoAgcAtleta.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 3, true));
        botaoAgcAtleta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoAgcAtletaActionPerformed(evt);
            }
        });

        botaoAgcUsuario.setBackground(new Color(0, 0, 0));
        botaoAgcUsuario.setFont(new Font("Segoe UI Black", 0, 18)); // NOI18N
        botaoAgcUsuario.setForeground(new Color(0, 110, 255));
        botaoAgcUsuario.setText("GERENCIAR USUÁRIO");
        botaoAgcUsuario.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 3, true));
        botaoAgcUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoAgcUsuarioActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new Color(0, 0, 0));
        botaoSair.setFont(new Font("Segoe UI Black", 0, 20)); // NOI18N
        botaoSair.setForeground(new Color(0, 110, 255));
        botaoSair.setText("DESCONECTAR");
        botaoSair.setBorder(new javax.swing.border.LineBorder(new Color(0, 110, 255), 3, true));
        botaoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        labelMenu.setFont(new Font("Segoe UI Black", 0, 48)); // NOI18N
        labelMenu.setForeground(new Color(0, 110, 255));
        labelMenu.setText("MENU");

        labelModerador.setFont(new Font("Segoe UI Black", 0, 22)); // NOI18N
        labelModerador.setForeground(new Color(0, 110, 255));
        labelModerador.setText("MODERADOR");

        miniLogo.setIcon(new ImageIcon(getClass().getResource("/com/example/senac/View/miniLogo.png")));

        GroupLayout sidePanelLayout = new GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(sidePanelLayout.createSequentialGroup()
                    .addGroup(sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(sidePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(botaoAddAtleta, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoAgcAtleta, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoAgcUsuario, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addComponent(botaoSair, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(sidePanelLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(labelModerador)
                                .addComponent(labelMenu))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(sidePanelLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(miniLogo)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(sidePanelLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(labelMenu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelModerador, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addComponent(botaoAddAtleta, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(botaoAgcAtleta, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(botaoAgcUsuario, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(botaoSair, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                    .addComponent(miniLogo)
                    .addContainerGap())
        );

        panelView.setBackground(new Color(2, 31, 57));
        panelView.setPreferredSize(new Dimension(800, 600));
        panelView.setLayout(new BorderLayout());

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addComponent(panelView, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(sidePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelView, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void botaoAddAtletaActionPerformed(ActionEvent evt) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        AtletasController atletas =  new AtletasController();
        
        AddAtletaView addAtletaView = new AddAtletaView(atletas);
        setContentPanel(addAtletaView);
    }

    private void botaoAgcAtletaActionPerformed(ActionEvent evt) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        AtletasController atletasController = new AtletasController();

        GerenciarAtletaView gerenciarAtletaView = new GerenciarAtletaView(atletasController);
        setContentPanel(gerenciarAtletaView);
    }

    private void botaoAgcUsuarioActionPerformed(ActionEvent evt) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        UsuarioController usuarioController = new UsuarioController(); // ou obtenha de alguma outra forma

        GerenciarUserView gerenciarUserView = new GerenciarUserView(usuarioController);
        setContentPanel(gerenciarUserView);
    }

    private void botaoSairActionPerformed(ActionEvent evt) {
        JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        LoginView loginView = new LoginView();
        loginFrame.setContentPane(loginView);
        loginFrame.revalidate();
        JOptionPane.showMessageDialog(loginFrame, "Desconectado com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    private void setContentPanel(JPanel panel) {
        panelView.removeAll();
        panelView.add(panel, BorderLayout.CENTER);
        panelView.revalidate();
        panelView.repaint();
    }
}
