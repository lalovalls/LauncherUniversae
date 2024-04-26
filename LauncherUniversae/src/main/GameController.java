/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class GameController extends javax.swing.JPanel {
    
    private ArrayList<ImageIcon> imagenes;
    private int currentIndex;
    
    
    public GameController() {
        initComponents();
        cargaImagenes();
    }

    
    private void cargaImagenes() {
        imagenes = new ArrayList<>();                     
        imagenes.add(new ImageIcon(getClass().getResource("/imagenes/Helicoptero0.png")));
        imagenes.add(new ImageIcon(getClass().getResource("/imagenes/Helicoptero1.png")));
        imagenes.add(new ImageIcon(getClass().getResource("/imagenes/Helicoptero2.png")));
        imagenes.add(new ImageIcon(getClass().getResource("/imagenes/Helicoptero3.png")));
        imagenes.add(new ImageIcon(getClass().getResource("/imagenes/Helicoptero4.png")));

        currentIndex = 0;
    }

    private void showImage() {
        if (!imagenes.isEmpty()) {
            ImageIcon currentImage = imagenes.get(currentIndex);
            ImagenFondo.setIcon(currentImage);
        }
    }

    private void showPreviousImage() {
        if (!imagenes.isEmpty()) {
            currentIndex = (currentIndex - 1 + imagenes.size()) % imagenes.size();
            showImage();
        }
    }

    private void showNextImage() {
        if (!imagenes.isEmpty()) {
            currentIndex = (currentIndex + 1) % imagenes.size();
            showImage();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Comenzar = new javax.swing.JLabel();
        ImagenFondo = new javax.swing.JLabel();
        FlechaDerecha = new javax.swing.JLabel();
        FlechaIzquierda = new javax.swing.JLabel();
        Punto1 = new javax.swing.JLabel();
        Punto2 = new javax.swing.JLabel();
        Punto3 = new javax.swing.JLabel();
        Punto4 = new javax.swing.JLabel();
        Punto5 = new javax.swing.JLabel();
        TituloDeTexto = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1540, 870));
        setPreferredSize(new java.awt.Dimension(1540, 870));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(10, 38, 72));
        bg.setMinimumSize(new java.awt.Dimension(1427, 824));
        bg.setPreferredSize(new java.awt.Dimension(1540, 870));

        Comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comenzar.png"))); // NOI18N
        Comenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cuadrado fondo enfocado.png"))); // NOI18N

        FlechaDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flecha derecha.png"))); // NOI18N
        FlechaDerecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FlechaDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlechaDerechaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FlechaDerechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FlechaDerechaMouseExited(evt);
            }
        });

        FlechaIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flecha izquierda.png"))); // NOI18N
        FlechaIzquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FlechaIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlechaIzquierdaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FlechaIzquierdaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FlechaIzquierdaMouseExited(evt);
            }
        });

        Punto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselFilled.png"))); // NOI18N

        Punto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png"))); // NOI18N

        Punto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png"))); // NOI18N

        Punto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png"))); // NOI18N

        Punto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png"))); // NOI18N

        TituloDeTexto.setFont(new java.awt.Font("Raleway Black", 1, 16)); // NOI18N
        TituloDeTexto.setForeground(new java.awt.Color(255, 255, 255));
        TituloDeTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TituloDeTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barrita aislada descripción.png"))); // NOI18N
        TituloDeTexto.setText("Embarque y desembarque en helicóptero\n\n");
        TituloDeTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Texto.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N
        Texto.setForeground(new java.awt.Color(255, 255, 255));
        Texto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto.setText("<html>Descripción: En un campo de prácticas sumido en el desorden y la confusión tienes que encontrar y colocar las partes de los EPIs utilizados en la extinción de incedios forestales.<br><br>\n\nGrado, asginatura y unidad: Coordinación de emergencias y protección civil, Gestión de recursos de emergencias y protección civil y Planificación y supervisión del mantenimiento de equipos, medios técnicos e instalaciones<br><br>\n\nDuración aproximada: 10 minutos<br><br>\n\nNivel de dificultad: Fácil</html> \n\n\n");
        Texto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(FlechaIzquierda)
                .addGap(6, 6, 6)
                .addComponent(ImagenFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(FlechaDerecha))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(708, 708, 708)
                .addComponent(Punto1)
                .addGap(6, 6, 6)
                .addComponent(Punto2)
                .addGap(6, 6, 6)
                .addComponent(Punto5)
                .addGap(6, 6, 6)
                .addComponent(Punto4)
                .addGap(6, 6, 6)
                .addComponent(Punto3))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(TituloDeTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(1234, 1234, 1234)
                .addComponent(Comenzar))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(FlechaIzquierda))
                    .addComponent(ImagenFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(FlechaDerecha)))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Punto1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Punto2)
                    .addComponent(Punto5)
                    .addComponent(Punto4)
                    .addComponent(Punto3))
                .addGap(21, 21, 21)
                .addComponent(TituloDeTexto)
                .addGap(12, 12, 12)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Comenzar))
        );

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 874));
    }// </editor-fold>//GEN-END:initComponents

    private void FlechaIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzquierdaMouseClicked
        showPreviousImage();
    }//GEN-LAST:event_FlechaIzquierdaMouseClicked

    private void FlechaIzquierdaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzquierdaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_FlechaIzquierdaMouseEntered

    private void FlechaIzquierdaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzquierdaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_FlechaIzquierdaMouseExited

    private void FlechaDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDerechaMouseClicked
        showNextImage();
    }//GEN-LAST:event_FlechaDerechaMouseClicked

    private void FlechaDerechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDerechaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_FlechaDerechaMouseEntered

    private void FlechaDerechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDerechaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_FlechaDerechaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Comenzar;
    private javax.swing.JLabel FlechaDerecha;
    private javax.swing.JLabel FlechaIzquierda;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JLabel Punto1;
    private javax.swing.JLabel Punto2;
    private javax.swing.JLabel Punto3;
    private javax.swing.JLabel Punto4;
    private javax.swing.JLabel Punto5;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel TituloDeTexto;
    private javax.swing.JPanel bg;
    // End of variables declaration//GEN-END:variables
}
