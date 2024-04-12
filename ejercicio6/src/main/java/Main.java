
import controlador.Controller;
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

        get("/getInfo", Controller.getInfo);
        get("/convertidorPeso", Controller.getConvertidorP);
        get("/convertidorLongitud", Controller.getConvertidorL);
        get("/convertidorTemperatura", Controller.getConvertidorT);
        get("/getKgaG", Controller.getGramos);
        get("/getGaKg", Controller.getKg);
        get("/getMaKM", Controller.getmAkm);
        get("/getKMaM", Controller.getkmAm);
        get("/getCMaM", Controller.getcmAm);
        get("/getMaCM", Controller.getmAcm);
        get("/getFaC", Controller.getFAC);
        get("/getCaF", Controller.getCAF);
        get("/getCaK", Controller.getCAK);
        get("/getFaK", Controller.getFAK);
        get("/getKaC", Controller.getKAC);
        get("/getKaF", Controller.getKAF);
        
    }
}
