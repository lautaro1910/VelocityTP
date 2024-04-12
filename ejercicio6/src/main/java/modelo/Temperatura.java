/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author lautaro
 */
public class Temperatura {

    public static double fahrenheitACelsius(double farenheit) {
        return redondear((farenheit - 32) * 5 / 9);
    }
    
    // C a F
    public static double celsiusAFahrenheit(double celsius) {
        return redondear((celsius * 9.0 / 5) + 32);
    }
    
    // C a K
    public static double celsiusAKelvin(double celsius) {
        return redondear(celsius + 273.15);
    }

    // K a C
    public static double kelvinACelsius(double kelvin) {
        return redondear(kelvin - 273.15);
    }

    // F a K
    public static double fahrenheitAKelvin(double fahrenheit) {
        return redondear((fahrenheit - 32) * 5.0 / 9 + 273.15);
    }
    
    // K a F
    public static double kelvinAFahrenheit(double kelvin) {
        return redondear((kelvin - 273.15) * 9 / 5.0 + 32);
    }
    
    private static double redondear(double numero) {
        int decimales = 2;
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }
}
