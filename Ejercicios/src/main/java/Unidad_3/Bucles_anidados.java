package Unidad_3;

import java.util.Scanner;

public class Bucles_anidados {

    public void Ejercicio2() {

        String fj = "*";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entrada:");
        int num = entrada.nextInt();
        System.out.println("Salida:");

        for (int i = 0; i < num; i++) {
            System.out.println(fj);
            fj= fj + "*";
        }
    }
    public void Ejercicio2_anidado() {
        Scanner entrada = new Scanner(System.in);
        int h = entrada.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Ejercicio3() {
        for (int i = 0; i < 11; i++) {
            System.out.println("La tabla del " + i + ":");
            for (int j = 0; j < 11; j++) {
                System.out.print((i*j) + " / ");
                if (j == 10) {
                    System.out.println("\n");
                }
            }
        }
    }
    public void Ejercicio4() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el valor de m:");
        int num = entrada.nextInt();

        bucle1:
        for (int i = 2; i <= num; i++) {

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    continue bucle1;
                }
            }

            System.out.print(i + " ");

        }
    }
}
