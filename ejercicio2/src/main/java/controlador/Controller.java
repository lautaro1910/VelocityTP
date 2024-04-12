/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;
import java.util.Map;
import modelo.ImcDAO;
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

    private static ImcDAO imcDAO = new ImcDAO(0, 0);

    // plantilla principal
    public static Route getInfo = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };

    // resultado
    public static Route getIMC = (Request req, Response res) -> {

        double peso = Double.parseDouble(req.queryParams("peso"));
        double altura = Double.parseDouble(req.queryParams("altura"));

        imcDAO = new ImcDAO(peso, altura);

        Map<String, Object> model = new HashMap<>();
        model.put("imcDAO", imcDAO);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoIMC.vtl"));
    };
}
