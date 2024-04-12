
import controlador.Controller;
import static spark.Spark.get;

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
        get("/getS", Controller.getS);
        get("/agregar", Controller.agregarNumero);
        get("/getNumerosOrdenados", Controller.getNumerosOrdenados);
        get("/getNumerosDesordenados", Controller.getNumerosDesordenados);
    }
}
