package Programame;
// Esquema de la entrada: caso de prueba que marca el final
import java.util.*;

public class Problema447 {

    static Scanner in;

    public static boolean casoDePrueba() {

        // LEER CASO DE PRUEBA
        int num = in.nextInt();

        if (num == 0)
        return false;
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            // Procesa un único caso leyendo con
            // in.next*()

            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main

} // class Solution
