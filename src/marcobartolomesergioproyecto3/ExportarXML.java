/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcobartolomesergioproyecto3;

import Conexión.Conexion;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 * Esta clase representa el proceso de exportar a un fuchero XML nuestra
 * información de la base de datos
 *
 * @author Sergio Marco
 * @version: 23/05/2017
 */
public class ExportarXML {

    Conexion conn;

    /**
     * Constructor en el cual se le pasa la conexión a la base de datos
     *
     * @param conn parámetro que nos pasa la conexión
     */
    public ExportarXML(Conexion conn) {
        this.conn = conn;
    }

    /**
     * Método en el cual conseguimos exportar los datos de la bbdd al fichero
     * XML
     *
     * @return devuelve la true si exporta correctamente el fichero y false si no lo exporta
     * @throws marcobartolomesergioproyecto3.Excepcion  
     */
    public boolean exportar() throws Excepcion {
        File f;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSet rs1 = null;
        boolean correcto = false;
        try {
            //Creo una instancia de DocumentBuilderFactory para construir el parser y cargar el documento con el método parse
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            //Le introduzco la versión XML del documento
            doc.setXmlVersion("1.0");
            //Creo el elemento raíz llamado Vehículos
            Element raiz = doc.createElement("Vehículos");
            //Lo añado al documento
            doc.appendChild(raiz);
            //Lanzo la consulta que me muestra todos los vehículos
            ps = conn.prepararSentencia("SELECT * FROM VEHICULO");
            //La ejecuto
            rs = ps.executeQuery();
            //Mientras que haya vehículos...
            while (rs.next()) {
                //Guardo los resultados de la consulta en Strings y entero
                String matricula = rs.getString(1);
                String modelo = rs.getString(2);
                int anio = rs.getInt(3);
                String propietario = rs.getString(4);
                //Creo el elemento Vehículo
                Element vehiculo = doc.createElement("Vehículo");
                //Le añado el atributo matrícula y le digo que su valor sea el que he guardado de la consulta
                vehiculo.setAttribute("Matricula", matricula);
                raiz.appendChild(vehiculo);
                Element modelos = doc.createElement("Modelo");
                //Le creo un nodo texto y le introduzco el valor que he guardado de la consulta
                Text m = doc.createTextNode(modelo);
                //Añado el texto al elemento 
                modelos.appendChild(m);
                //Añado el elemento modelos al elemento vehiculo
                vehiculo.appendChild(modelos);
                //Creo el elemento anios
                Element anios = doc.createElement("Año");
                //Añado anios a vehiculo
                vehiculo.appendChild(anios);
                //Creo un nodo texto y le doy el valor de anio
                Text a = doc.createTextNode(String.valueOf(anio));
                //Añado el texto a anios
                anios.appendChild(a);
                //Creo el elemento propietarios
                Element propietarios = doc.createElement("Propietario");
                //Añado el elemento propietarios a vehiculo.
                vehiculo.appendChild(propietarios);
                //Lanzo consulta para seleccionar el nombre y el apellido del propietario
                ps = conn.prepararSentencia("SELECT NOMBRE, APELLIDO FROM PROPIETARIO WHERE DNI LIKE ?");
                //Le introduzco que el valor del dni sea igual al campo que he guardado de la base de datos
                ps.setString(1, propietario);
                //Lanzo el resultset
                rs1 = ps.executeQuery();
                //Mientras que siga habiendo resultados
                while (rs1.next()) {
                    //Guardo los datos que obtengo en variables
                    String nombre = rs1.getString(1);
                    String apellido = rs1.getString(2);
                    //Creo el elemento nombres
                    Element nombres = doc.createElement("Nombre");
                    //Creo el nodo de texto y le doy el valor de la variable nombre
                    Text n = doc.createTextNode(nombre);
                    //Creo el nodo de texto y le doy el valor de la variable apellido
                    Text ape = doc.createTextNode(apellido);
                    //Añado el nodo de texto a nombres
                    nombres.appendChild(n);
                    //Añado el elemento nombres a propietarios
                    propietarios.appendChild(nombres);
                    //Creo el elemento apellidos
                    Element apellidos = doc.createElement("Apellido");
                    //Añado el nodo de texto a apellidos
                    apellidos.appendChild(ape);
                    //Añado apellidos a propietarios
                    propietarios.appendChild(apellidos);
                }
                //Si realiza todo correctamente devolverá true
                correcto = true;
            }
            //Transforma todo a un documento XML en la ruta especificada
            Source source = new DOMSource(doc);
            Result result = new StreamResult(f = new File("src/fichero/vehiculos.xml"));
            //Si el fichero existe realizará la transformación, sino mostrará un mensaje
            if (f.exists()) {
            Transformer trans = TransformerFactory.newInstance().newTransformer();
            trans.transform(source, result);    
            }else{    
                JOptionPane.showConfirmDialog(null, "Fichero no existente", "XML", JOptionPane.ERROR_MESSAGE);
            return false;
            }
            
        } catch (NullPointerException e) {
            throw new Excepcion("Ruta no encontrada");
        } catch (SQLException e) {
            e.getMessage();
            return false;
        } catch (ParserConfigurationException e) {
            e.getMessage();
            return false;
        } catch (TransformerException e) {
            e.getMessage();
            return false;
        }
        return correcto;
    }
}
