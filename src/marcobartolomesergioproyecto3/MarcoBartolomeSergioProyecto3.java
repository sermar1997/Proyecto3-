/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcobartolomesergioproyecto3;

import Conexión.Conexion;
import Interfaces.VentanaPrincipal;

/**
 *
 * @author Sergio
 */
public class MarcoBartolomeSergioProyecto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conn = new Conexion();
        conn.Conectar("localhost", "3306", "vehiculos", "usuario", "abcdef");
        VentanaPrincipal v = new VentanaPrincipal(conn);
        v.setVisible(true);
    }
    
}
