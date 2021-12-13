/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercontenedores;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author SENA
 */
public class contenedor_ingreso {
    private int cedula;
    private String nombre_paciente;
    private java.util.Date fecha_ingreso;   

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public contenedor_ingreso(int cedula, String nombre_paciente, Date fecha_ingreso) {
        this.cedula = cedula;
        this.nombre_paciente = nombre_paciente;
        this.fecha_ingreso = fecha_ingreso;
    }

    
    
}
