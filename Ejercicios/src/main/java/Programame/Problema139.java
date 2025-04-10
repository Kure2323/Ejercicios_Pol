package Programame;// Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class Problema139 {

    static Scanner in;

    public static boolean casoDePrueba() {

        // LEER CASO DE PRUEBA
        String entrada = in.next();

        if (entrada.equals("0"))
        return false;
        else {


            ejecucion(entrada);


            return true;
        }

    } // casoDePrueba

    private static void ejecucion(String entrada) {
        int resultado = 0;
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < entrada.length(); i++) {

            pila.push(Integer.parseInt(entrada.substring(i,i+1))^3);

        }

        while (!pila.isEmpty()) {
            resultado =+ pila.pop();
        }

        if (Integer.toString(resultado).equals(entrada)) {
            System.out.print(" -> no cubinfinito.");
        } else if (resultado == 1) {
            System.out.print(" -> cubinfinito.");
        } else {
            System.out.print(resultado + " -");
            ejecucion(Integer.toString(resultado));
        }
    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main

} // class Solution