/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author L4rry
 */
public class HomeController extends javax.swing.JPanel {

    
    public HomeController() {
        initComponents();
        crearGrid();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(1540, 870));

        bg.setBackground(new java.awt.Color(10, 38, 72));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    // End of variables declaration//GEN-END:variables
private void crearGrid() {
    // Crear GridLayout con 2 filas y 3 columnas
    GridLayout gridLayout = new GridLayout(2, 3);
    gridLayout.setHgap(80); 
    gridLayout.setVgap(80);
    
    bg.setLayout(gridLayout);

    // Rutas de las imágenes
    String[] imagePaths = {
        "src/imagenes/HomeButton0.png",
        "src/imagenes/HomeButton1.png",
        "src/imagenes/HomeButton2.png",
        "src/imagenes/HomeButton3.png",
        "src/imagenes/HomeButton4.png",
        "src/imagenes/HomeButton5.png"
    };

    // Agregar JLabel al JPanel bg con imágenes
    for (String imagePath : imagePaths) {
        JLabel label = new JLabel();
        label.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                setImageLabel(label, imagePath);
            }
        });
        
        bg.add(label);
    }
}

private void setImageLabel(JLabel labelName, String root) {
    ImageIcon imageIcon = new ImageIcon(root);
        Image image = imageIcon.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        labelName.setIcon(scaledIcon);
        labelName.repaint();
    
}


}

