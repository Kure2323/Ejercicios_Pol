package Unidad_2;

import java.util.Scanner;

public class Bucles65 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número:");
        int N = entrada.nextInt();
        int j = 0;

        for (int i = N; j < 10; j -= 1){
            int res = i * j;
            System.out.println(res);
        }
    }
}
