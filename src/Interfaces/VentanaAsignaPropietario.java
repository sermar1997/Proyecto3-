/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conexión.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class VentanaAsignaPropietario extends javax.swing.JFrame {
    String matricula;
    Conexion conn;

    /**
     * Creates new form VentanaAsignaPropietario
     *
     * @param conn es la conexión con la base de datos que se le pasa por parámetro
     * @param matricula del coche que le pasamos por parametro y a la cual vamos a cambiar de propietario
     */
    public VentanaAsignaPropietario(Conexion conn, String matricula) {
        this.conn = conn;
        this.matricula=matricula;
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

        bCambiaProp = new javax.swing.JButton();
        tDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bCambiaProp.setText("Cambiar Propietario");
        bCambiaProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiaPropActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI Nuevo Propietario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(bCambiaProp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 121, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(bCambiaProp)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método que comprueba que el dni es correcto, si es correcto realiza una modificación del propietario cuya matricula sea la que le hemos pasado por parametro
 * @param evt 
 */
    private void bCambiaPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiaPropActionPerformed
        PreparedStatement ps = null;
        try {
            if (!compruebaDNI(tDni.getText())) {
                JOptionPane.showMessageDialog(this, "DNI incorrecto.","DNI incorrecto",JOptionPane.ERROR_MESSAGE);
            } else {
                ps = conn.prepararSentencia("UPDATE VEHICULO SET PROPIETARIO=? WHERE MATRICULA=? ");
                ps.setString(1, tDni.getText());
                ps.setString(2, matricula);
                int resultado = ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "¡PROPIETARIO ACTUALIZADO!","Propietario",JOptionPane.INFORMATION_MESSAGE);
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
                    ex.getMessage();
                }
            }
        }
        
    }//GEN-LAST:event_bCambiaPropActionPerformed
    /**
     * Método que comprueba si el dni es correcto
     * @param dni
     * @return True si el dni es correcto y false si el dni es incorrecto 
     */
    private boolean compruebaDNI(String dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String numeros = "0123456789";
        String NIE = "XYZ";
        int pos;
        //Si no tiene longitud 9 ya ni sigo
        if (dni.length() == 9) {
            String primera = dni.substring(0, 1);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCambiaProp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tDni;
    // End of variables declaration//GEN-END:variables
}
