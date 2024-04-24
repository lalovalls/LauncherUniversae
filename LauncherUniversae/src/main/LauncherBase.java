/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class LauncherBase extends javax.swing.JFrame {

    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon (  image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();   
    }
    
    
    public LauncherBase() {
        initComponents();
        HomeController hm = new HomeController();
        ShowPanel(hm);
        
     
        
    }
        private void ShowPanel(JPanel p){
        
        p.setSize(1540, 870);
        p.setLocation(0, 0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Escudo8 = new javax.swing.JLabel();
        Escudo0 = new javax.swing.JLabel();
        Escudo1 = new javax.swing.JLabel();
        Escudo2 = new javax.swing.JLabel();
        Escudo3 = new javax.swing.JLabel();
        Escudo4 = new javax.swing.JLabel();
        Escudo5 = new javax.swing.JLabel();
        Escudo6 = new javax.swing.JLabel();
        Escudo7 = new javax.swing.JLabel();
        Escudo13 = new javax.swing.JLabel();
        Escudo9 = new javax.swing.JLabel();
        Escudo10 = new javax.swing.JLabel();
        Escudo11 = new javax.swing.JLabel();
        Escudo12 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Escudo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton0.png"))); // NOI18N
        Escudo0.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo0.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo0.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo0.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo0.addMouseListener(new java.awt.event.MouseAdapter() {
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo7MouseExited(evt);
            }
        });
        bg.add(Escudo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 80, -1, -1));

        Escudo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Escudo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LauncherButton13.png"))); // NOI18N
        Escudo13.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Escudo13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Escudo13.setMaximumSize(new java.awt.Dimension(103, 111));
        Escudo13.setMinimumSize(new java.awt.Dimension(103, 111));
        Escudo13.setPreferredSize(new java.awt.Dimension(103, 111));
        Escudo13.addMouseListener(new java.awt.event.MouseAdapter() {
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Escudo12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Escudo12MouseExited(evt);
            }
        });
        bg.add(Escudo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 80, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBase.png"))); // NOI18N
        bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1920, 1080));

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

    private void Escudo8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseEntered
        Escudo8.setSize(113, 121);
        SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
    }//GEN-LAST:event_Escudo8MouseEntered

    private void Escudo8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escudo8MouseExited
        Escudo8.setSize(103, 111);
        SetImageLabel(Escudo8, "src/imagenes/LauncherButton8.png");
    }//GEN-LAST:event_Escudo8MouseExited

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LauncherBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LauncherBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LauncherBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LauncherBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LauncherBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel content;
    // End of variables declaration//GEN-END:variables
}
