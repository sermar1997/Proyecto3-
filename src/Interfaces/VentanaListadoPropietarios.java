/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conexión.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio
 */
public class VentanaListadoPropietarios extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Conexion conn;

    /**
     * Creates new form VentanaListadoPropietarios
     *
     * @param conn
     */
    public VentanaListadoPropietarios(Conexion conn) {
        this.conn = conn;
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tVehiculos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tProvincia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nº VEHICULOS:");

        jLabel2.setText("PROVINCIA:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "TELEFONO", "PROVINCIA"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        bFiltrar.setText("FILTRAR");
        bFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(bFiltrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(bFiltrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltrarActionPerformed
        PreparedStatement ps = null;
        try {
            if (tVehiculos.getText().isEmpty()) {
                if (!validaProvincia()) {
                    tProvincia.setText("");
                } else {
                    conn.prepararSentencia("SELECT * FROM PROPIETARIO WHERE PROVINCIA LIKE ?");
                    ps.setString(1, tProvincia.getText());
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                    }
                }
            } else if (tProvincia.getText().isEmpty()) {
                if (!validaVehiculos()) {
                    tVehiculos.setText("");
                } else {
                    conn.prepararSentencia("SELECT P.DNI, P.NOMBRE, P.APELLIDO, P.TELEFONO, P.PROVINCIA FROM PROPIETARIO P JOIN VEHICULO V ON(V.PROPIETARIO=P.DNI) WHERE COUNT(V.PROPIETARIO) >= ?");
                    ps.setString(1, tVehiculos.getText());
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                    }
                }
            } else {
                conn.prepararSentencia("SELECT P.DNI, P.NOMBRE, P.APELLIDO, P.TELEFONO, P.PROVINCIA FROM PROPIETARIO P JOIN VEHICULO V ON(V.PROPIETARIO=P.DNI) WHERE COUNT(V.PROPIETARIO) >= ? AND PROVINCIA LIKE ?");
                ps.setString(1, tVehiculos.getText());
                ps.setString(2, tProvincia.getText());
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                }
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }//GEN-LAST:event_bFiltrarActionPerformed
    public boolean validaProvincia() {
        Pattern pat = Pattern.compile("(Zaragoza|Huesca|Teruel)");
        Matcher mat = pat.matcher(tProvincia.getText());
        if (mat.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Provincia de Aragón Incorrecta", "Provincia Incorrecta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean validaVehiculos() {
        Pattern pat = Pattern.compile("[0-9]{1}|[0-9]{2}");
        Matcher mat = pat.matcher(tVehiculos.getText());
        if (mat.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Número incorrecto", "Nº Vehiculos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tProvincia;
    private javax.swing.JTextField tVehiculos;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
