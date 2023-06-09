/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Profesor;

import Ajustes.*;
import Calculadora.Calculadora;
import Main.Main;

/**
 *
 * @author damt111
 */
public class PanelProfesor extends javax.swing.JPanel {

    /**
     * Creates new form PanelAlumno
     */
    public PanelProfesor() {
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

        PanelAlumnos = new javax.swing.JPanel();
        Clasificaciones = new javax.swing.JPanel();
        LoginTXT4 = new javax.swing.JLabel();
        Alumnos = new javax.swing.JPanel();
        LoginTXT = new javax.swing.JLabel();
        Calculadora = new javax.swing.JPanel();
        LoginTXT3 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(210, 330));
        setRequestFocusEnabled(false);

        PanelAlumnos.setBackground(new java.awt.Color(0, 155, 155));
        PanelAlumnos.setPreferredSize(new java.awt.Dimension(210, 330));

        Clasificaciones.setBackground(new java.awt.Color(0, 155, 155));
        Clasificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clasificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClasificacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClasificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClasificacionesMouseExited(evt);
            }
        });

        LoginTXT4.setFont(Estilos.getFuentePanel());
        LoginTXT4.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTXT4.setText("Clasificaciones");
        LoginTXT4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ClasificacionesLayout = new javax.swing.GroupLayout(Clasificaciones);
        Clasificaciones.setLayout(ClasificacionesLayout);
        ClasificacionesLayout.setHorizontalGroup(
            ClasificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        ClasificacionesLayout.setVerticalGroup(
            ClasificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT4, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        Alumnos.setBackground(new java.awt.Color(0, 155, 155));
        Alumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlumnosMouseExited(evt);
            }
        });

        LoginTXT.setFont(Estilos.getFuentePanel());
        LoginTXT.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTXT.setText("Alumnos");
        LoginTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout AlumnosLayout = new javax.swing.GroupLayout(Alumnos);
        Alumnos.setLayout(AlumnosLayout);
        AlumnosLayout.setHorizontalGroup(
            AlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AlumnosLayout.setVerticalGroup(
            AlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        Calculadora.setBackground(new java.awt.Color(0, 155, 155));
        Calculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Calculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalculadoraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalculadoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalculadoraMouseExited(evt);
            }
        });

        LoginTXT3.setFont(Estilos.getFuentePanel());
        LoginTXT3.setForeground(new java.awt.Color(255, 255, 255));
        LoginTXT3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTXT3.setText("Calculadora ");
        LoginTXT3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout CalculadoraLayout = new javax.swing.GroupLayout(Calculadora);
        Calculadora.setLayout(CalculadoraLayout);
        CalculadoraLayout.setHorizontalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTXT3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CalculadoraLayout.setVerticalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup()
                .addComponent(LoginTXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelAlumnosLayout = new javax.swing.GroupLayout(PanelAlumnos);
        PanelAlumnos.setLayout(PanelAlumnosLayout);
        PanelAlumnosLayout.setHorizontalGroup(
            PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Clasificaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Calculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAlumnosLayout.setVerticalGroup(
            PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Clasificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ClasificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClasificacionesMouseClicked
        ProfesorInfoClasificacionAlumos c1 = new ProfesorInfoClasificacionAlumos();
        c1.setSize(1070, 720);
        c1.setLocation(0, 0);
        Main.getCuerpo().removeAll();
        Main.getCuerpo().add(c1);
        Main.getCuerpo().revalidate();
        Main.getCuerpo().repaint();
    }//GEN-LAST:event_ClasificacionesMouseClicked

    private void AlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlumnosMouseClicked
        ProfesorInfoAlumnos a1 = new ProfesorInfoAlumnos();
        a1.setSize(1070, 720);
        a1.setLocation(0, 0);
        Main.getCuerpo().removeAll();
        Main.getCuerpo().add(a1);
        Main.getCuerpo().revalidate();
        Main.getCuerpo().repaint();
    }//GEN-LAST:event_AlumnosMouseClicked

    private void CalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculadoraMouseClicked
        Calculadora calcu = new Calculadora();
        calcu.setVisible(true);
    }//GEN-LAST:event_CalculadoraMouseClicked

    private void ClasificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClasificacionesMouseEntered
        Clasificaciones.setBackground(Estilos.getColorSobreBoton());
        if (Configuracion.isSonido()) {
            Configuracion.sonar("clasificaciones");
        }
    }//GEN-LAST:event_ClasificacionesMouseEntered

    private void ClasificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClasificacionesMouseExited
        Clasificaciones.setBackground(Estilos.getColorPanel());
        Configuracion.parar();
    }//GEN-LAST:event_ClasificacionesMouseExited

    private void AlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlumnosMouseEntered
        Alumnos.setBackground(Estilos.getColorSobreBoton());
        if (Configuracion.isSonido()) {
            Configuracion.sonar("alumnos");
        }
    }//GEN-LAST:event_AlumnosMouseEntered

    private void AlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlumnosMouseExited
        Alumnos.setBackground(Estilos.getColorPanel());
        Configuracion.parar();
    }//GEN-LAST:event_AlumnosMouseExited

    private void CalculadoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculadoraMouseEntered
        Calculadora.setBackground(Estilos.getColorSobreBoton());
        if (Configuracion.isSonido()) {
            Configuracion.sonar("calculadora");
        }
    }//GEN-LAST:event_CalculadoraMouseEntered

    private void CalculadoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalculadoraMouseExited
        Calculadora.setBackground(Estilos.getColorPanel());
    }//GEN-LAST:event_CalculadoraMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alumnos;
    private javax.swing.JPanel Calculadora;
    private javax.swing.JPanel Clasificaciones;
    private javax.swing.JLabel LoginTXT;
    private javax.swing.JLabel LoginTXT3;
    private javax.swing.JLabel LoginTXT4;
    private javax.swing.JPanel PanelAlumnos;
    // End of variables declaration//GEN-END:variables
}
