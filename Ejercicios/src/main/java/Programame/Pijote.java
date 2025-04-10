package Programame;// Esquema de la entrada: fin de la entrada
import java.util.*;

public class Pijote {

    static Scanner in;

    public static boolean casoDePrueba() {

        if (in.hasNext())
            return false;
        else {
            String entrada = in.next();

            String[] numeros = entrada.split("");
            long contadorPrincipal = 0;
            long contador = 0;
            String digito = numeros[0];
            boolean subnormal = true;
            Arrays.sort(numeros);

            for (int i = 0; i < numeros.length; i++) {

                if (digito.equals(numeros[i])) {
                    contadorPrincipal++;
                } else {
                    break;
                }

            }
            for (int i = 0; i < numeros.length; i++) {

                if (digito.equals(numeros[i])) {
                    contador++;
                } else {
                    if (contador != contadorPrincipal) {
                        subnormal = false;
                    }
                }

            }
            if (subnormal) {
                System.out.println("subnormal");
            } else {
                System.out.println("no subnormal");
            }

            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main

} // class Solution
