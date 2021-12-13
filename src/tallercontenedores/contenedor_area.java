/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallercontenedores;

/**
 *
 * @author SENA
 */
public class contenedor_area {
    
    private int id;
    private String nombreA;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreA(String nombre) {
        this.nombreA = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombreA() {
        return nombreA;
    }

    public contenedor_area(int id, String nombre) {
        this.id = id;
        this.nombreA = nombre;
    }
            
}
