package Unidad_2;

import java.util.Scanner;

public class Ejercicio1 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase al gusto:");
        String frase = entrada.nextLine();

        int largo = frase.length(); //Cantidad de caracteres
        System.out.println("El largo de la frase es: " + largo);

        String huecos = frase.replace(" ","");//Quita los espacios
        System.out.println(huecos);

        int num = largo/2;
        String mid1 = frase.substring(0,num); //Saca un String a partir de las coordenadas dadas
        String mid2 = frase.substring(num);
        System.out.println("La primera mitad de la frase es: " + mid1 + " La segunda mitad de la frase es: " + mid2);

        String mids = mid1.concat(mid2); //Junta dos Strings por orden
        System.out.println("Las mitades juntas: " + mids);

        String frase1 = frase.toUpperCase();
        System.out.println("La frase en mayúscula es: " + frase1);


    }
}
