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
 * Clase que filtra propietarios por número de coches o por provincia
 * @author Sergio Marco
 * @version 23/05/2017
 */
public class VentanaListadoPropietarios extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Conexion conn;

    /**
     * Creates new form VentanaListadoPropietarios
     * Constructor de la clase
     * @param conn parámetro que devuelve la conexión
     */
    public VentanaListadoPropietarios(Conexion conn) {
        this.conn = conn;
        initComponents();
        //Obtenemos el modelo de la tabla
        modelo = (DefaultTableModel) tabla.getModel();
        //Rellenamos la tabla
        rellenaTabla();
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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tVehiculos = new javax.swing.JTextField();
        bFiltrar = new javax.swing.JButton();
        tProvincia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "TELEFONO", "PROVINCIA"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nº VEHICULOS:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PROVINCIA:");

        bFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar.jpg"))); // NOI18N
        bFiltrar.setText("FILTRAR");
        bFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(bFiltrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tProvincia)
                        .addComponent(tVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(bFiltrar)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(326, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 203, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(276, 276, 276))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
 * Al pulsar el botón se filtrarán los propietarios
 * @param evt parámetro que llama al evento que filtrará por propietarios
 */
    private void bFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiltrarActionPerformed
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //Si el campo de nº de vehículos está vacío
            if (tVehiculos.getText().isEmpty()) {
                //Si no valida la provincia la volveremos a escribir desde 0
                if (!validaProvincia()) {
                    tProvincia.setText("");
                } else {
                    //Si valida borramos los datos que había antes
                    LimpiarTabla();
                    //Lanzamos la consulta
                    ps = conn.prepararSentencia("SELECT * FROM PROPIETARIO WHERE PROVINCIA = ?");
                    //Le damos valor al comodín de la consulta
                    ps.setString(1, tProvincia.getText());
                    //Ejecutamos la consulta
                    rs = ps.executeQuery();
                    //Mientras haya datos se añadirán filas a la tabla
                    while (rs.next()) {
                        modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                    }
                }
                //Si el campo de provincia está vacío
            } else if (tProvincia.getText().isEmpty()) {
                //Si no valida los vehículos deberemos volver a escribirlos desde 0
                if (!validaVehiculos()) {
                    tVehiculos.setText("");
                } else {
                    //Si valida borramos los datos que había antes
                    LimpiarTabla();
                    //Preparamos la consulta
                    ps = conn.prepararSentencia("SELECT p.dni, p.nombre,p.apellido, p.telefono, p.provincia, count(v.matricula) from vehiculo v join propietario p ON(v.propietario = p.dni)  group by v.propietario HAVING count(v.matricula)=?;");
                    //Damos valor al comodín de la consulta
                    ps.setString(1, tVehiculos.getText());
                    //Ejecutamos la consulta
                    rs = ps.executeQuery();
                    //Mientras haya datos, añadiremos filas a la tabla
                    while (rs.next()) {
                        modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                    }
                }
            } else {
                //Si en los dos campos hay datos borraremos todo lo que había antes en la tabla
                LimpiarTabla();
                //Lanzaremos la consulta
                ps = conn.prepararSentencia("SELECT p.dni, p.nombre,p.apellido, p.telefono, p.provincia, count(v.matricula) from vehiculo v join propietario p ON(v.propietario = p.dni)  group by v.propietario HAVING count(v.matricula) like ? and p.provincia like ?");
                //Damos los valores a los comodines de la consulta
                ps.setString(1, tVehiculos.getText());
                ps.setString(2, tProvincia.getText());
                //Ejecutamos la consulta
                rs = ps.executeQuery();
                //Mientras haya datos seguiremos añadiendo filas a la tabla
                while (rs.next()) {
                    modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                }
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }//GEN-LAST:event_bFiltrarActionPerformed
    /**
     * Método que validará la provincia con ese patrón
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
 * Método que validará el nº vehículos con ese patrón
 * @return vehículo validado
 */
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
/**
 * Método que rellena los datos de una tabla
 */
    private void rellenaTabla() {
        try {
            //Lanzamos la consulta
            PreparedStatement ps = conn.prepararSentencia("SELECT DNI, NOMBRE, APELLIDO, TELEFONO, PROVINCIA FROM PROPIETARIO");
            //Ejecutamos la consulta
            ResultSet rs = ps.executeQuery();
            //Mientras que haya datos se añadirán filas a la tabla
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/**
 * Método que borra los datos de la tabla
 */
    private void LimpiarTabla() {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tProvincia;
    private javax.swing.JTextField tVehiculos;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
