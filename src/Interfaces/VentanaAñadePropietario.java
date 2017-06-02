/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conexión.Conexion;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Clase que añade un propietario a la base de datos.
 *
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
        setIconImage(new ImageIcon(getClass().getResource("..\\Imagenes\\icono.jpg")).getImage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        bAñadir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AÑADIR PROPIETARIOS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DNI : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NOMBRE: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("APELLIDO: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("TELEFONO: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PROVINCIA:");

        bAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona.jpg"))); // NOI18N
        bAñadir.setText("Añadir Propietario");
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(172, 172, 172)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tLefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(bAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tLefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAñadir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Al pulsar el botón se añadirá el propietario a la base de datos
     *
     * @param evt parámetro que llama al evento que añade un propietario a la
     * base de datos
     */
    private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed
        PreparedStatement ps = null;
        try {
            //Si algún campo está mal introducido se volverán a poner todos desde 0
            if (!validaTodo()) {
            } else {
                //Si los campos están bien introducidos se lanza la consulta para añadir propietarios.
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

            }

        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "Ya existe en la base de datos", "Añadir Propietario", JOptionPane.ERROR_MESSAGE);
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
     * Método para que al cerrar una ventana nos guarde los cambios realizados o
     * los descarte
     */
    public void cerrar() {
        Object[] opciones = {"Guardar Cambios", "Descartar Cambios"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea realizar los cambios?", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            try {
                conn.confirmar();
                dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "No se ha podido realizar los cambios", "Confirmar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                conn.descartar();
                dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "No se ha podido realizar los cambios", "Confirmar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Evento para que al cerrar te de la opción de guardar los cambios o
     * descartarlos
     *
     * @param evt
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing
    /**
     * Método que valida que todos los métodos funcionen correctamente
     *
     * @return true si valida todos los método y false si no los valida
     */
    public boolean validaTodo() {
        boolean correcto = false;
        if (compruebaDNI(tDni.getText())) {
            tDni.setForeground(Color.GREEN);
            correcto = true;
        } else {
            tDni.setForeground(Color.red);
            JOptionPane.showMessageDialog(this, "Tienes que poner un dni correcto", "DNI Incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (validaNombre()) {
            tNombre.setForeground(Color.GREEN);
            correcto = true;
        } else {
            tNombre.setForeground(Color.red);
            return false;
        }

        if (validaApellido()) {
            tApellido.setForeground(Color.GREEN);
            correcto = true;
        } else {
            tApellido.setForeground(Color.red);
            return false;
        }

        if (validaTelefono()) {
            tLefono.setForeground(Color.GREEN);
            correcto = true;
        } else {
            tLefono.setForeground(Color.red);            
            return false;
        }

        if (validaProvincia()) {
            tProvincia.setForeground(Color.GREEN);
            correcto = true;
        } else {
            tProvincia.setForeground(Color.red);
            return false;
        }
        return correcto;
    }

    /**
     * Método que valida que el nombre que introducimos siga el siguiente patrón
     *
     * @return nombre validado
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
     * Método que valida que el apellido que introducimos siga el siguiente
     * patrón
     *
     * @return apellido validado
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
     * Método que valida que el teléfono que introducimos siga el siguiente
     * patrón
     *
     * @return telefono validado
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
     * Método que valida que la provincia que introducimos siga el siguiente
     * patrón
     *
     * @return provincia validada
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
     *
     * @param dni parámetro que pasa el dni introducido.
     * @return dni validado
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
    private javax.swing.JButton bAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tApellido;
    private javax.swing.JTextField tDni;
    private javax.swing.JTextField tLefono;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tProvincia;
    // End of variables declaration//GEN-END:variables
}
