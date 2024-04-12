/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;
import java.util.Map;
import modelo.Radio;
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


    // plantilla principal
    public static Route getInfo = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    
    // resultado
    public static Route getResultado = (Request req, Response res) -> {
        int radio = Integer.parseInt(req.queryParams("radio"));
        double perimetroRet = Radio.retPerimtro(radio);
        double areaRet = Radio.retArea(radio);

        Map<String, Object> model = new HashMap<>();
        model.put("radio", radio);
        model.put("perimetro", perimetroRet);
        model.put("area", areaRet);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoRadio.vtl"));
    };
}
