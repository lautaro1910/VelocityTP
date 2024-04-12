/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import modelo.PersonaDAO;
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
        HashMap model = new HashMap();
        Set<String> allP = PersonaDAO.getTodasLasPersonas();
        int cantPersonas = allP.size();
        model.put("cantidadP", cantPersonas);
        model.put("resultado", allP);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    
    public static Route getTodasLasPersonas = (Request req, Response res) -> {
        Set<String> allP = PersonaDAO.getTodasLasPersonas();
        String accion = "Todas las personas";
        HashMap model = new HashMap();
        model.put("resultado", allP);
        model.put("accion", accion);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoP.vtl"));
    };

    // plantilla principal
    public static Route getHijos = (Request req, Response res) -> {
        String nombre = req.queryParams("nombre");
        String accion = "hijos";
        List<String> hijos = PersonaDAO.getHijos(nombre);

        HashMap model = new HashMap();
        model.put("resultado", hijos);
        model.put("accion", accion);
        model.put("nombre", nombre);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoP.vtl"));
    };

    public static Route getNietos = (Request req, Response res) -> {
        String nombre = req.queryParams("nombre");
        List<String> nietos = PersonaDAO.getNietos(nombre);
        String accion = "nietos";
        
        HashMap model = new HashMap();
        model.put("resultado", nietos);
        model.put("accion", accion);
        model.put("nombre", nombre);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoP.vtl"));
    };

    public static Route getTios = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        String nombre = req.queryParams("nombre");
        List<String> tios = PersonaDAO.getTios(nombre);
        String accion = "tios";
        
        HashMap model = new HashMap();
        model.put("resultado", tios);
        model.put("accion", accion);
        model.put("nombre", nombre);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoP.vtl"));
    };

    public static Route getSobrinos = (Request req, Response res) -> {
        String nombre = req.queryParams("nombre");
        List<String> sobrinos = PersonaDAO.getSobrinos(nombre);
        String accion = "sobrinos";
        
        HashMap model = new HashMap();
        model.put("resultado", sobrinos);
        model.put("accion", accion);
        model.put("nombre", nombre);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoP.vtl"));
    };

    public static Route getHermanos = (Request req, Response res) -> {
        String nombre = req.queryParams("nombre");
        List<String> hermanos = PersonaDAO.getHermanos(nombre);
        String accion = "hermanos";
        
        HashMap model = new HashMap();
        model.put("resultado", hermanos);
        model.put("accion", accion);
        model.put("nombre", nombre);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoP.vtl"));
    };
    
    public static Route getPadre = (Request req, Response res) -> {
        String nombre = req.queryParams("nombre");
        List<String> padre = PersonaDAO.obtenerPadre(nombre);
        String accion = "padre";
        
        HashMap model = new HashMap();
        model.put("resultado", padre);
        model.put("accion", accion);
        model.put("nombre", nombre);
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/resultadoP.vtl"));
    };

}
