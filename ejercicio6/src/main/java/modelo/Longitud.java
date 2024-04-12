/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lautaro
 */
public class Longitud {
    
    public static double metrosAKilometros(double metros) {
        return redondear(metros / 1000.0);
    }

    public static double kilometrosAMetros(double kilometros) {
        return redondear(kilometros * 1000.0);
    }

    public static double centimetrosAMetros(double centimetros) {
        return redondear(centimetros / 100.0);
    }

    public static double metrosACentimetros(double metros) {
        return redondear(metros * 100.0);
    }
    
    private static double redondear (double numero){
        int decimales = 2;
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }
}
