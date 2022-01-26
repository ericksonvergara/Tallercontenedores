/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ERICK
 */
public class metodos_SQL {
    
    public static ConexionBD conexion = new ConexionBD();
    
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resulatdo_numero = 0;
    
    public int guardar(String nombre, String documento, String correo, String telefono, String contraseña){
        
        int resultado = 0;
        Connection conexion = null;
        
        String sentencia_guardar = ("INSERT INTO usuario (nombre, documento, correo, telefono, contraseña) VALUES (?, ?, ?, ?, ?)");
        
        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar); 
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, documento);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, telefono);
            sentencia_preparada.setString(5, contraseña);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            
            conexion.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
    
    public static String buscarDocumento(String correo){
        
        String busqueda_documento = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT documento FROM usuario WHERE correo = '" + correo + "'" );
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                String documento = resultado.getString("documento");
                busqueda_documento = (documento);
            }
            
            conexion.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_documento;
    }
    
    public static String buscarUsuarioRegistrado(String correo, String contraseña){
        
        String busqueda_usuario = null;
        Connection conexion = null;
        
        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT documento, correo, contraseña FROM usuario WHERE correo = '" + correo + "' and contraseña = '" + contraseña + "'" );
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                busqueda_usuario = "Usuario Encontrado";
            }else{
                busqueda_usuario = "Usuario No Encontrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }
    
}
