/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lautaro
 */
public class Calculadora {

    public double sumar(double num1, double num2) {
        return redondear(num1 + num2);
    }

    public double restar(double num1, double num2) {
        return redondear(num1 - num2);
    }

    public double multiplicar(double num1, double num2) {
        return redondear(num1 * num2);
    }

    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return redondear(num1 / num2);
    }
    
    private static double redondear (double numero){
        int decimales = 2;
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }
}
