/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lautaro
 */
public class Radio {
    public static final double PI = 3.14159265358979323846;

    public static double retPerimtro(double radio) {
        return redondear((2 * PI * radio));
    }

    public static double retArea(double radio){
        
        return redondear((PI * (radio*radio)));
    }
    
    private static double redondear (double numero){
        int decimales = 2;
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }
}

