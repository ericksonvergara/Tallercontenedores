/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ERICK
 */
public class ConexionBD {
    public static String url = "jdbc:postgresql://localhost:5433/login_bd";
    public static String usuario =  "postgres";
    public static String contraseña = "123456";
    public static String clase = "org.postgresql.Driver";
    
    public static Connection conectar(){
        Connection conexion = null;
        
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
        }
        return conexion;
    }
    
}
    