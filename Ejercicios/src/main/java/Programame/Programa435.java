package Programame;

import java.util.Arrays;

public class Programa435 {




    static java.util.Scanner in;

    public static void casoDePrueba() {

        String entrada = in.next();

        if (entrada.isEmpty()) {
            System.out.println("no subnormal");
            return;
        }

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

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main
}
