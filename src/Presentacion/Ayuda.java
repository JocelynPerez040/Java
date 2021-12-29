/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author jocel
 */
public class Ayuda extends javax.swing.JFrame {

    /**
     * Creates new form Ayuda
     */
    public Ayuda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblEnun1 = new javax.swing.JLabel();
        BtnFinalizar = new javax.swing.JButton();
        btnReproducir = new javax.swing.JButton();
        lblFondoAyuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes/LogoAtras.png"))); // NOI18N
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 70, 70));

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes/LogoInicio.png"))); // NOI18N
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 3, 50, 40));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes/LogoSalir.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 3, 50, 40));

        lblEnun1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        lblEnun1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnun1.setText("<html>En el siguiente video podras resolver <br> todas las dudas que tengas sobre la aplicación</html>");
        getContentPane().add(lblEnun1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 560, 120));

        BtnFinalizar.setText("Finalizar");
        BtnFinalizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 80, 40));

        btnReproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/images/Reproducto_Ayuda.jpg"))); // NOI18N
        btnReproducir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReproducirActionPerformed(evt);
            }
        });
        getContentPane().add(btnReproducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 400, -1));

        lblFondoAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentacion/Imagenes/FondoAyudas.jpg"))); // NOI18N
        getContentPane().add(lblFondoAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.setVisible(false);
        Saludo saludo = new Saludo();
        saludo.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.setVisible(false);
        Informacion informacion = new Informacion();
        informacion.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void BtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinalizarActionPerformed
        this.setVisible(false);
        Cerrar cerrar = new Cerrar();
        cerrar.setVisible(true);
    }//GEN-LAST:event_BtnFinalizarActionPerformed

    private void btnReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReproducirActionPerformed
           try {

           Desktop.getDesktop().browse(new URI("https://drive.google.com/drive/folders/1uCBlBVryKHzE-gcBOVZAVMH4AM1X_CPY?usp=sharing"));

        } catch (URISyntaxException | IOException ex) {

           System.out.println(ex);
        }                
    }//GEN-LAST:event_btnReproducirActionPerformed

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
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ayuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnFinalizar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnReproducir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblEnun1;
    private javax.swing.JLabel lblFondoAyuda;
    // End of variables declaration//GEN-END:variables
}