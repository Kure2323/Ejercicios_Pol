package Unidad_3;

import java.util.Random;
import java.util.Scanner;

public class Arrays3 {
    void ejecutar(){

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        int conteo = 0;

        int[] arr = new int[25];
        for (int i = 0; i<25; i++) {
            int aleatorio = random.nextInt(100);
            arr[i] = aleatorio;
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println("Ingrese el número a comprobar:");
        int num = entrada.nextInt();
        for (int i = 0; i<arr.length -1; i++){
            if (arr[i] == num){
                conteo++;
            }
        }
        System.out.println("El número en cuestión ha salido " + conteo + " veces.");











    }
}
