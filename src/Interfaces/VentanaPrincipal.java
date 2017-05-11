/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conexión.Conexion;

/**
 *
 * @author Sergio
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    Conexion conn;

    /**
     * Creates new form VentanaPrincipal
     * @param conn
     */
    public VentanaPrincipal(Conexion conn) {
        this.conn = conn;
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

        Panel = new javax.swing.JPanel();
        BañadeVehiculo = new javax.swing.JButton();
        BañadePropietario = new javax.swing.JButton();
        bListadoVehiculos = new javax.swing.JButton();
        bBajaProp = new javax.swing.JButton();
        bListadoProp = new javax.swing.JButton();
        bFicheroXML = new javax.swing.JButton();

        Panel.setBackground(new java.awt.Color(255, 255, 153));

        BañadeVehiculo.setText("Añadir Vehículos a la Base de Datos");
        BañadeVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BañadeVehiculoActionPerformed(evt);
            }
        });

        BañadePropietario.setText("Añadir Propietario");
        BañadePropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BañadePropietarioActionPerformed(evt);
            }
        });

        bListadoVehiculos.setText("Mostrar un Listado de todos los vehiculos");
        bListadoVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListadoVehiculosActionPerformed(evt);
            }
        });

        bBajaProp.setText("Dar de baja a un propietario");
        bBajaProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBajaPropActionPerformed(evt);
            }
        });

        bListadoProp.setText("Mostrar un listado de propietarios");
        bListadoProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListadoPropActionPerformed(evt);
            }
        });

        bFicheroXML.setText("Exportar los datos a un fichero XML");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BañadePropietario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bListadoVehiculos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(bFicheroXML, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bListadoProp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bBajaProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BañadeVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(BañadeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BañadePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bListadoVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(bBajaProp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bListadoProp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFicheroXML, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BañadeVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BañadeVehiculoActionPerformed
        VentanaAñadeVehiculos v = new VentanaAñadeVehiculos(conn);
        v.setVisible(true);
    }//GEN-LAST:event_BañadeVehiculoActionPerformed

    private void BañadePropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BañadePropietarioActionPerformed
        VentanaAñadePropietario v = new VentanaAñadePropietario(conn);
        v.setVisible(true);
    }//GEN-LAST:event_BañadePropietarioActionPerformed

    private void bListadoVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadoVehiculosActionPerformed
        VentanaMuestraListadoVehiculos v = new VentanaMuestraListadoVehiculos();
        v.setVisible(true);
    }//GEN-LAST:event_bListadoVehiculosActionPerformed

    private void bBajaPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaPropActionPerformed
        VentanaBajaPropietario v = new VentanaBajaPropietario();
        v.setVisible(true);
    }//GEN-LAST:event_bBajaPropActionPerformed

    private void bListadoPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadoPropActionPerformed
        VentanaListadoPropietarios v = new VentanaListadoPropietarios();
        v.setVisible(true);
    }//GEN-LAST:event_bListadoPropActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BañadePropietario;
    private javax.swing.JButton BañadeVehiculo;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton bBajaProp;
    private javax.swing.JButton bFicheroXML;
    private javax.swing.JButton bListadoProp;
    private javax.swing.JButton bListadoVehiculos;
    // End of variables declaration//GEN-END:variables
}
