/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Producto;
import modelo.ProductoDAO;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author lautaro
 */
public class Controller {
    
    private static List<Producto> productos = new ArrayList<>();
    

    // plantilla principal
    public static Route getInfo = (Request req, Response res) -> {
        productos = ProductoDAO.getAll();
        Map<String, Object> model = new HashMap<>();
        model.put("resultado", productos);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };

    // resultado
    public static Route getResultado = (Request req, Response res) -> {
        String nombreUsuario = req.queryParams("nombre");
        int puntos = Integer.parseInt(req.queryParams("puntos"));
        productos = ProductoDAO.getProductosForPuntos(puntos);
        
        Map<String, Object> model = new HashMap<>();
        model.put("nombre", nombreUsuario);
        model.put("puntos", puntos);
        model.put("resultado", productos);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultado.vtl"));
    };
}
