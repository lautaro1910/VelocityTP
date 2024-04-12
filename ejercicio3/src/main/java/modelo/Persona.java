/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author lautaro
 */
public class Persona {
    String nombre;
    List<Persona> hijos;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        hijos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(List<Persona> hijos) {
        this.hijos = hijos;
    }


    
    //funcion auxiliar    
    public static void registrarPersona(String nombre, String hijoDe, Map<String, List<String>> personasArray) {
        if (!personasArray.containsKey(nombre)) {
            personasArray.put(nombre, new ArrayList<>());
        }

        if (hijoDe != null && personasArray.containsKey(hijoDe)) {
            personasArray.get(hijoDe).add(nombre);
        }
    }
}
