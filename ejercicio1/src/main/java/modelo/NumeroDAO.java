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
public class NumeroDAO {

    private List<Integer> numeros;

    public NumeroDAO() {
        this.numeros = new ArrayList<>();
    }

    public void agregarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> obtenerNumeros() {
        return numeros;
    }

    public void ordenarNumeros() {
        Collections.sort(numeros);
    }

    public void desordenarNumeros() {
        Collections.shuffle(numeros);
    }

}
