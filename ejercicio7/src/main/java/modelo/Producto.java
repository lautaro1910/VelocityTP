/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lautaro
 */
public class Producto {
    private String nombre;
    private int puntosRequeridos;

    // Constructor, getters y setters

    public Producto(String nombre, int puntosRequeridos) {
        this.nombre = nombre;
        this.puntosRequeridos = puntosRequeridos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosRequeridos() {
        return puntosRequeridos;
    }

    public void setPuntosRequeridos(int puntosRequeridos) {
        this.puntosRequeridos = puntosRequeridos;
    }
    
    
}
