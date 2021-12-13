/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercontenedores;

/**
 *
 * @author SENA
 */
public class contenedor_doctor {
    
    private int cedeula;
    private String nombre;
    private int telefono;
    private String tipo_general;
    private String tipo_especialista;

    public void setCedeula(int cedeula) {
        this.cedeula = cedeula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setGeneral(String general) {
        this.tipo_general = general;
    }

    public void setEspecialista(String especialista) {
        this.tipo_especialista = especialista;
    }

    public int getCedeula() {
        return cedeula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getGeneral() {
        return tipo_general;
    }

    public String getEspecialista() {
        return tipo_especialista;
    }

    public contenedor_doctor(int cedeula, String nombre, int telefono, String general, String especialista) {
        this.cedeula = cedeula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipo_general = general;
        this.tipo_especialista = especialista;
    }
    
}
