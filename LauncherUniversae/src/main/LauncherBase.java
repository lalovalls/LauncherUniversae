/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class LauncherBase extends javax.swing.JFrame {

    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon (  image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();   
    }
    
    public LauncherBase() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        SetImageLabel(Fondo, "src/image1/FondoBase.png");
        SetImageLabel(Escudo8, "src/image1/LauncherButton8.png");
        SetImageLabel(Escudo0, "src/image1/LauncherButton0.png");
        SetImageLabel(Escudo1, "src/image1/LauncherButton1.png");
        SetImageLabel(Escudo2, "src/image1/LauncherButton2.png");
        SetImageLabel(Escudo3, "src/image1/LauncherButton3.png");
        SetImageLabel(Escudo4, "src/image1/LauncherButton4.png");
        SetImageLabel(Escudo5, "src/image1/LauncherButton5.png");
        SetImageLabel(Escudo6, "src/image1/LauncherButton6.png");
        SetImageLabel(Escudo7, "src/image1/LauncherButton7.png");
        SetImageLabel(Escudo13, "src/image1/LauncherButton13.png");
        SetImageLabel(Escudo9, "src/image1/LauncherButton9.png");
        SetImageLabel(Escudo10, "src/image1/LauncherButton10.png");
        SetImageLabel(Escudo11, "src/image1/LauncherButton11.png");
        SetImageLabel(Escudo12, "src/image1/LauncherButton12.png");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escudo8.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 103, 111));

        Escudo0.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 103, 111));

        Escudo1.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 103, 111));

        Escudo2.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 103, 111));

        Escudo3.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 103, 111));

        Escudo4.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 103, 111));

        Escudo5.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 80, 103, 111));

        Escudo6.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, 103, 111));

        Escudo7.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 80, 103, 111));

        Escudo13.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 80, 103, 111));

        Escudo9.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 80, 103, 111));

        Escudo10.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 80, 103, 111));

        Escudo11.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 80, 103, 111));

        Escudo12.setBorder(new javax.swing.border.MatteBorder(null));
        Escudo12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bg.add(Escudo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1810, 80, 103, 111));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image1/FondoBase.png"))); // NOI18N
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
    // End of variables declaration//GEN-END:variables
}
