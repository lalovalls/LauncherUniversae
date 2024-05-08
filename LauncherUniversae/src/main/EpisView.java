/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static main.HomeController.playSound;

/**
 *
 * @author Usuario
 */
public class EpisView extends javax.swing.JPanel {
    
    public ArrayList<String> imagenes;
    public int indice;
    public String juegoTitulo = "juegoTitulo";
    public String juegoDescripcion = "juegoDescripcion";
    
    
    public EpisView() throws FileNotFoundException {
        
        initComponents();
        imagenes = new ArrayList<String>();
        cargaImagenes();       
        TituloDeTexto.setText(juegoTitulo);  
        Texto = Texto;
    }
    public void setJuegoTitulo(String nuevoTitulo) {
            juegoTitulo = nuevoTitulo; 
            TituloDeTexto.setText(nuevoTitulo);         
    }
    public void setJuegoDescripcion(String nuevaDescripcion) {
            juegoDescripcion = nuevaDescripcion; 
            Texto.setText(nuevaDescripcion); 
        
    }

    
     private void cargaImagenes() throws FileNotFoundException {
       
            String nombreCarpeta = Utils.Imagenes(0, 3);
            String carpeta = "src/" + nombreCarpeta + "/";
            
            for (int i = 0; i<5 ; i++) {
                String index = Integer.toString(i);
                String rutaImagen = carpeta + nombreCarpeta + index + ".png"; 
                imagenes.add(rutaImagen);
            }
    }

    private void mostrarImagen() {

        setImageLabel(ImagenFondo, imagenes.get(indice) );        
        actualizarPuntos();
        
    }

    private void showPreviousImage() {
        indice = (indice - 1 + imagenes.size()) % imagenes.size();
        mostrarImagen();
    
    }

    private void showNextImage() {
        indice = (indice + 1) % imagenes.size();
        mostrarImagen();

    }
      private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon ( image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
    }
      private void actualizarPuntos() {
          
    Punto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png")));
    Punto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png")));
    Punto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png")));
    Punto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png")));
    Punto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png")));

    switch(indice) {
        case 0:
            Punto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselFilled.png")));
            break;
        case 1:
            Punto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselFilled.png")));
            break;
        case 2:
            Punto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselFilled.png")));
            break;
        case 3:
            Punto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselFilled.png")));
            break;
        case 4:
            Punto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselFilled.png")));
            break;
    }
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Comenzar = new javax.swing.JLabel();
        ImagenFondo = new javax.swing.JLabel();
        FlechaIzquierda = new javax.swing.JLabel();
        FlechaDerecha = new javax.swing.JLabel();
        PlaceHolder = new javax.swing.JLabel();
        PlaceHolder1 = new javax.swing.JLabel();
        Punto1 = new javax.swing.JLabel();
        Punto2 = new javax.swing.JLabel();
        Punto5 = new javax.swing.JLabel();
        Punto4 = new javax.swing.JLabel();
        Punto3 = new javax.swing.JLabel();
        TituloDeTexto = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1540, 870));
        setPreferredSize(new java.awt.Dimension(1540, 870));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(10, 38, 72));
        bg.setMinimumSize(new java.awt.Dimension(1427, 824));
        bg.setPreferredSize(new java.awt.Dimension(1540, 870));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Comenzar.png"))); // NOI18N
        Comenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComenzarMouseClicked(evt);
            }
        });
        bg.add(Comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1234, 770, -1, -1));

        ImagenFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Epis/EPIS0.png"))); // NOI18N
        ImagenFondo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -10, 891, 525));

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
        bg.add(FlechaIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

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
        bg.add(FlechaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 240, -1, -1));

        PlaceHolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlaceHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cuadrado fondo enfocado.png"))); // NOI18N
        bg.add(PlaceHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 990, 420));

        PlaceHolder1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlaceHolder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cuadrado fondo enfocado.png"))); // NOI18N
        bg.add(PlaceHolder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 1000, 420));

        Punto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselFilled.png"))); // NOI18N
        bg.add(Punto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 504, -1, 17));

        Punto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(Punto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 504, -1, -1));

        Punto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(Punto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 504, -1, -1));

        Punto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(Punto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(773, 504, -1, -1));

        Punto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(Punto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 504, -1, -1));

        TituloDeTexto.setFont(new java.awt.Font("Raleway Black", 1, 18)); // NOI18N
        TituloDeTexto.setForeground(new java.awt.Color(255, 255, 255));
        TituloDeTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TituloDeTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Barrita aislada descripción.png"))); // NOI18N
        TituloDeTexto.setText("Tipología y características de los EPIs");
        TituloDeTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bg.add(TituloDeTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 542, 510, -1));

        Texto.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        Texto.setForeground(new java.awt.Color(255, 255, 255));
        Texto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Texto.setText("<html>Descripción: En un campo de prácticas sumido en el desorden y la confusión tienes que encontrar y colocar las partes de los EPIs utilizados en la extinción de incedios forestales.<br><br>\n\nGrado, asginatura y unidad: Coordinación de emergencias y protección civil, Gestión de recursos de emergencias y protección civil y Planificación y supervisión del mantenimiento de equipos, medios técnicos e instalaciones<br><br>\n\nDuración aproximada: 10 minutos<br><br>\n\nNivel de dificultad: Fácil</html> \n\n\n");
        Texto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bg.add(Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 740, 150));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 874));
    }// </editor-fold>//GEN-END:initComponents

    private void FlechaIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzquierdaMouseClicked
        showPreviousImage();
        playSound("src/Audios/stop.wav");
    }//GEN-LAST:event_FlechaIzquierdaMouseClicked

    private void FlechaIzquierdaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzquierdaMouseEntered
        FlechaIzquierda.setSize(25, 38);
        setImageLabel(FlechaIzquierda, "src/imagenes/Flecha izquierda.png");
    }//GEN-LAST:event_FlechaIzquierdaMouseEntered

    private void FlechaIzquierdaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaIzquierdaMouseExited
        FlechaIzquierda.setSize(22, 35);
        setImageLabel(FlechaIzquierda, "src/imagenes/Flecha izquierda.png");
    }//GEN-LAST:event_FlechaIzquierdaMouseExited

    private void FlechaDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDerechaMouseClicked
        showNextImage();
        playSound("src/Audios/stop.wav");
    }//GEN-LAST:event_FlechaDerechaMouseClicked

    private void FlechaDerechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDerechaMouseEntered
        FlechaDerecha.setSize(25, 38);
        setImageLabel(FlechaDerecha, "src/imagenes/Flecha derecha.png");        
    }//GEN-LAST:event_FlechaDerechaMouseEntered

    private void FlechaDerechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlechaDerechaMouseExited
        FlechaDerecha.setSize(22, 35);
        setImageLabel(FlechaDerecha, "src/imagenes/Flecha derecha.png");        
    }//GEN-LAST:event_FlechaDerechaMouseExited

    private void ComenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComenzarMouseClicked
        String enlace = "https://universaedevelop.itch.io/campopracticas-epis";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlace));
        } 
        catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_ComenzarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Comenzar;
    private javax.swing.JLabel FlechaDerecha;
    private javax.swing.JLabel FlechaIzquierda;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JLabel PlaceHolder;
    private javax.swing.JLabel PlaceHolder1;
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
