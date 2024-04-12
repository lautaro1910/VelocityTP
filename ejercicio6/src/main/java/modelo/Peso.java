/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lautaro
 */
public class Peso {
    
    public static double gramosToKilogramos(double gramos) {
        // Fórmula para convertir gramos a kilogramos
        return redondear(gramos / 1000.0);
    }

    public static double kilogramosToGramos(double kilogramos) {
        // Fórmula para convertir kilogramos a gramos
        return redondear(kilogramos * 1000.0);
    }
    
     private static double redondear (double numero){
        int decimales = 2;
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }
    
}
