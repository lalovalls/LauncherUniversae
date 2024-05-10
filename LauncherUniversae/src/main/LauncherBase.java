/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LauncherBase extends javax.swing.JFrame {
    
    
    
    public HomeController CreateHomeController(int index, LauncherBase launcherBase){
        HomeController home = new HomeController();
        home.setSize(1540, 870);
        home.setLocation(0,0);
        home.parent = launcherBase;
        home.indiceGradoActual = index;
        return home;
}

    public void PaintHomeController(JComponent component) {
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        content.removeAll();
        content.add(component, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
}

    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon ( image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
    }
    
        
    public LauncherBase() {
        initComponents();
     
        this.setLocationRelativeTo(this);
        HomeController home = CreateHomeController(0, this);
        PaintHomeController(home);

        
    }

      

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Escudo0 = new javax.swing.JLabel();
        Escudo1 = new javax.swing.JLabel();
        Escudo2 = new javax.swing.JLabel();
        Escudo3 = new javax.swing.JLabel();
        Escudo4 = new javax.swing.JLabel();
        Escudo5 = new javax.swing.JLabel();
        Escudo6 = new javax.swing.JLabel();
        Escudo7 = new javax.swing.JLabel();
        Escudo8 = new javax.swing.JLabel();
        Escudo13 = new javax.swing.JLabel();
        Escudo9 = new javax.swing.JLabel();
        Escudo10 = new javax.swing.JLabel();
        Escudo11 = new javax.swing.JLabel();
        Escudo12 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        PaginaWeb = new javax.swing.JLabel();
        Youtube = new javax.swing.JLabel();
        Twitch = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        Instagram = new javax.swing.JLabel();
        Tiktok = new javax.swing.JLabel();
        Facebook = new javax.swing.JLabel();
        LinkedIN = new javax.swing.JLabel();
        BtnExit = new javax.swing.JPanel();
        BtnExitTxt = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escudo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton0.png"))); // NOI18N
        Escudo0.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo0.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo0.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo0.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo0MouseExited(evt);
            }
        });
        bg.add(Escudo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        Escudo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton1.png"))); // NOI18N
        Escudo1.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo1.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo1.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo1.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo1MouseExited(evt);
            }
        });
        bg.add(Escudo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        Escudo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton2.png"))); // NOI18N
        Escudo2.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo2.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo2.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo2.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo2MouseExited(evt);
            }
        });
        bg.add(Escudo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, -1, -1));

        Escudo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton3.png"))); // NOI18N
        Escudo3.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo3.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo3.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo3.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo3MouseExited(evt);
            }
        });
        bg.add(Escudo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        Escudo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton4.png"))); // NOI18N
        Escudo4.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo4.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo4.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo4.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo4MouseExited(evt);
            }
        });
        bg.add(Escudo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, -1, -1));

        Escudo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton5.png"))); // NOI18N
        Escudo5.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo5.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo5.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo5.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo5MouseExited(evt);
            }
        });
        bg.add(Escudo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 80, -1, -1));

        Escudo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton6.png"))); // NOI18N
        Escudo6.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo6.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo6.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo6.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo6MouseExited(evt);
            }
        });
        bg.add(Escudo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, -1, -1));

        Escudo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton7.png"))); // NOI18N
        Escudo7.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo7.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo7.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo7.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo7MouseExited(evt);
            }
        });
        bg.add(Escudo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 80, -1, -1));

        Escudo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton8.png"))); // NOI18N
        Escudo8.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo8.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo8.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo8.setName(""); // NOI18N
        Escudo8.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo8MouseExited(evt);
            }
        });
        bg.add(Escudo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));
        Escudo8.getAccessibleContext().setAccessibleName("");
        Escudo8.getAccessibleContext().setAccessibleDescription("");

        Escudo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton13.png"))); // NOI18N
        Escudo13.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo13.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo13.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo13.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo13MouseExited(evt);
            }
        });
        bg.add(Escudo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 80, -1, -1));

        Escudo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton9.png"))); // NOI18N
        Escudo9.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo9.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo9.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo9.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo9MouseExited(evt);
            }
        });
        bg.add(Escudo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 80, -1, -1));

        Escudo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton10.png"))); // NOI18N
        Escudo10.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo10.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo10.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo10.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo10MouseExited(evt);
            }
        });
        bg.add(Escudo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 80, -1, -1));

        Escudo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton11.png"))); // NOI18N
        Escudo11.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo11.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo11.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo11.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo11MouseExited(evt);
            }
        });
        bg.add(Escudo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 80, -1, -1));

        Escudo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton12.png"))); // NOI18N
        Escudo12.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo12.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo12.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo12.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Escudo12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo12MouseExited(evt);
            }
        });
        bg.add(Escudo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 80, -1, -1));

        content.setMaximumSize(new java.awt.Dimension(1540, 870));
        content.setMinimumSize(new java.awt.Dimension(1540, 870));
        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );

        bg.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 1540, 870));

        PaginaWeb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PaginaWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaginaWebMouseClicked(evt);
            }
        });
        bg.add(PaginaWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 180, 40));

        Youtube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Youtube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YoutubeMouseClicked(evt);
            }
        });
        bg.add(Youtube, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 150, 40));

        Twitch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Twitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TwitchMouseClicked(evt);
            }
        });
        bg.add(Twitch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 170, 50));

        X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });
        bg.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 140, 40));

        Instagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InstagramMouseClicked(evt);
            }
        });
        bg.add(Instagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 140, 40));

        Tiktok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tiktok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TiktokMouseClicked(evt);
            }
        });
        bg.add(Tiktok, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 130, 40));

        Facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacebookMouseClicked(evt);
            }
        });
        bg.add(Facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 130, 50));

        LinkedIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LinkedIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkedINMouseClicked(evt);
            }
        });
        bg.add(LinkedIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 130, 50));

        BtnExit.setBackground(new java.awt.Color(10, 38, 72));
        BtnExit.setForeground(new java.awt.Color(255, 255, 255));
        BtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExitMouseClicked(evt);
            }
        });

        BtnExitTxt.setBackground(new java.awt.Color(69, 184, 172));
        BtnExitTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BtnExitTxt.setForeground(new java.awt.Color(69, 184, 172));
        BtnExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnExitTxt.setText("x");
        BtnExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnExitLayout = new javax.swing.GroupLayout(BtnExit);
        BtnExit.setLayout(BtnExitLayout);
        BtnExitLayout.setHorizontalGroup(
            BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnExitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BtnExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BtnExitLayout.setVerticalGroup(
            BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnExitLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BtnExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bg.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1850, 10, 60, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBase.png"))); // NOI18N
        bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Escudo0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo0MouseEntered
         Escudo0.setSize(113, 121);
        SetImageLabel(Escudo0, "src/imagenes/LauncherButton0.png");
    }//GEN-LAST:event_Escudo0MouseEntered

    private void Escudo0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo0MouseExited
        Escudo0.setSize(103, 111);
        SetImageLabel(Escudo0, "src/imagenes/LauncherButton0.png");
    }//GEN-LAST:event_Escudo0MouseExited

    private void Escudo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseEntered
        Escudo1.setSize(113, 121);
        SetImageLabel(Escudo1, "src/imagenes/LauncherButton1.png");
    }//GEN-LAST:event_Escudo1MouseEntered

    private void Escudo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseExited
        Escudo1.setSize(103, 111);
        SetImageLabel(Escudo1, "src/imagenes/LauncherButton1.png");
    }//GEN-LAST:event_Escudo1MouseExited

    private void Escudo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseEntered
        Escudo2.setSize(113, 121);
        SetImageLabel(Escudo2, "src/imagenes/LauncherButton2.png");
    }//GEN-LAST:event_Escudo2MouseEntered

    private void Escudo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseExited
        Escudo2.setSize(103, 111);
        SetImageLabel(Escudo2, "src/imagenes/LauncherButton2.png");
    }//GEN-LAST:event_Escudo2MouseExited

    private void Escudo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseEntered
        Escudo3.setSize(113, 121);
        SetImageLabel(Escudo3, "src/imagenes/LauncherButton3.png");
    }//GEN-LAST:event_Escudo3MouseEntered

    private void Escudo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseExited
        Escudo3.setSize(103, 111);
        SetImageLabel(Escudo3, "src/imagenes/LauncherButton3.png");
    }//GEN-LAST:event_Escudo3MouseExited

    private void Escudo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseEntered
        Escudo4.setSize(113, 121);
        SetImageLabel(Escudo4, "src/imagenes/LauncherButton4.png");
    }//GEN-LAST:event_Escudo4MouseEntered

    private void Escudo4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseExited
        Escudo4.setSize(103, 111);
        SetImageLabel(Escudo4, "src/imagenes/LauncherButton4.png");
    }//GEN-LAST:event_Escudo4MouseExited

    private void Escudo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseEntered
        Escudo5.setSize(113, 121);
        SetImageLabel(Escudo5, "src/imagenes/LauncherButton5.png");
    }//GEN-LAST:event_Escudo5MouseEntered

    private void Escudo5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseExited
        Escudo5.setSize(103, 111);
        SetImageLabel(Escudo5, "src/imagenes/LauncherButton5.png");
    }//GEN-LAST:event_Escudo5MouseExited

    private void Escudo6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseEntered
        Escudo6.setSize(113, 121);
        SetImageLabel(Escudo6, "src/imagenes/LauncherButton6.png");
    }//GEN-LAST:event_Escudo6MouseEntered

    private void Escudo6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseExited
        Escudo6.setSize(103, 111);
        SetImageLabel(Escudo6, "src/imagenes/LauncherButton6.png");
    }//GEN-LAST:event_Escudo6MouseExited

    private void Escudo7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseEntered
        Escudo7.setSize(113, 121);
        SetImageLabel(Escudo7, "src/imagenes/LauncherButton7.png");
    }//GEN-LAST:event_Escudo7MouseEntered

    private void Escudo7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseExited
        Escudo7.setSize(103, 111);
        SetImageLabel(Escudo7, "src/imagenes/LauncherButton7.png");
    }//GEN-LAST:event_Escudo7MouseExited

    private void Escudo13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseEntered
        Escudo13.setSize(113, 121);
        SetImageLabel(Escudo13, "src/imagenes/LauncherButton13.png");
    }//GEN-LAST:event_Escudo13MouseEntered

    private void Escudo13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseExited
        Escudo13.setSize(103, 111);
        SetImageLabel(Escudo13, "src/imagenes/LauncherButton13.png");
    }//GEN-LAST:event_Escudo13MouseExited

    private void Escudo9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseEntered
        Escudo9.setSize(113, 121);
        SetImageLabel(Escudo9, "src/imagenes/LauncherButton9.png");
    }//GEN-LAST:event_Escudo9MouseEntered

    private void Escudo9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseExited
        Escudo9.setSize(103, 111);
        SetImageLabel(Escudo9, "src/imagenes/LauncherButton9.png");
    }//GEN-LAST:event_Escudo9MouseExited

    private void Escudo10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseEntered
        Escudo10.setSize(113, 121);
        SetImageLabel(Escudo10, "src/imagenes/LauncherButton10.png");
    }//GEN-LAST:event_Escudo10MouseEntered

    private void Escudo10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseExited
        Escudo10.setSize(103, 111);
        SetImageLabel(Escudo10, "src/imagenes/LauncherButton10.png");
    }//GEN-LAST:event_Escudo10MouseExited

    private void Escudo11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseEntered
        Escudo11.setSize(113, 121);
        SetImageLabel(Escudo11, "src/imagenes/LauncherButton11.png");
    }//GEN-LAST:event_Escudo11MouseEntered

    private void Escudo11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseExited
        Escudo11.setSize(103, 111);
        SetImageLabel(Escudo11, "src/imagenes/LauncherButton11.png");
    }//GEN-LAST:event_Escudo11MouseExited

    private void Escudo12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseEntered
        Escudo12.setSize(113, 121);
        SetImageLabel(Escudo12, "src/imagenes/LauncherButton12.png");
    }//GEN-LAST:event_Escudo12MouseEntered

    private void Escudo12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseExited
        Escudo12.setSize(103, 111);
        SetImageLabel(Escudo12, "src/imagenes/LauncherButton12.png");
    }//GEN-LAST:event_Escudo12MouseExited

    private void Escudo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseClicked
       Escudo8.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(8, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo8MouseClicked

    private void Escudo0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo0MouseClicked
       Escudo0.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(0, this);
       PaintHomeController(home);           
    }//GEN-LAST:event_Escudo0MouseClicked

    private void Escudo8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseEntered
        Escudo8.setSize(113, 121);
        SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
    }//GEN-LAST:event_Escudo8MouseEntered

    private void Escudo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseExited
        Escudo8.setSize(103, 111);
        SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
    }//GEN-LAST:event_Escudo8MouseExited

    private void Escudo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo1MouseClicked
       Escudo1.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(1, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo1MouseClicked

    private void Escudo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo2MouseClicked
       Escudo2.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(2, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo2MouseClicked

    private void Escudo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo3MouseClicked
       Escudo3.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(3, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo3MouseClicked

    private void Escudo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo4MouseClicked
       Escudo4.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(4, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo4MouseClicked

    private void Escudo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo5MouseClicked
       Escudo5.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(5, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo5MouseClicked

    private void Escudo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo6MouseClicked
       Escudo6.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(6, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo6MouseClicked

    private void Escudo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo7MouseClicked
       Escudo7.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(7, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo7MouseClicked

    private void Escudo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo13MouseClicked
       Escudo13.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(13, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo13MouseClicked

    private void Escudo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo9MouseClicked
       Escudo9.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(9, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo9MouseClicked

    private void Escudo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo10MouseClicked
       Escudo10.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(10, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo10MouseClicked

    private void Escudo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo11MouseClicked
       Escudo11.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(11, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo11MouseClicked

    private void Escudo12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo12MouseClicked
       Escudo12.setSize(113, 121);
       SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
       HomeController home = CreateHomeController(12, this);
       PaintHomeController(home);
    }//GEN-LAST:event_Escudo12MouseClicked

    private void PaginaWebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaginaWebMouseClicked
        String enlace = "https://universae.com";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_PaginaWebMouseClicked

    private void YoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YoutubeMouseClicked
        String enlace = "https://www.youtube.com/UNIVERSAE_FP";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_YoutubeMouseClicked

    private void TwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TwitchMouseClicked
        String enlace = "https://www.twitch.tv/universae_fp";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_TwitchMouseClicked

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        String enlace = "https://twitter.com/_Universae";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_XMouseClicked

    private void InstagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstagramMouseClicked
        String enlace = "https://www.instagram.com/_universae/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_InstagramMouseClicked

    private void TiktokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiktokMouseClicked
        String enlace = "https://www.tiktok.com/@_universae";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_TiktokMouseClicked

    private void FacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacebookMouseClicked
        String enlace = "https://www.facebook.com/UNIVERSAE";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_FacebookMouseClicked

    private void LinkedINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkedINMouseClicked
        String enlace = "https://es.linkedin.com/school/universae/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_LinkedINMouseClicked

    private void BtnExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnExitTxtMouseClicked

    private void BtnExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseEntered
        BtnExit.setBackground(new Color(69, 184, 172));
        BtnExitTxt.setForeground(new Color(10, 38, 72));
    }//GEN-LAST:event_BtnExitTxtMouseEntered

    private void BtnExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseExited
        BtnExit.setBackground(new Color(10, 38, 72));
        BtnExitTxt.setForeground(new Color(69, 184, 172));
    }//GEN-LAST:event_BtnExitTxtMouseExited

    private void BtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnExitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LauncherBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnExit;
    private javax.swing.JLabel BtnExitTxt;
    private javax.swing.JLabel Escudo0;
    private javax.swing.JLabel Escudo1;
    private javax.swing.JLabel Escudo10;
    private javax.swing.JLabel Escudo11;
    private javax.swing.JLabel Escudo12;
    private javax.swing.JLabel Escudo13;
    private javax.swing.JLabel Escudo2;
    private javax.swing.JLabel Escudo3;
    private javax.swing.JLabel Escudo4;
    private javax.swing.JLabel Escudo5;
    private javax.swing.JLabel Escudo6;
    private javax.swing.JLabel Escudo7;
    private javax.swing.JLabel Escudo8;
    private javax.swing.JLabel Escudo9;
    private javax.swing.JLabel Facebook;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Instagram;
    private javax.swing.JLabel LinkedIN;
    private javax.swing.JLabel PaginaWeb;
    private javax.swing.JLabel Tiktok;
    private javax.swing.JLabel Twitch;
    private javax.swing.JLabel X;
    private javax.swing.JLabel Youtube;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    // End of variables declaration//GEN-END:variables
}
