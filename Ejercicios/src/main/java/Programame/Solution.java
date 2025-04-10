package Programame;

// Esquema de la entrada: número de casos
import java.util.*;

public class Solution {

    static Scanner in;

    public static void casoDePrueba() {

        // TU CÓDIGO AQUÍ.
        // Procesa un único caso leyendo con
        // in.next*()

        String[] entrada = in.nextLine().split(" ");
        int inicio = Integer.parseInt(entrada[0]);
        int pinchazo = Integer.parseInt(entrada[1]);






    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    } // main

} // class Solution

