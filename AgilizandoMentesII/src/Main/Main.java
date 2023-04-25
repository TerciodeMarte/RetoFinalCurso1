/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;
//package Images;

import Ajustes.*;
import BBDD.ConexionBBDD;
import Login.*;
import Usuario.Cambio;
import java.awt.*;
import Usuario.Usuario;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;


/**
 * @author Grupo1 Cafe Con Palito
 * @author Carmen, Ramiro, Albano, Daniel
 */
public class Main extends javax.swing.JFrame {

    private static boolean islogin = false;
    
    int xMouse, yMouse;
    
    private static ConexionBBDD conBD = new ConexionBBDD();
    private static Connection con = conBD.conectar();

    public static Connection getCon() {
        return con;
    }

    public static boolean isIslogin() {
        return islogin;
    }

    public static void setIslogin(boolean islogin) {
        Main.islogin = islogin;
    }
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        Login l1 = new Login();
        l1.setSize(1070, 720);
        l1.setLocation(0, 0);
        
        AjustesLogin aj1 = new AjustesLogin();
        aj1.setSize(210, 50);
        aj1.setLocation(0, 0);
        
        Cuerpo.removeAll();
        Cuerpo.add(l1);
        Cuerpo.revalidate();
        Cuerpo.repaint();
        
        Ajustes.removeAll();
        Ajustes.add(aj1);
        Ajustes.revalidate();
        Ajustes.repaint();
        
        //Abrir conexion con base de datos

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
        u = new javax.swing.JPanel();
        LoginTXT1 = new javax.swing.JLabel();
        Ajustes = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        xtxt = new javax.swing.JLabel();
        Cuerpo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 720));

        Fondo.setPreferredSize(new java.awt.Dimension(1280, 720));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraLateral.setBackground(Estilos.getColorPanel());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/augusto-logo-peq.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        PanelVacio.setBackground(Estilos.getColorPanel());
        PanelVacio.setName("panelVacio"); // NOI18N

        javax.swing.GroupLayout PanelVacioLayout = new javax.swing.GroupLayout(PanelVacio);
        PanelVacio.setLayout(PanelVacioLayout);
        PanelVacioLayout.setHorizontalGroup(
            PanelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelVacioLayout.setVerticalGroup(
            PanelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        u.setBackground(Estilos.getColorPanel());
        u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uMouseExited(evt);
            }
        });

        LoginTXT1.setFont(Estilos.getFuentePanel());
        LoginTXT1.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTXT1.setText("Usuario");
        LoginTXT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginTXT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginTXT1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout uLayout = new javax.swing.GroupLayout(u);
        u.setLayout(uLayout);
        uLayout.setHorizontalGroup(
            uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        uLayout.setVerticalGroup(
            uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        Ajustes.setBackground(Estilos.getColorPanel());
        Ajustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ajustes.setPreferredSize(new java.awt.Dimension(210, 50));
        Ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjustesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AjustesLayout = new javax.swing.GroupLayout(Ajustes);
        Ajustes.setLayout(AjustesLayout);
        AjustesLayout.setHorizontalGroup(
            AjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        AjustesLayout.setVerticalGroup(
            AjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BarraLateralLayout = new javax.swing.GroupLayout(BarraLateral);
        BarraLateral.setLayout(BarraLateralLayout);
        BarraLateralLayout.setHorizontalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(PanelVacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Ajustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(u, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BarraLateralLayout.setVerticalGroup(
            BarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLateralLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelVacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
        Cuerpo.setName("blabla"); // NOI18N

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
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMouseClicked
        if (!islogin) {
            Login l2 = new Login();
            l2.setSize(1070, 720);
            l2.setLocation(0, 0);
            Cuerpo.removeAll();
            Cuerpo.add(l2);
            Cuerpo.revalidate();
            Cuerpo.repaint();
        } else {
            Cambio c1= new Cambio();
            c1.setSize(1070, 720);
            c1.setLocation(0, 0);
            Cuerpo.removeAll();
            Cuerpo.add(c1);
            Cuerpo.revalidate();
            Cuerpo.repaint();
        }

    }//GEN-LAST:event_uMouseClicked

    private void AjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjustesMouseClicked
        Ajustes A1 = new Ajustes();
        A1.setSize(1070, 720);
        A1.setLocation(0, 0);
        Cuerpo.removeAll();
        Cuerpo.add(A1, BorderLayout.CENTER);
        Cuerpo.revalidate();
        Cuerpo.repaint();
    }//GEN-LAST:event_AjustesMouseClicked

    private void LoginTXT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginTXT1MouseClicked
        if (!islogin) {
            Login L1 = new Login();
            L1.setSize(1070, 720);
            L1.setLocation(0, 0);
            Cuerpo.removeAll();
            Cuerpo.add(L1, BorderLayout.CENTER);
            Cuerpo.revalidate();
            Cuerpo.repaint();
        }else{
            Cambio c1= new Cambio();
            c1.setSize(1070, 720);
            c1.setLocation(0, 0);
            Cuerpo.removeAll();
            Cuerpo.add(c1);
            Cuerpo.revalidate();
            Cuerpo.repaint();
        }
    }//GEN-LAST:event_LoginTXT1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.iesaglinares.com/"));
        } catch (IOException ex) {
            System.err.println("Ha ocurrido una IOException");
        } catch (URISyntaxException ex) {
            System.err.println("No ha encontrado la URL");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void uMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMouseEntered
       u.setBackground(Estilos.getColorSobreBoton());
    }//GEN-LAST:event_uMouseEntered

    private void uMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMouseExited
        u.setBackground(Estilos.getColorPanel());
    }//GEN-LAST:event_uMouseExited

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

    public static JPanel getCuerpo() {
        return Cuerpo;
    }

    public static JPanel getPanelVacio() {
        return PanelVacio;
    }

    public static JPanel getAjustes() {
        return Ajustes;
    }

    public static void setAjustes(JPanel Ajustes) {
        Main.Ajustes = Ajustes;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel Ajustes;
    private static javax.swing.JPanel BarraLateral;
    private static javax.swing.JPanel Cuerpo;
    private static javax.swing.JPanel Fondo;
    private static javax.swing.JLabel LoginTXT1;
    private static javax.swing.JPanel PanelVacio;
    private static javax.swing.JPanel exit;
    private static javax.swing.JPanel header;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JPanel u;
    private static javax.swing.JLabel xtxt;
    // End of variables declaration//GEN-END:variables
}
