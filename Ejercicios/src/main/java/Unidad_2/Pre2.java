package Unidad_2;

import java.util.Scanner;

public class Pre2 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce un número (Base):");
        int base = entrada.nextInt();
        int inmov = base;
        System.out.println("Introduce un número (Exponente):");
        int exp = entrada.nextInt();

        for(int i = 1; i < exp;i++){
            base = base * inmov;
        }
        System.out.println("El resultado es: " + base);








    }
}
