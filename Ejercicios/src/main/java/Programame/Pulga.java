package Programame;

// Esquema de la entrada: número de casos
import java.util.*;

public class Pulga {

    static Scanner in;

    public static void casoDePrueba() {

        // TU CÓDIGO AQUÍ.
        // Procesa un único caso leyendo con
        // in.next*()

        String[] entrada = in.nextLine().split(" ");
        int num1 = Integer.parseInt(entrada[0]);
        int num2 = Integer.parseInt(entrada[1]);
        int num3 = Integer.parseInt(entrada[2]);


        if (num3 <= num1) {
            System.out.println(num2 * num3);
        } else if (num3%num1 == 0) {
            System.out.println(0);
        }else{
            System.out.println(((num3%num1)-1) * num2);
        }


    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    } // main

} // class Solution

