/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conexión.Conexion;
import javax.swing.JOptionPane;
import marcobartolomesergioproyecto3.ExportarXML;

/**
 *Clase que llama a las demás ventanas o clases.
 * @author Sergio Marco
 * @version 23/05/2017
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    Conexion conn;

    /**
     * Creates new form VentanaPrincipal
     *
     * @param conn parámetro que pasa la conexión
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTANA PRINCIPAL");

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
        bFicheroXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFicheroXMLActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(BañadePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bListadoVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bBajaProp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bListadoProp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Al ejecutar este botón se abrirá la ventana que añade los vehículos
     *
     * @param evt parámetro que llama al evento que llama a la ventana que añade
     * los vehículos
     */
    private void BañadeVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BañadeVehiculoActionPerformed
        VentanaAñadeVehiculos v = new VentanaAñadeVehiculos(conn);
        v.setVisible(true);
    }//GEN-LAST:event_BañadeVehiculoActionPerformed
    /**
     * Al ejecutar este botón se abrirá la ventana que añade a los propietarios
     *
     * @param evt parámetro que llama al evento que llama a la ventana que añade
     * a los propietarios
     */
    private void BañadePropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BañadePropietarioActionPerformed
        VentanaAñadePropietario v = new VentanaAñadePropietario(conn);
        v.setVisible(true);
    }//GEN-LAST:event_BañadePropietarioActionPerformed
    /**
     * Al ejecutar este botón se abrirá la ventana que lista los Vehículos
     *
     * @param evt parámetro que llama al evento que llama a la ventana que lista
     * los Vehículos
     */
    private void bListadoVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadoVehiculosActionPerformed
        VentanaListadoVehiculos v = new VentanaListadoVehiculos(conn);
        v.setVisible(true);
    }//GEN-LAST:event_bListadoVehiculosActionPerformed
    /**
     * Al ejecutar este botón se abrirá la ventana que da de baja a los
     * propietarios
     *
     * @param evt parámetro que llama al evento que llama a la ventana que da de
     * baja a los propietarios
     */
    private void bBajaPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaPropActionPerformed
        VentanaBajaPropietario v = new VentanaBajaPropietario(conn);
        v.setVisible(true);
    }//GEN-LAST:event_bBajaPropActionPerformed
    /**
     * Al ejecutar este botón se abrirá la ventana que lista los propietarios
     *
     * @param evt parámetro que llama al evento que llama a la ventana que lista
     * los propietarios
     */
    private void bListadoPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListadoPropActionPerformed
        VentanaListadoPropietarios v = new VentanaListadoPropietarios(conn);
        v.setVisible(true);
    }//GEN-LAST:event_bListadoPropActionPerformed
    /**
     * Al ejecutar este botón se exportará a un documento XML
     *
     * @param evt parámetro que llama al evento que exporta el código a
     * documento XML
     */
    private void bFicheroXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFicheroXMLActionPerformed
        //Instancio la clase
        ExportarXML e = new ExportarXML(conn);
        //Si el método da true se exportará si no saldrá un mensaje de error
        //y no se ecportará
        if (e.exportar()) {
            JOptionPane.showMessageDialog(this, "Has exportado a XML con éxito", "Exportar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se ha podido exportar a XML", "Exportar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_bFicheroXMLActionPerformed

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
