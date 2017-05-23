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
 * Clase que añade un propietario a la base de datos.
 * @author Sergio Marco
 * @version 23/05/2017
 */
public class VentanaAñadePropietario extends javax.swing.JFrame {

    Conexion conn;

    /**
     * Creates new form VentanaAñadePropietario
     *
     * @param conn parámetro que pasa la conexión
     */
    public VentanaAñadePropietario(Conexion conn) {
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

        bAñadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tDni = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tApellido = new javax.swing.JTextField();
        tProvincia = new javax.swing.JTextField();
        tLefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bAñadir.setText("Añadir Propietario");
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI : ");

        jLabel2.setText("NOMBRE: ");

        jLabel3.setText("APELLIDO: ");

        jLabel4.setText("TELEFONO: ");

        jLabel5.setText("PROVINCIA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(bAñadir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addComponent(tProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tLefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tLefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(bAñadir)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Al pulsar el botón se añadirá el propietario a la base de datos
 * @param evt parámetro que llama al evento que añade un propietario a la base de datos
 */
    private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed
        PreparedStatement ps = null;
        try {
            //Si algún campo está mal introducido se volverán a poner todos desde 0
            if (!validaTodo()) {
                tDni.setText("");
                tNombre.setText("");
                tApellido.setText("");
                tLefono.setText("");
                tProvincia.setText("");
            } else {
                //Si los campos están bien introducidos se lanza la consulta para añadir propietarios
                ps = conn.prepararSentencia("INSERT INTO PROPIETARIO VALUES (?,?,?,?,?)");
                //Le damos los valores a los comodines de la consulta
                ps.setString(1, tDni.getText());
                ps.setString(2, tNombre.getText());
                ps.setString(3, tApellido.getText());
                ps.setString(4, tLefono.getText());
                ps.setString(5, tProvincia.getText());
                //Ejecutamos la consulta
                int resultado = ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Propietario Añadido correctamente", "Propietario", JOptionPane.INFORMATION_MESSAGE);
                //Cerramos la ventana
                dispose();
            }

        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(this, "Clave Primaria Repetida");
            }
            e.getMessage();
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
    }//GEN-LAST:event_bAñadirActionPerformed
    /**
     * Método que valida que todos los métodos funcionen correctamente
     * @return 
     */
    public boolean validaTodo() {
        boolean correcto = false;
        if (compruebaDNI(tDni.getText())) {
            correcto = true;
        } else {
            return false;
        }

        if (validaNombre()) {
            correcto = true;
        } else {
            return false;
        }

        if (validaApellido()) {
            correcto = true;
        } else {
            return false;
        }

        if (validaTelefono()) {
            correcto = true;
        } else {
            return false;
        }

        if (validaProvincia()) {
            correcto = true;
        } else {

            return false;
        }
        return correcto;
    }
/**
 * Método que valida que el nombre que introducimos siga el siguiente patrón
 * @return 
 */
    public boolean validaNombre() {
        Pattern pat = Pattern.compile("^[A-Z].*[a-z].*");
        Matcher mat = pat.matcher(tNombre.getText());
        if (mat.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Contiene números o no esta escrito en formato correcto: Primera letra Mayúsucula y las demás minúsculas", "Nombre Incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
/**
 * Método que valida que el apellido que introducimos siga el siguiente patrón
 * @return 
 */
    public boolean validaApellido() {
        Pattern pat = Pattern.compile("^[A-Z].*[a-z].*");
        Matcher mat = pat.matcher(tApellido.getText());
        if (mat.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Contiene números o no esta escrito en formato correcto: Primera letra Mayúsucula y las demás minúsculas", "Apellido Incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
/**
 * Método que valida que el teléfono que introducimos siga el siguiente patrón
 * @return 
 */
    public boolean validaTelefono() {
        Pattern pat = Pattern.compile("^(\\+?)([0-9]{2})?[9|6|7][0-9]{8}$");
        Matcher mat = pat.matcher(tLefono.getText());
        if (mat.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Teléfono incorrecto. Formato: (+34(opcional)666666666)", "Telefono Incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
/**
 * Método que valida que la provincia que introducimos siga el siguiente patrón
 * @return 
 */
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
/**
 * Método que valida que el dni que introducimos sea correcto y no inventado
 * @param dni parámetro que pasa el dni introducido.
 * @return 
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

        JOptionPane.showMessageDialog(this, "Tienes que poner un dni correcto", "DNI Incorrecto", JOptionPane.ERROR_MESSAGE);
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAñadir;
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
