/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexión;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase que utilizaremos para conectarnos a la base de datos y para realuzar
 * sentencias sql
 *
 * @author Sergio Marco
 * @version 23/05/2017
 */
public class Conexion {

    private Connection conexion;

    /**
     * Obtiene la conexión a la base de datos
     *
     * @return Connection
     */
    public Connection getConexion() {
        return conexion;
    }

    /**
     * Carga el driver para conectarse a la base de datos
     *
     * @return Driver Si lo carga devuelve true sino devuelve false
     */
    public boolean cargarDriver() {
        try {
            DriverManager.registerDriver(new Driver());
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Se conecta a la base de datos con una serie de parámetros que
     * introducimos cuando llamamos al método
     *
     * @param host si trabajas en local es localhost
     * @param puerto por el que accedes a la base de datos
     * @param database nombre de la base de datos
     * @param usuario nombre del usuario que accede a la base de datos
     * @param password contraseña del usuario
     * @return la conexión a la base
     */
    public boolean Conectar(String host, String puerto, String database, String usuario, String password) {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + puerto + "/" + database, usuario, password);
            conexion.setAutoCommit(false);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Método para desconectarse de la base de datos
     *
     * @return conexion devuelve true si cierra la conexión y false si no la
     * cierra.
     */
    public boolean Desconectar() {
        try {
            conexion.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Método para realizar una sentencia de modificación sql
     *
     * @param sentencia sql que ejecutaremos
     * @return la consulta realizada
     * @throws SQLException
     */
    public PreparedStatement prepararSentencia(String sentencia) throws SQLException {
        PreparedStatement ps = null;
        ps = conexion.prepareStatement(sentencia);
        return ps;
    }

    /**
     * Método para realizar una sentendia de consulta sql
     *
     * @param consulta parámetro en el cual introduciremos la consulta sql
     * @return consulta sin parámetros
     * @throws SQLException
     */
    public ResultSet consultaSinParametros(String consulta) throws SQLException {
        ResultSet rs = null;
        rs = prepararSentencia(consulta).executeQuery();
        return rs;
    }

    /**
     * Método para confirmar los cambios realizados
     *
     * @throws SQLException
     */
    public void confirmar() throws SQLException {
        conexion.commit();
    }

    /**
     * Método para descartar los cambios realizados
     *
     * @throws SQLException
     */
    public void descartar() throws SQLException {
        conexion.rollback();
    }
}
