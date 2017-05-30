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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Esta clase añade un nuevo vehículo a la base de datos
 *
 * @author Sergio Marco
 * @version 23/05/2017
 */
public class VentanaAñadeVehiculos extends javax.swing.JFrame {

    Conexion conn;

    /**
     * Creates new form VentanaAñadeVehiculos
     *
     * @param conn parámetro que pasa la conexión
     */
    public VentanaAñadeVehiculos(Conexion conn) {
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
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        setTitle("AÑADIR VEHÍCULOS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Matricula:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Modelo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("AÑO: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Propietario:");

        bAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coche.jpg"))); // NOI18N
        bAñadir.setText("Añadir Vehículo");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(bAñadir)))
                        .addGap(0, 302, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tProp, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tMatricula)
                            .addComponent(tModelo))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(bAñadir)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Al pulsar este botón se añadirá un nuevo coche a la base de datos.
     *
     * @param evt parámetro que llama al evento para añadir un nuevo coche a la
     * base de datos
     */
    private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed
        PreparedStatement ps = null;
        try {
            //Si no valida todos los campos se volverá a introducir todo desde 0
            if (!validaTodo()) {
                
                
                
                
            } else {
                //Si valida todos los datos inserto un nuevo vehículo en la base
                ps = conn.prepararSentencia("INSERT INTO VEHICULO VALUES (?,?,?,?)");
                //Añado los valores para los comodines de la consulta
                ps.setString(1, tMatricula.getText());
                ps.setString(2, tModelo.getText());
                ps.setInt(3, Integer.parseInt(tAnio.getText()));
                ps.setString(4, tProp.getText());
                //Ejecuto la consulta
                int resultado = ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "¡VEHICULO AÑADIDO!", "Vehiculo", JOptionPane.INFORMATION_MESSAGE);
                //Se cierra la ventana
                dispose();
            }
        } catch (SQLException e) {
            switch (e.getErrorCode()) {
                case 1216:
                    JOptionPane.showMessageDialog(this, "El propietario no existe en la base de datos", "Añadir Vehículos", JOptionPane.ERROR_MESSAGE);
                    break;
                case 1452:
                    JOptionPane.showMessageDialog(this, "No existe el propietario", "Añadir Vehículos", JOptionPane.ERROR_MESSAGE);
                    break;
                    case 1062:
                    JOptionPane.showMessageDialog(this, "Matrícula Duplicada", "Añadir Vehículos", JOptionPane.ERROR_MESSAGE);
                    break;
                default:
                    System.out.println(e.getMessage());
                    break;
            }
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
     * Método que valida que todos los métodos hayan devuelto true
     *
     * @return true si valida todos los métodos y false si no los valida.
     */
    public boolean validaTodo() {
        boolean correcto = false;
        //Si valida devolverá true, sino mostrará mensaje de error y devolverá falso
        if (validarMatricula()) {
            correcto = true;
        } else {
            tMatricula.setText("");
            JOptionPane.showMessageDialog(this, "Tienes que poner una matrícula correcta", "Matricula incorrecta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!tModelo.getText().isEmpty()) {
            correcto = true;
        } else {
            tModelo.setText("");
            JOptionPane.showMessageDialog(this, "Tienes que poner un modelo correcto", "Modelo incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (validarAño()) {
            correcto = true;
        } else {
            tAnio.setText("");
            JOptionPane.showMessageDialog(this, "Tienes que introducir un año correcto", "Año incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!tProp.getText().isEmpty()) {
            correcto = true;
        } else {
            tProp.setText("");
            JOptionPane.showMessageDialog(this, "Tienes que poner un propietario correcto", "Propietario incorrecto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        //Si todo es validado devuelve true
        return correcto;
    }

    /**
     * Valida que la matrícula siga el patrón establecido
     *
     * @return true si valida la matrícula y false si no valida 
     */
    public boolean validarMatricula() {
        Pattern pat = Pattern.compile("^[0-9]{4}-[A-Z]{3}$");
        Matcher mat = pat.matcher(tMatricula.getText());
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Valida que el año siga el patrón establecido
     *
     * @return año true si el año es válido y false si no es válido
     */
    public boolean validarAño() {
        Pattern pat = Pattern.compile("[0-9]{4}$");
        Matcher mat = pat.matcher(tAnio.getText());
        if (mat.matches()) {
            return true;
        } else {
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField tAnio;
    private javax.swing.JTextField tMatricula;
    private javax.swing.JTextField tModelo;
    private javax.swing.JTextField tProp;
    // End of variables declaration//GEN-END:variables
}
