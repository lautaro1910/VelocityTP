
import controlador.Controller;
import modelo.ProductoDAO;
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

        ProductoDAO.init();
        
        get("/getInfo", Controller.getInfo);
        get("/getResultado", Controller.getResultado);
    }
}
