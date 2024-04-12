/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;
import java.util.Map;
import modelo.Calculadora;
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

    private static Calculadora calculadora = new Calculadora();

    // plantilla principal
    public static Route getInfo = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };

    // resultado
    public static Route getSuma = (Request req, Response res) -> {

        double num1 = Double.parseDouble(req.queryParams("num1"));
        double num2 = Double.parseDouble(req.queryParams("num2"));
        String accion = "sumar";

        double resultado = calculadora.sumar(num1, num2);

        Map<String, Object> model = new HashMap<>();
        model.put("num1", num1);
        model.put("num2", num2);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoCalculadora.vtl"));
    };
    
    // resultado
    public static Route getResta = (Request req, Response res) -> {

        double num1 = Double.parseDouble(req.queryParams("num1"));
        double num2 = Double.parseDouble(req.queryParams("num2"));
        String accion = "restar";

        double resultado = calculadora.restar(num1, num2);

        Map<String, Object> model = new HashMap<>();
        model.put("num1", num1);
        model.put("num2", num2);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoCalculadora.vtl"));
    };
    
    // resultado
    public static Route getMultiplicacion = (Request req, Response res) -> {

        double num1 = Double.parseDouble(req.queryParams("num1"));
        double num2 = Double.parseDouble(req.queryParams("num2"));
        String accion = "multiplicar";

        double resultado = calculadora.multiplicar(num1, num2);

        Map<String, Object> model = new HashMap<>();
        model.put("num1", num1);
        model.put("num2", num2);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoCalculadora.vtl"));
    };
    
    // resultado
    public static Route getDivision = (Request req, Response res) -> {

        double num1 = Double.parseDouble(req.queryParams("num1"));
        double num2 = Double.parseDouble(req.queryParams("num2"));
        String accion = "dividir";

        double resultado = calculadora.dividir(num1, num2);

        Map<String, Object> model = new HashMap<>();
        model.put("num1", num1);
        model.put("num2", num2);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoCalculadora.vtl"));
    };
}
