/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author L4rry
 */
public class HomeController extends javax.swing.JPanel {

    
    public HomeController() {
        initComponents();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Button0 = new javax.swing.JLabel();
        Button1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JLabel();
        Button3 = new javax.swing.JLabel();
        Button4 = new javax.swing.JLabel();
        Button5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1540, 870));

        bg.setBackground(new java.awt.Color(10, 38, 72));
        bg.setBorder(javax.swing.BorderFactory.createEmptyBorder(100, 100, 100, 100));
        bg.setLayout(new java.awt.GridLayout(2, 3, 42, 42));

        Button0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeButton0.png"))); // NOI18N
        Button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button0MouseExited(evt);
            }
        });
        bg.add(Button0);

        Button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeButton1.png"))); // NOI18N
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button1MouseExited(evt);
            }
        });
        bg.add(Button1);

        Button2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeButton2.png"))); // NOI18N
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button2MouseExited(evt);
            }
        });
        bg.add(Button2);

        Button3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeButton3.png"))); // NOI18N
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button3MouseExited(evt);
            }
        });
        bg.add(Button3);

        Button4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeButton4.png"))); // NOI18N
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button4MouseExited(evt);
            }
        });
        bg.add(Button4);

        Button5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeButton5.png"))); // NOI18N
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button5MouseExited(evt);
            }
        });
        bg.add(Button5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseExited
        Button5.setSize(391, 281);
        setImageLabel(Button5);
    }//GEN-LAST:event_Button5MouseExited

    private void Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseEntered
        Button5.setSize(420, 320);
        setImageLabel(Button5);
    }//GEN-LAST:event_Button5MouseEntered

    private void Button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseClicked

    private void Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseExited
        Button4.setSize(391, 281);
        setImageLabel(Button4);
    }//GEN-LAST:event_Button4MouseExited

    private void Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseEntered
        Button4.setSize(420, 320);
        setImageLabel(Button4);
    }//GEN-LAST:event_Button4MouseEntered

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button4MouseClicked

    private void Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseExited
        Button3.setSize(391, 281);
        setImageLabel(Button3);
    }//GEN-LAST:event_Button3MouseExited

    private void Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseEntered
        Button3.setSize(420, 320);
        setImageLabel(Button3);
    }//GEN-LAST:event_Button3MouseEntered

    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button3MouseClicked

    private void Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseExited
        Button2.setSize(391, 281);
        setImageLabel(Button2);
    }//GEN-LAST:event_Button2MouseExited

    private void Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseEntered
        Button2.setSize(420, 320);
        setImageLabel(Button2);
    }//GEN-LAST:event_Button2MouseEntered

    private void Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2MouseClicked

    private void Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseExited
        Button1.setSize(391, 281);
        setImageLabel(Button1);
    }//GEN-LAST:event_Button1MouseExited

    private void Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseEntered
        Button1.setSize(420, 320);
        setImageLabel(Button1);
    }//GEN-LAST:event_Button1MouseEntered

    private void Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1MouseClicked

    private void Button0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseExited
        Button0.setSize(391, 281);
        setImageLabel(Button0);

    }//GEN-LAST:event_Button0MouseExited

    private void Button0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseEntered
        Button0.setSize(420, 320);
        setImageLabel(Button0);

    }//GEN-LAST:event_Button0MouseEntered

    private void Button0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button0MouseClicked
  private void setImageLabel(JLabel labelName) {
    Icon icon = labelName.getIcon(); 
    if (icon != null && icon instanceof ImageIcon) { 
        ImageIcon imageIcon = (ImageIcon) icon;
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        labelName.setIcon(scaledIcon);
        this.repaint();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Button0;
    private javax.swing.JLabel Button1;
    private javax.swing.JLabel Button2;
    private javax.swing.JLabel Button3;
    private javax.swing.JLabel Button4;
    private javax.swing.JLabel Button5;
    private javax.swing.JPanel bg;
    // End of variables declaration//GEN-END:variables
}

