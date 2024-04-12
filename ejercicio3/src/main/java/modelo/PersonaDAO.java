/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static spark.Spark.init;

/**
 *
 * @author lautaro
 */
public class PersonaDAO {

    //esto podria ir al DAO
    private static Map<String, List<String>> personasArray = new HashMap<>();
    
    //creo el map y seteo algunas personas en memoria
    public static Map<String, List<String>> init() {
        // elementos en memoria
        Persona.registrarPersona("Pablo", null, personasArray);
        Persona.registrarPersona("David", "Pablo", personasArray);
        Persona.registrarPersona("Sofia", "Pablo", personasArray);
        Persona.registrarPersona("Ana", "David", personasArray);
        Persona.registrarPersona("Juan", "David", personasArray);
        Persona.registrarPersona("Maria", "Sofia", personasArray);
        Persona.registrarPersona("Pedro", "Sofia", personasArray);
        return personasArray;
    }
    
    public static Set<String> getTodasLasPersonas() {
        return personasArray.keySet();
    }

    public static List<String> getHijos(String nombre) {
        List<String> hijos = personasArray.getOrDefault(nombre, new ArrayList<>());
        return hijos;
    }

    public static List<String> getNietos(String nombre) {
        List<String> nietos = new ArrayList<>();
        List<String> hijos = personasArray.getOrDefault(nombre, new ArrayList<>());
        for (String hijo : hijos) {
            nietos.addAll(personasArray.getOrDefault(hijo, new ArrayList<>()));
        }
        return nietos;
    }
    
    // obtener el padre de una persona
    public static List<String>  obtenerPadre(String nombre) {
        List<String> padres = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : personasArray.entrySet()) {
            if (entry.getValue().contains(nombre)) { //chequea los hijos
                padres.add(entry.getKey()); // devuelve el padre
            }
        }
        return padres;
    }
    
    // obtener los tíos de una persona
    public static List<String> getTios(String nombre) {
        List<String> tios = new ArrayList<>();
        List<String> padre = obtenerPadre(nombre);
        if (padre != null) {
            List<String> abuelo = obtenerPadre(padre.get(0));
            if (abuelo != null) {
                List<String> hermanosPadre = getHijos(abuelo.get(0));
                for (String tio : hermanosPadre) {
                    if (!tio.equals(padre.get(0))) { // excluye al padre
                        tios.add(tio);
                    }
                }
            }
        }
        return tios;
    }
    
    public static List<String> getSobrinos(String nombre) {
        List<String> sobrinos = new ArrayList<>();
        List<String> padre = obtenerPadre(nombre);
        if(padre != null){
            List<String> hermanos = getHijos(padre.get(0));
            for (String hermano : hermanos){
                if(!hermano.equals(nombre)){
                    List<String> hijosDeHermanos = getHijos(hermano);
                    for(String hijoDeHermano : hijosDeHermanos){
                        sobrinos.add(hijoDeHermano);
                    }
                }
            }
        }
        return sobrinos;
    }
    
    public static List<String> getHermanos(String nombre) {
        List<String> hermanos = new ArrayList<>();
        List<String> hermanosAux = new ArrayList<>();
        List<String> padre = obtenerPadre(nombre);
        if(padre != null){
            hermanosAux = getHijos(padre.get(0));
            for (String hermano : hermanosAux){
                if(!hermano.equals(nombre))
                hermanos.add(hermano);
            }
        }
        return hermanos;
    }
}