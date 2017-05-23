/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conexión.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class VentanaAñadeVehiculos extends javax.swing.JFrame {

    Conexion conn;

    /**
     * Creates new form VentanaAñadeVehiculos
     */
    public VentanaAñadeVehiculos(Conexion conn) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bAñadir = new javax.swing.JButton();
        tMatricula = new javax.swing.JTextField();
        tModelo = new javax.swing.JTextField();
        tAnio = new javax.swing.JTextField();
        tProp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Matricula:");

        jLabel2.setText("Modelo:");

        jLabel3.setText("AÑO: ");

        jLabel4.setText("Propietario:");

        bAñadir.setText("Añadir Vehículo");
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tMatricula)
                            .addComponent(tModelo)
                            .addComponent(tAnio)
                            .addComponent(tProp, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(bAñadir)
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(bAñadir)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed
        PreparedStatement ps = null;
        try {
            if (!validaTodo()) {
                tMatricula.setText("");
                tModelo.setText("");
                tAnio.setText("");
                tProp.setText("");
            } else {
                ps = conn.prepararSentencia("INSERT INTO VEHICULO VALUES (?,?,?,?)");
                ps.setString(1, tMatricula.getText());
                ps.setString(2, tModelo.getText());
                ps.setInt(3, Integer.parseInt(tAnio.getText()));
                ps.setString(4, tProp.getText());
                int resultado = ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "¡VEHICULO AÑADIDO!","Vehiculo",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Cerrar statement
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    if (ex.getErrorCode() == 1062) {
                        JOptionPane.showMessageDialog(this, "Clave primaria repetida");
                    }
                    ex.getMessage();
                }
            }
        }

    }//GEN-LAST:event_bAñadirActionPerformed
    public boolean validaTodo() {
        boolean correcto = false;
        if (validarMatricula()) {
            correcto = true;
        } else {
            JOptionPane.showMessageDialog(this, "Tienes que poner una matrícula correcta", "Matricula incorrecta", JOptionPane.ERROR_MESSAGE);
            correcto = false;
        }
        if (!tModelo.getText().isEmpty()) {
            correcto=true;
        }else{
            JOptionPane.showMessageDialog(this, "Tienes que poner un modelo correcto", "Modelo incorrecto", JOptionPane.ERROR_MESSAGE);
            correcto = false;
        }
        if (validarAño()) {
            correcto = true;
        } else {
            JOptionPane.showMessageDialog(this, "Tienes que introducir un año correcto", "Año incorrecto", JOptionPane.ERROR_MESSAGE);
            correcto = false;
        }
        if (!tProp.getText().isEmpty()) {
            correcto=true;
        }else{
            JOptionPane.showMessageDialog(this, "Tienes que poner un propietario correcto", "Propietario incorrecto", JOptionPane.ERROR_MESSAGE);
            correcto = false;
        }

        return correcto;
    }

    public boolean validarMatricula() {
        Pattern pat = Pattern.compile("^[0-9]{4}-[A-Z]{3}$");
        Matcher mat = pat.matcher(tMatricula.getText());
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarAño() {
        Pattern pat = Pattern.compile("[0-9]{4}$");
        Matcher mat = pat.matcher(tAnio.getText());
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tAnio;
    private javax.swing.JTextField tMatricula;
    private javax.swing.JTextField tModelo;
    private javax.swing.JTextField tProp;
    // End of variables declaration//GEN-END:variables
}
