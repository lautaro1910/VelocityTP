import controlador.Controller;
import modelo.PersonaDAO;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.get;

import org.apache.velocity.app.VelocityEngine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaro
 */
public class Main {

    public static void main(String[] args) {
        // port 4567

        PersonaDAO.init();
        
        // plantilla principal
        get("/getInfo", Controller.getInfo);
        
        // obtener las personas registradas
        get("/getPersonas", Controller.getTodasLasPersonas);
        
        // obtener los hijos de una persona
        get("/getHijos", Controller.getHijos);

        // obtener los nietos de una persona
        get("/getNietos", Controller.getNietos);
        
        get("/getTios", Controller.getTios);
        
        get("/getSobrinos", Controller.getSobrinos);
        
        get("/getHermanos", Controller.getHermanos);
        
        get("/getPadre", Controller.getPadre);
    }
}
