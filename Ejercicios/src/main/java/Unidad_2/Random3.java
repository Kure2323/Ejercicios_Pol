package Unidad_2;

import java.util.Random;
import java.util.Scanner;

public class Random3 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int min;
        int max;
        int num;

        System.out.println("Introduce el intervalo de números que quieres usar (mín):");
        min = entrada.nextInt();
        System.out.println("Introduce el número máximo:");
        max = entrada.nextInt();
        System.out.println("Introduce el número de números aleatorios que gustas:");
        num = entrada.nextInt();


        if (min < max){
            for(int i = 0 ; i < num ; i++){
                int rdm = random.nextInt(min,max + 1);
                System.out.println(rdm);
            }
        }else if(max <= min){
            System.out.println("Error, el máximo debe ser mayor al mínimo:");
        }



    }
}
