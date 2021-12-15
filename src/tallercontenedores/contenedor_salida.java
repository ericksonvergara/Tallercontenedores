/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercontenedores;

import java.util.Date;

/**
 *
 * @author FRANCIA
 */
public class contenedor_salida {
    
    private int cedula_paciente;
    private String nombre_paciente;
    private java.util.Date fecha_ingreso;
    private java.util.Date fecha_salida;
    private int cedula_doctor;
    private String nombre_doctor;
    private String tipo_doctor;
    private String area_doctor;
    private String estado_paciente;
    private String total;

    public void setCedula_paciente(int cedula_paciente) {
        this.cedula_paciente = cedula_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public void setCedula_doctor(int cedula_doctor) {
        this.cedula_doctor = cedula_doctor;
    }

    public void setNombre_doctor(String nombre_doctor) {
        this.nombre_doctor = nombre_doctor;
    }

    public void setTipo_doctor(String tipo_doctor) {
        this.tipo_doctor = tipo_doctor;
    }

    public void setArea_doctor(String area_doctor) {
        this.area_doctor = area_doctor;
    }

    public void setEstado_paciente(String estado_paciente) {
        this.estado_paciente = estado_paciente;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getCedula_paciente() {
        return cedula_paciente;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public int getCedula_doctor() {
        return cedula_doctor;
    }

    public String getNombre_doctor() {
        return nombre_doctor;
    }

    public String getTipo_doctor() {
        return tipo_doctor;
    }

    public String getArea_doctor() {
        return area_doctor;
    }

    public String getEstado_paciente() {
        return estado_paciente;
    }

    public String getTotal() {
        return total;
    }

    public contenedor_salida(int cedula_paciente, String nombre_paciente, Date fecha_ingreso, Date fecha_salida, int cedula_doctor, String nombre_doctor, String tipo_doctor, String area_doctor, String estado_paciente, String total) {
        this.cedula_paciente = cedula_paciente;
        this.nombre_paciente = nombre_paciente;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.cedula_doctor = cedula_doctor;
        this.nombre_doctor = nombre_doctor;
        this.tipo_doctor = tipo_doctor;
        this.area_doctor = area_doctor;
        this.estado_paciente = estado_paciente;
        this.total = total;
    }
    
}
