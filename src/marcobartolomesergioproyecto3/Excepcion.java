/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcobartolomesergioproyecto3;

/**
 * Esta clase crea mi excepción
 * @author Sergio Marco
 * @version 26/05/2017
 */
public class Excepcion extends Exception {
/**
 * Constructor de mi excepción personalizada.
 * @param mensaje parámetro que introducimos que será el mensaje que mostrará la excepción
 */
    public Excepcion(String mensaje) {
        super(mensaje);
    }
}
