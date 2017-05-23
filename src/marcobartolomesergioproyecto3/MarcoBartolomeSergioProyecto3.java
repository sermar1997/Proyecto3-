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
     * Abre la conexión con la base de datos y llama a la ventana principal
     */
    public static void main(String[] args) {
        Conexion conn = new Conexion();
        //Conecto con la base de datos
        conn.Conectar("localhost", "3306", "vehiculos", "usuario", "abcdef");
        //Llamo a la ventana principal
        VentanaPrincipal v = new VentanaPrincipal(conn);
        v.setVisible(true);
    }
    
}
