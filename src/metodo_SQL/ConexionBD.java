/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo_SQL;

/**
 *
 * @author ERICK
 */
public class ConexionBD {
    public static String url = "";
    public static String usuario =  "";
    public static String contraseña = "";
    public static String clase = "org.postgresql.Driver";
    
    public static connection conectar(){
        connection conexion = null;
        
        try {
            Class.forName(clase);
        } catch (Exception e) {
        }
    }
    
}
    