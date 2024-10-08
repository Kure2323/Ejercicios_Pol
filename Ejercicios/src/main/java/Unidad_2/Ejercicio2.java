package Unidad_2;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe la primera frase: ");
        String fr1 = entrada.nextLine();
        System.out.println("Escribe la segunda frase: ");
        String fr2 = entrada.nextLine();

        int l1 = fr1.length();
        int l2 = fr2.length();

        if(l1 == l2){
            System.out.println("Son iguales");
        }else{
            if(l1 < l2){
                System.out.println("La segunda frase es más larga");
            }else {
                System.out.println("La primera frase es más larga");
            }
        }
    }
}
