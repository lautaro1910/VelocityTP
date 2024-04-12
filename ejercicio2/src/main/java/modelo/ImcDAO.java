/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lautaro
 */
public class ImcDAO {
    private double peso;
    private double altura;

    public ImcDAO(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // getters & setters
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    // aux func
    public double calcularIMC() {
        double imc = 0;
        int decimales = 2;
        imc =  peso / (altura * altura);
        
        return Math.round(imc * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }

    public String obtenerValoracionIMC() {
        double imc = calcularIMC();
        if (imc < 18) {
            return "Bajo peso";
        } else if (imc >= 18 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

}
