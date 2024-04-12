/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;
import java.util.Map;
import modelo.NumeroDAO;
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

    private static NumeroDAO numeroDAO = new NumeroDAO();
    private static int contador = 0;

    // plantilla principal
    public static Route getS = (Request req, Response res) -> {

        HashMap model = new HashMap();
        model.put("numeros", numeroDAO.obtenerNumeros());
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };

    // llamo a la funcion del dao de agregar un numero y luego vuelvo a la plantilla
    // principal
    public static Route agregarNumero = (Request req, Response res) -> {
        int numero = Integer.parseInt(req.queryParams("numero"));
        contador += 1;
        if (contador > 7) { // condicion para que solo me deje ingresar cierta cantidad de numeros
            res.redirect("getS");
            return null;
        }
        numeroDAO.agregarNumero(numero);
        res.redirect("/getS");
        return null;
    };

    // Ordeno los numeros
    public static Route getNumerosOrdenados = (Request req, Response res) -> {
        numeroDAO.ordenarNumeros();
        res.redirect("/getS");
        return null;
    };

    // desordeno los numeros
    public static Route getNumerosDesordenados = (Request req, Response res) -> {
        numeroDAO.desordenarNumeros();
        res.redirect("/getS");
        return null;

    };
}
