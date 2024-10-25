package Unidad_2;

import java.util.Scanner;

public class Pre1 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números que vas a introducir:");
        int cant = entrada.nextInt();

        for (int i = 1; i <= cant; i++){
            System.out.println("Introduce el número " + i);
            int num = entrada.nextInt();
            if (num < 0){
                System.out.println("El número " + num + " es menor a 0");
            }else if(num == 0){
                System.out.println("El número " + num + " es igual a 0");
            }else if(num > 0){
                System.out.println("El número " + num + " es mayor a 0");
            }
        }
    }
}
