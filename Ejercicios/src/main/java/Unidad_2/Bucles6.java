package Unidad_2;

import java.util.Scanner;

public class Bucles6 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuántos números quieres sumar?:");
        int N = entrada.nextInt();
        int res = 0;

        for (int i = 1; i <= N; i++){
            System.out.println("Inserta nº" + i);
            int num = entrada.nextInt();
            res = res += num;
        }
        System.out.println(res);
    }
}
