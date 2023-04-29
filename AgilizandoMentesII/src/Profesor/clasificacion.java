/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Profesor;

import BBDD.ObjetoClasificacionBBDD;
import BBDD.MetodosClasificacionBBDD;
import Ajustes.Estilos;
import Ajustes.HeaderColor;
import Main.Main;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author terciodemarte
 */
public class clasificacion extends javax.swing.JPanel {

    /**
     * Creates new form alumnos
     */
    public clasificacion() {
        initComponents();
        jTable1.getTableHeader().setDefaultRenderer(new HeaderColor());
        jTable1.setAutoCreateRowSorter(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        datos = new javax.swing.JPanel();
        Apellido1 = new javax.swing.JPanel();
        ap1 = new javax.swing.JLabel();
        TFApellido1 = new javax.swing.JTextField();
        SepUsuario3 = new javax.swing.JSeparator();
        Apellido2 = new javax.swing.JPanel();
        ap2 = new javax.swing.JLabel();
        TFApellido2 = new javax.swing.JTextField();
        SepUsuario4 = new javax.swing.JSeparator();
        Nombre = new javax.swing.JPanel();
        no = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        SepUsuario2 = new javax.swing.JSeparator();
        buscar = new javax.swing.JPanel();
        buscartxt = new javax.swing.JLabel();
        Nivel = new javax.swing.JPanel();
        selectorNivel = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Juego = new javax.swing.JPanel();
        selectorJuego = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(Estilos.getColorPanelBlanco());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "1º Apellido ", "2º Apellido", "Nivel", "Nº Partidas", "Total Aciertos", "Media Aciertos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(Estilos.getColorSobreBoton());
        jTable1.setSelectionForeground(Estilos.getColorFuentePanel());
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        datos.setBackground(Estilos.getColorPanelBlanco());
        datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Apellido1.setBackground(new java.awt.Color(255, 255, 255));

        ap1.setFont(Estilos.getFuenteCuerpo());
        ap1.setText("Apellido 1");

        TFApellido1.setFont(Estilos.getFuenteCuerpo());
        TFApellido1.setForeground(new java.awt.Color(204, 204, 204));
        TFApellido1.setText("Inserte Apellido 1");
        TFApellido1.setBorder(null);
        TFApellido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TFApellido1MousePressed(evt);
            }
        });
        TFApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFApellido1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Apellido1Layout = new javax.swing.GroupLayout(Apellido1);
        Apellido1.setLayout(Apellido1Layout);
        Apellido1Layout.setHorizontalGroup(
            Apellido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Apellido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Apellido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFApellido1)
                    .addGroup(Apellido1Layout.createSequentialGroup()
                        .addGroup(Apellido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ap1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Apellido1Layout.setVerticalGroup(
            Apellido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Apellido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ap1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SepUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        datos.add(Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 344, -1));

        Apellido2.setBackground(new java.awt.Color(255, 255, 255));

        ap2.setFont(Estilos.getFuenteCuerpo());
        ap2.setText("Apellido 2");

        TFApellido2.setFont(Estilos.getFuenteCuerpo());
        TFApellido2.setForeground(new java.awt.Color(204, 204, 204));
        TFApellido2.setText("Inserte Apellido 2");
        TFApellido2.setBorder(null);
        TFApellido2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TFApellido2MousePressed(evt);
            }
        });
        TFApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFApellido2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Apellido2Layout = new javax.swing.GroupLayout(Apellido2);
        Apellido2.setLayout(Apellido2Layout);
        Apellido2Layout.setHorizontalGroup(
            Apellido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Apellido2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Apellido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFApellido2)
                    .addGroup(Apellido2Layout.createSequentialGroup()
                        .addGroup(Apellido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ap2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Apellido2Layout.setVerticalGroup(
            Apellido2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Apellido2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ap2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SepUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        datos.add(Apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 320, -1));

        Nombre.setBackground(new java.awt.Color(255, 255, 255));

        no.setFont(Estilos.getFuenteCuerpo());
        no.setText("Nombre");

        TFNombre.setFont(Estilos.getFuenteCuerpo());
        TFNombre.setForeground(new java.awt.Color(204, 204, 204));
        TFNombre.setText("Inserte Nombre");
        TFNombre.setBorder(null);
        TFNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TFNombreMousePressed(evt);
            }
        });
        TFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NombreLayout = new javax.swing.GroupLayout(Nombre);
        Nombre.setLayout(NombreLayout);
        NombreLayout.setHorizontalGroup(
            NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NombreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFNombre)
                    .addGroup(NombreLayout.createSequentialGroup()
                        .addGroup(NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NombreLayout.setVerticalGroup(
            NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(no)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SepUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        datos.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        buscar.setBackground(new java.awt.Color(0, 155, 155));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
        });

        buscartxt.setFont(Estilos.getFuentePanel());
        buscartxt.setForeground(new java.awt.Color(255, 255, 255));
        buscartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscartxt.setText("Buscar");
        buscartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout buscarLayout = new javax.swing.GroupLayout(buscar);
        buscar.setLayout(buscarLayout);
        buscarLayout.setHorizontalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        buscarLayout.setVerticalGroup(
            buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        datos.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 210, -1));

        Nivel.setBackground(Estilos.getColorPanelBlanco());
        Nivel.setFont(Estilos.getFuenteCuerpo());

        selectorNivel.setFont(Estilos.getFuenteCuerpo());
        selectorNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "Todos" }));

        jLabel1.setFont(Estilos.getFuenteCuerpo());
        jLabel1.setText("Nivel");

        javax.swing.GroupLayout NivelLayout = new javax.swing.GroupLayout(Nivel);
        Nivel.setLayout(NivelLayout);
        NivelLayout.setHorizontalGroup(
            NivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NivelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(selectorNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        NivelLayout.setVerticalGroup(
            NivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NivelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(NivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(selectorNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        datos.add(Nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 340, 60));

        Juego.setBackground(Estilos.getColorPanelBlanco());
        Juego.setFont(Estilos.getFuenteCuerpo());

        selectorJuego.setFont(Estilos.getFuenteCuerpo());
        selectorJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calculo25", "Euclides", "Resto División" }));

        jLabel2.setFont(Estilos.getFuenteCuerpo());
        jLabel2.setText("Juego");

        javax.swing.GroupLayout JuegoLayout = new javax.swing.GroupLayout(Juego);
        Juego.setLayout(JuegoLayout);
        JuegoLayout.setHorizontalGroup(
            JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JuegoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(selectorJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        JuegoLayout.setVerticalGroup(
            JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JuegoLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(JuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selectorJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        datos.add(Juego, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 340, 60));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
                    .addComponent(datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TFNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFNombreMousePressed
        // TODO add your handling code here:
        if (TFNombre.getText().equals("Inserte Nombre")) {
            TFNombre.setText("");
            TFNombre.setForeground(Color.gray);
        }
        if (TFApellido1.getText().isEmpty()) {
            TFApellido1.setText("Inserte Apellido 1");
        }
        if (TFApellido2.getText().isEmpty()) {
            TFApellido2.setText("Inserte Apellido 2");
        }

    }//GEN-LAST:event_TFNombreMousePressed

    private void TFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNombreActionPerformed

    private void TFApellido1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFApellido1MousePressed
        // TODO add your handling code here:
        if (TFApellido1.getText().equals("Inserte Apellido 1")) {
            TFApellido1.setText("");
            TFApellido1.setForeground(Color.gray);
        }

        if (TFNombre.getText().isEmpty()) {
            TFNombre.setText("Inserte Nombre");
        }

        if (TFApellido2.getText().isEmpty()) {
            TFApellido2.setText("Inserte Apellido 2");
        }

    }//GEN-LAST:event_TFApellido1MousePressed

    private void TFApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFApellido1ActionPerformed

    private void TFApellido2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFApellido2MousePressed
        // TODO add your handling code here:
        if (TFApellido2.getText().equals("Inserte Apellido 2")) {
            TFApellido2.setText("");
            TFApellido2.setForeground(Color.gray);
        }
        if (TFNombre.getText().isEmpty()) {
            TFNombre.setText("Inserte Nombre");
        }
        if (TFApellido1.getText().isEmpty()) {
            TFApellido1.setText("Inserte Apellido 1");
        }

    }//GEN-LAST:event_TFApellido2MousePressed

    private void TFApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFApellido2ActionPerformed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        actualizar();
    }//GEN-LAST:event_buscarMouseClicked

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered
        buscar.setBackground(Estilos.getColorSobreBoton());
    }//GEN-LAST:event_buscarMouseEntered

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited
        buscar.setBackground(Estilos.getColorPanel());
    }//GEN-LAST:event_buscarMouseExited

    /**
     * Metodo para actualizar la tabla
     */
    private void actualizar() {
        ObjetoClasificacionBBDD objeto = buscador();

        DefaultTableModel modelC = (DefaultTableModel) jTable1.getModel();
        modelC.setRowCount(0);
        Object[] row = new Object[8];

        ArrayList<ObjetoClasificacionBBDD> lista = MetodosClasificacionBBDD.selectClasificacion(Main.getCon(), objeto.getNombre(), objeto.getApellido1(), objeto.getApellido2(), objeto.getNivel(), objeto.getJuego());
        for (int i = 0; i < lista.size(); i++) {
            row[0] = lista.get(i).getNombre();
            row[1] = lista.get(i).getApellido1();
            row[2] = lista.get(i).getApellido2();
            row[3] = lista.get(i).getNivel();
            row[4] = lista.get(i).getPartidas();
            row[5] = lista.get(i).getTotalaciertos();
            row[6] = lista.get(i).getMediaAciertos();

            modelC.addRow(row);
        }
    }

    /**
     * Metodo para coger los parametros de la busqueda
     *
     * @return Objeto de la clase MetodosClasificacionBBDD para almacenar todos
     * los parametros de la busqueda
     */
    private ObjetoClasificacionBBDD buscador() {
        ObjetoClasificacionBBDD objeto = new ObjetoClasificacionBBDD();

        if (TFNombre.getText().equals("Inserte Nombre") || TFNombre.getText().isEmpty()) {
            objeto.setNombre("%");
        } else {
            objeto.setNombre("%" + TFNombre.getText() + "%");
        }

        if (TFApellido1.getText().equals("Inserte Apellido 1") || TFApellido1.getText().isEmpty()) {
            objeto.setApellido1("%");
        } else {
            objeto.setApellido1("%" + TFApellido1.getText() + "%");
        }

        if (TFApellido2.getText().equals("Inserte Apellido 2") || TFApellido2.getText().isEmpty()) {
            objeto.setApellido2("%");
        } else {
            objeto.setApellido2("%" + TFApellido2.getText() + "%");
        }
        if (selectorNivel.getSelectedItem().toString().equals("Todos")) {
            objeto.setNivel("%");
        } else {
            objeto.setNivel(selectorNivel.getSelectedItem().toString());
        }

        if (selectorJuego.getSelectedItem().toString().equals("Calculo25")) {
            objeto.setJuego("calculo");
        } else if (selectorJuego.getSelectedItem().toString().equals("Euclides")) {
            objeto.setJuego("euclides");
        } else {
            objeto.setJuego("resto_div");
        }
        return objeto;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Apellido1;
    private javax.swing.JPanel Apellido2;
    private javax.swing.JPanel Juego;
    private javax.swing.JPanel Nivel;
    private javax.swing.JPanel Nombre;
    private javax.swing.JSeparator SepUsuario2;
    private javax.swing.JSeparator SepUsuario3;
    private javax.swing.JSeparator SepUsuario4;
    private javax.swing.JTextField TFApellido1;
    private javax.swing.JTextField TFApellido2;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JLabel ap1;
    private javax.swing.JLabel ap2;
    private javax.swing.JPanel background;
    private javax.swing.JPanel buscar;
    private javax.swing.JLabel buscartxt;
    private javax.swing.JPanel datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel no;
    private javax.swing.JComboBox<String> selectorJuego;
    private javax.swing.JComboBox<String> selectorNivel;
    // End of variables declaration//GEN-END:variables
}
