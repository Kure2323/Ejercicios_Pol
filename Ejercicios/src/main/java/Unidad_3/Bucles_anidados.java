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
    public void Ejercicio3() {
        for (int i = 0; i < 11; i++) {
            System.out.println("La tabla del " + i + ":");
            for (int j = 0; j < 11; j++) {
                System.out.print((i*j) + " ");
                if (j == 10) {
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }
    public void Ejercicio4() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el valor de m:");
        int num = entrada.nextInt();
        boolean primo = true;
        for (int i = 2; i <= num; i++) {
            primo=true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.print(i + " ");
            }
        }



    }
}
