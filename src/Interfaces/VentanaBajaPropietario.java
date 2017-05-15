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
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class VentanaBajaPropietario extends javax.swing.JFrame {

    Conexion conn;

    /**
     * Creates new form VentanaBajaPropietario
     *
     * @param conn
     */
    public VentanaBajaPropietario(Conexion conn) {
        this.conn = conn;
        initComponents();
        tNombre.setEnabled(false);
        tApellido.setEnabled(false);
        tLefono.setEnabled(false);
        tProvincia.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tApellido = new javax.swing.JTextField();
        tLefono = new javax.swing.JTextField();
        tProvincia = new javax.swing.JTextField();
        bCancelar = new javax.swing.JButton();
        bVehiculo = new javax.swing.JButton();
        bProp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDniActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("PROVINCIA:");

        jLabel5.setText("TELEFONO:");

        bCancelar.setText("CANCELAR");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bVehiculo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        bVehiculo.setText("ELIMINAR VEHICULOS");
        bVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVehiculoActionPerformed(evt);
            }
        });

        bProp.setText("ELIMINAR PROPIETARIO");
        bProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tNombre)
                    .addComponent(tDni)
                    .addComponent(tProvincia)
                    .addComponent(tLefono, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(tApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addComponent(bProp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tDni))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tNombre)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tApellido))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(tLefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(tProvincia))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bProp))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean compruebaDNI(String dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String numeros = "0123456789";
        String NIE = "XYZ";
        int pos;
        //Si no tiene longitud 9 ya ni sigo
        if (dni.length() == 9) {
            String primera = dni.substring(0, 1);
            System.out.println(dni.substring(0, 1));
            //Si la primera letra es de dni extranjero
            if (primera.toUpperCase().indexOf(NIE) != -1) {
                //Si los caracteres del 1 al 7 son numéricos sigo con la comprobación
                //si hay alguno que no lo es, el DNI ya es incorrecto
                for (int i = 1; i < dni.length() - 1; i++) {
                    if (numeros.indexOf(dni.substring(i, i + 1)) == -1) {
                        return false;
                    }
                }

                //Sustituyo la primera letra del NIE por el número al que se corresponde para
                //calcular el dígito de control.
                String num;
                if (primera.toUpperCase().equals("X")) {
                    num = "0";
                } else if (primera.toUpperCase().equals("Y")) {
                    num = "1";
                } else {
                    num = "2";
                }
                //Calculo y compruebo el dígito de control
                //Si está mal ya devuelvo false
                int numDni = Integer.parseInt("0" + dni.substring(1, 7));
                pos = numDni % 23;
                if (!dni.substring(7, 8).equalsIgnoreCase(letras.substring(pos, pos + 1))) {
                    return false;
                }
                //Si no es un DNI extranjero, sino que es de un español
            } else {
                //Compruebo que todos los caracteres menos el último son
                //dígitos, si no devuelvo false
                for (int i = 0; i < dni.length() - 1; i++) {
                    if (numeros.indexOf(dni.substring(i, i + 1)) == -1) {
                        return false;
                    }
                }
                //Calculo el dígito de control
                int numDni = Integer.parseInt(dni.substring(0, 8));
                pos = numDni % 23;
                if (!dni.substring(8, 9).equalsIgnoreCase(letras.substring(pos, pos + 1))) {
                    return false;
                }
            }
            //Si ha llegado hasta aquí es porque es correcto
            return true;
        }
        return false;
    }

    private void tDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDniActionPerformed
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            if (!compruebaDNI(tDni.getText())) {
                JOptionPane.showMessageDialog(this, "!DNI INCORRECTO¡");
            } else {
                tNombre.setEnabled(true);
                tApellido.setEnabled(true);
                tLefono.setEnabled(true);
                tProvincia.setEnabled(true);
                ps = conn.prepararSentencia("SELECT * FROM PROPIETARIO WHERE DNI LIKE ?;");
                ps.setString(1, tDni.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    tNombre.setText(rs.getString(2));
                    tApellido.setText(rs.getString(3));
                    tLefono.setText(rs.getString(4));
                    tProvincia.setText(rs.getString(5));
                } else {
                    JOptionPane.showMessageDialog(this, "Este Propietario no existe en la base de datos");

                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Cerrar statement
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    ex.getMessage();
                }
            }
        }
    }//GEN-LAST:event_tDniActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        tDni.setText("");
        tNombre.setText("");
        tApellido.setText("");
        tLefono.setText("");
        tProvincia.setText("");
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVehiculoActionPerformed
        PreparedStatement ps = null;
        try {
            if (!compruebaDNI(tDni.getText())) {
                JOptionPane.showMessageDialog(this, "!DNI INCORRECTO¡");
            } else {
                ps = conn.prepararSentencia("DELETE FROM VEHICULO WHERE PROPIETARIO LIKE ?;");
                ps.setString(1, tDni.getText());
                int resultado = ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Cerrar statement
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    ex.getMessage();
                }
            }
        }
    }//GEN-LAST:event_bVehiculoActionPerformed

    private void bPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPropActionPerformed
        PreparedStatement ps = null;
        try {
            if (!compruebaDNI(tDni.getText())) {
                JOptionPane.showMessageDialog(this, "!DNI INCORRECTO¡");
            } else {
                ps = conn.prepararSentencia("DELETE FROM PROPIETARIO WHERE DNI LIKE ?;");
                ps.setString(1, tDni.getText());
                int resultado = ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Cerrar statement
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    ex.getMessage();
                }
            }
        }
    }//GEN-LAST:event_bPropActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bProp;
    private javax.swing.JButton bVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tApellido;
    private javax.swing.JTextField tDni;
    private javax.swing.JTextField tLefono;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tProvincia;
    // End of variables declaration//GEN-END:variables
}
