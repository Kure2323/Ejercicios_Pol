package Unidad_2;

import java.util.Scanner;

public class Bucles7 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número:");
        int N = entrada.nextInt();

        for (int i = N - 1; i > 0; i--){
           N = N *= i;
        }
        System.out.println(N);
    }
}
