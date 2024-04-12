/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lautaro
 */
public class ProductoDAO {

    private static final Producto[] productos = new Producto[5];

    public static void init() {
        productos[0] = new Producto("Caja Palito Bombon x8u", 1200);
        productos[1] = new Producto("Tentacion Chocolate", 1000);
        productos[2] = new Producto("Torta Helada Milka", 1500);
        productos[3] = new Producto("Helado x1kg", 1500);
        productos[4] = new Producto("Helado x1/2kg", 900);
    }
    
    public static List<Producto> getAll(){
        return Arrays.asList(productos);
    }

    public static List<Producto> getProductosForPuntos(int puntos) {
        List<Producto> productosPosibles = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPuntosRequeridos() <= puntos) {
                productosPosibles.add(producto);
            }
        }
        return productosPosibles;
    }

}
