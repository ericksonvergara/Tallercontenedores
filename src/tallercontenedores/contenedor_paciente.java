/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercontenedores;

/**
 *
 * @author SENA
 */
public class contenedor_paciente {
    
    private int cedula;
    private String nombre;
    private int edad;
    private long telefono;

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public contenedor_paciente(int cedula, String nombre, int edad, long telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    
}
