package Unidad_2;

import java.util.Scanner;

public class Bucles2 {

    void ejecutar() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int N = entrada.nextInt();

        if (N > 0) {
            for (int i = N; i > 0; i -= 1) {
                System.out.println(i);
            }
        } else {
            for (int i = N; i < 0; i += 1) {
                System.out.println(i);

            }


        }
    }
}
