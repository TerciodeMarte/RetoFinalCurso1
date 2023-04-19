/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;
//package Images;

import Ajustes.*;
import Login.*;
import java.awt.*;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author damt111
 */
public class Main extends javax.swing.JFrame {

    int xMouse, yMouse;

    int textoBotones = 18;
    //int whitBotones = 100;
    //int heigtBotones = 200;
    //Font TextoBoton = new Font("Segoe UI Emoji", 0, textoBotones);
    Font fuentePanel = new Font("Segoe UI Emoji", 0, textoBotones);

    // para aumentar el tamaño de la fuente poco a poco:
    /*textoBotones += 2;
        Font TextoBoton = new Font("Segoe UI Emoji", 0, textoBotones);
        calculo.setFont(TextoBoton);
     */
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        Login l1 = new Login();
        l1.setSize(1070, 720);
        l1.setLocation(0, 0);
        Cuerpo.removeAll();
        Cuerpo.add(l1);
        Cuerpo.revalidate();
        Cuerpo.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        BarraLateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelVacio = new javax.swing.JPanel();
        Usuario = new javax.swing.JPanel();
        LoginTXT1 = new javax.swing.JLabel();
        Ajustes = new javax.swing.JPanel();
        LoginTXT2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        xtxt = new javax.swing.JLabel();
        Cuerpo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 720));

        Fondo.setPreferredSize(new java.awt.Dimension(1280, 720));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(new java.awt.Color(0, 155, 155));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/augusto-logo-peq.png"))); // NOI18N

        PanelVacio.setBackground(new java.awt.Color(0, 155, 155));

        javax.swing.GroupLayout PanelVacioLayout = new javax.swing.GroupLayout(PanelVacio);
        PanelVacio.setLayout(PanelVacioLayout);
        PanelVacioLayout.setHorizontalGroup(
            PanelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelVacioLayout.setVerticalGroup(
            PanelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        Usuario.setBackground(new java.awt.Color(0, 155, 155));
        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuarioMouseClicked(evt);
            }
        });

        LoginTXT1.setFont(Estilos.getFuentePanel());
        LoginTXT1.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT1.setText("Usuario");
        LoginTXT1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginTXT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginTXT1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UsuarioLayout = new javax.swing.GroupLayout(Usuario);
        Usuario.setLayout(UsuarioLayout);
        UsuarioLayout.setHorizontalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(LoginTXT1)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        UsuarioLayout.setVerticalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginTXT1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        Ajustes.setBackground(new java.awt.Color(0, 155, 155));
        Ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjustesMouseClicked(evt);
            }
        });

        LoginTXT2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        LoginTXT2.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ajustesblanco.png"))); // NOI18N
        LoginTXT2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout AjustesLayout = new javax.swing.GroupLayout(Ajustes);
        Ajustes.setLayout(AjustesLayout);
        AjustesLayout.setHorizontalGroup(
            AjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjustesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(LoginTXT2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AjustesLayout.setVerticalGroup(
            AjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjustesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginTXT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGroup(BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BarraLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Ajustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelVacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelVacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        Fondo.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 720));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));

        xtxt.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        xtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xtxt.setText("X");
        xtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        xtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xtxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xtxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
            .addGroup(exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
            .addGroup(exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(xtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 1252, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fondo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        Cuerpo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CuerpoLayout = new javax.swing.GroupLayout(Cuerpo);
        Cuerpo.setLayout(CuerpoLayout);
        CuerpoLayout.setHorizontalGroup(
            CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        CuerpoLayout.setVerticalGroup(
            CuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        Fondo.add(Cuerpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1070, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xtxtMouseClicked

    private void xtxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtxtMouseEntered
        exit.setBackground(Color.red);
        xtxt.setForeground(Color.white);
    }//GEN-LAST:event_xtxtMouseEntered

    private void xtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtxtMouseExited
        exit.setBackground(Color.white);
        xtxt.setForeground(Color.black);
    }//GEN-LAST:event_xtxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMouseClicked
        Login l2 = new Login();
        l2.setSize(1070, 720);
        l2.setLocation(0, 0);
        Cuerpo.removeAll();
        Cuerpo.add(l2);
        Cuerpo.revalidate();
        Cuerpo.repaint();
    }//GEN-LAST:event_UsuarioMouseClicked

    private void AjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesMouseClicked
        Ajustes A1 = new Ajustes();
        A1.setSize(1070, 720);
        A1.setLocation(0, 0);
        Cuerpo.removeAll();
        Cuerpo.add(A1,BorderLayout.CENTER);
        Cuerpo.revalidate();
        Cuerpo.repaint();
    }//GEN-LAST:event_AjustesMouseClicked

    private void LoginTXT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginTXT1MouseClicked

        Login l1= new Login();
        l1.setSize(1070,720);
        l1.setLocation(0, 0);
        Cuerpo.removeAll();
        Cuerpo.add(l1);
        Cuerpo.revalidate();
        Cuerpo.repaint();
    }//GEN-LAST:event_LoginTXT1MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public JPanel getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(JPanel Cuerpo) {
        this.Cuerpo = Cuerpo;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ajustes;
    private javax.swing.JPanel BarraLateral;
    private javax.swing.JPanel Cuerpo;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel LoginTXT1;
    private javax.swing.JLabel LoginTXT2;
    private javax.swing.JPanel PanelVacio;
    private javax.swing.JPanel Usuario;
    private javax.swing.JPanel exit;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel xtxt;
    // End of variables declaration//GEN-END:variables
}
