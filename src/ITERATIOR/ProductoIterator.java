package ITERATIOR;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductoIterator {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("1", "Tornillos"));
        productos.add(new Producto("2", "Tuercas"));
        productos.add(new Producto("3", "Arandelas"));

        JOptionPane.showMessageDialog(null, "PRODCUTOS \n\n" + imprimirProductos(productos));


    }

    private static String imprimirProductos(ArrayList<Producto> productos){
        StringBuilder lista = new StringBuilder();

        for (Producto producto : productos) {
            lista.append(producto.toString());
        }

        return lista.toString();
    }
}
