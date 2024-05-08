/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;


import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.SwingUtilities;

/**
 *
 * @author L4rry
 */
public class HomeController extends javax.swing.JPanel {
    
    public LauncherBase parent;
    public int indiceGradoActual = 0;

    
    public HomeController() {
        initComponents();

    }
    public static void playSound(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
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
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(10, 38, 72));
        bg.setBorder(javax.swing.BorderFactory.createEmptyBorder(100, 100, 100, 100));
        bg.setPreferredSize(new java.awt.Dimension(1540, 870));
        bg.setLayout(new java.awt.GridLayout(2, 3, 42, 42));

        Button0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HomeButton0.png"))); // NOI18N
        Button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseExited
        Button5.setSize(381, 291);
        setImageLabel(Button5, "src/imagenes/HomeButton5.png");
    }//GEN-LAST:event_Button5MouseExited

    private void Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseEntered
        Button5.setSize(420, 320);
        setImageLabel(Button5, "src/imagenes/HomeButton5.png");
    }//GEN-LAST:event_Button5MouseEntered

    private void Button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseClicked
        try {
            
            AscensorView ascensorView = new AscensorView();
            ascensorView.setSize(1540, 870);
            ascensorView.setLocation(0, 0);
            String tituloDelJuego = Utils.TituloJuegos(0, 5);
            ascensorView.setJuegoTitulo(tituloDelJuego);
            String Descripcion = Utils.Descripcion(0, 5);
            ascensorView.setDescripcion(Descripcion);
            parent.PaintHomeController(ascensorView);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button5MouseClicked

    private void Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseExited
        Button4.setSize(381, 291);
        setImageLabel(Button4, "src/imagenes/HomeButton4.png");
    }//GEN-LAST:event_Button4MouseExited

    private void Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseEntered
        Button4.setSize(420, 320);
        setImageLabel(Button4, "src/imagenes/HomeButton4.png");
    }//GEN-LAST:event_Button4MouseEntered

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseClicked
        try {
            
            HelicopteroView helicopteroView = new HelicopteroView();
            helicopteroView.setSize(1540, 870);
            helicopteroView.setLocation(0, 0);
            String tituloDelJuego = Utils.TituloJuegos(0, 4);
            helicopteroView.setJuegoTitulo(tituloDelJuego);
            String Descripcion = Utils.Descripcion(0, 4);
            helicopteroView.setDescripcion(Descripcion);
            parent.PaintHomeController(helicopteroView);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button4MouseClicked

    private void Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseExited
        Button3.setSize(381, 291);
        setImageLabel(Button3, "src/imagenes/HomeButton3.png");
    }//GEN-LAST:event_Button3MouseExited

    private void Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseEntered
        Button3.setSize(420, 320);
        setImageLabel(Button3, "src/imagenes/HomeButton3.png");
    }//GEN-LAST:event_Button3MouseEntered

    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseClicked
        try {
            
            EpisView episView = new EpisView();
            episView.setSize(1540, 870);
            episView.setLocation(0, 0);
            String tituloDelJuego = Utils.TituloJuegos(0, 3);
            episView.setJuegoTitulo(tituloDelJuego);
            String Descripcion = Utils.Descripcion(0, 3);
            episView.setJuegoDescripcion(Descripcion);
            parent.PaintHomeController(episView);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button3MouseClicked

    private void Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseExited
        Button2.setSize(381, 291);
        setImageLabel(Button2, "src/imagenes/HomeButton2.png");
    }//GEN-LAST:event_Button2MouseExited

    private void Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseEntered
        Button2.setSize(420, 320);
        setImageLabel(Button2, "src/imagenes/HomeButton2.png");
    }//GEN-LAST:event_Button2MouseEntered

    private void Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseClicked
       try {
            
            ExtincionView extincionView = new ExtincionView();
            extincionView.setSize(1540, 870);
            extincionView.setLocation(0, 0);
            String tituloDelJuego = Utils.TituloJuegos(0, 2);
            extincionView.setJuegoTitulo(tituloDelJuego);
            String Descripcion = Utils.Descripcion(0, 2);
            extincionView.setJuegoDescripcion(Descripcion);
            parent.PaintHomeController(extincionView);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Button2MouseClicked

    private void Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseExited
        Button1.setSize(381, 291);
        setImageLabel(Button1, "src/imagenes/HomeButton1.png");
    }//GEN-LAST:event_Button1MouseExited

    private void Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseEntered
        Button1.setSize(420, 320);
        setImageLabel(Button1, "src/imagenes/HomeButton1.png");
    }//GEN-LAST:event_Button1MouseEntered

    private void Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseClicked

        try {
            HemorragiaView hemorragiaView = new HemorragiaView();
            hemorragiaView.setSize(1540, 870);
            hemorragiaView.setLocation(0, 0);
            String tituloDelJuego = Utils.TituloJuegos(0, 1);
            hemorragiaView.setJuegoTitulo(tituloDelJuego);
            String juegoDescripcion = Utils.Descripcion(0, 1);
            hemorragiaView.setJuegoDescripcion(juegoDescripcion);
            parent.PaintHomeController(hemorragiaView);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_Button1MouseClicked

    private void Button0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseExited
        Button0.setSize(381, 291);
        setImageLabel(Button0, "src/imagenes/HomeButton0.png");

    }//GEN-LAST:event_Button0MouseExited

    private void Button0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseEntered
        Button0.setSize(420, 320);
        setImageLabel(Button0, "src/imagenes/HomeButton0.png");

    }//GEN-LAST:event_Button0MouseEntered

    private void Button0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button0MouseClicked
        try {
            GameController gameController = new GameController();
            gameController.setSize(1540, 870);
            gameController.setLocation(0, 0);
            String tituloDelJuego = Utils.TituloJuegos(0, 0);
            gameController.setJuegoTitulo(tituloDelJuego);
            String juegoDescripcion = Utils.Descripcion(0, 0);
            gameController.setJuegoDescripcion(juegoDescripcion);
            parent.PaintHomeController(gameController);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }  
        playSound("src/Audios/bloop.mp3");
    }//GEN-LAST:event_Button0MouseClicked
  private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon ( image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
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

