/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;
import java.util.Map;
import modelo.Longitud;
import modelo.Peso;
import modelo.Temperatura;
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
    
    private static Peso peso = new Peso();
    private static Longitud longitud = new Longitud();
    private static Temperatura temperatura = new Temperatura();


    // plantilla principal
    public static Route getInfo = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    
    public static Route getConvertidorP = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorPeso.vtl"));
    };
    
    public static Route getConvertidorL = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorLongitud.vtl"));
    };
    
    public static Route getConvertidorT = (Request req, Response res) -> {
        Map<String, Object> model = new HashMap<>();
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorTemperatura.vtl"));
    };
    
    public static Route getGramos = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "kg a g";

        double resultado = peso.kilogramosToGramos(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorPeso.vtl"));
    };
    
    public static Route getKg = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "g a kg";

        double resultado = peso.gramosToKilogramos(valor);
        
        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorPeso.vtl"));
    };
    
    public static Route getcmAm = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "cm a m";

        double resultado = longitud.centimetrosAMetros(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorLongitud.vtl"));
    };
    
    public static Route getmAcm = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "m a cm";

        double resultado = longitud.metrosACentimetros(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorLongitud.vtl"));
    };
    
    public static Route getmAkm = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "m a km";

        double resultado = longitud.metrosAKilometros(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorLongitud.vtl"));
    };
    
    public static Route getkmAm = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "km a m";

        double resultado = longitud.kilometrosAMetros(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorLongitud.vtl"));
    };
    
    public static Route getFAC = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "F a C";

        double resultado = temperatura.fahrenheitACelsius(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorTemperatura.vtl"));
    };
    
    public static Route getCAF = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "C a F";

        double resultado = temperatura.celsiusAFahrenheit(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorTemperatura.vtl"));
    };
    
    public static Route getFAK = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "F a K";

        double resultado = temperatura.fahrenheitAKelvin(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorTemperatura.vtl"));
    };
    
    public static Route getKAF = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "K a F";

        double resultado = temperatura.kelvinAFahrenheit(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorTemperatura.vtl"));
    };
    
    public static Route getCAK = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "C a K";

        double resultado = temperatura.celsiusAKelvin(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorTemperatura.vtl"));
    };
    
    public static Route getKAC = (Request req, Response res) -> {
        double valor = Double.parseDouble(req.queryParams("valor"));
        String accion = "K a C";

        double resultado = temperatura.kelvinACelsius(valor);

        Map<String, Object> model = new HashMap<>();
        model.put("valor", valor);
        model.put("accion", accion);
        model.put("resultado", resultado);

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/convertidorTemperatura.vtl"));
    };
    
}
