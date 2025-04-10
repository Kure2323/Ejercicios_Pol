package Comparadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pruebas {

    public static void main(String[] args) {

        ArrayList<Integer> numeritos = new ArrayList<>(Arrays.asList(3,2,45,23,5));

        Collections.sort(numeritos);
        System.out.println(numeritos);


        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Patricia","Pol","Izan","Andrew"));
        Collections.sort(nombres);
        Collections.reverse(nombres);
        System.out.println(nombres);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Sudadera", 6));
        listaProductos.add(new Producto("Pan",1));
        listaProductos.add(new Producto("Arroz", 4));
        //Collections.sort(listaProductos);

        System.out.println(listaProductos);

        Collections.sort(listaProductos, new CompararPorPrecio());
        System.out.println(listaProductos);






    }


}
