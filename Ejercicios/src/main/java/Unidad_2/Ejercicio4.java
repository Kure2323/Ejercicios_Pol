package Unidad_2;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine();
        System.out.println("Introduce la palabra repetida:");
        String repe = entrada.nextLine();

        int salida = frase.indexOf(repe);
        int salida2 = frase.lastIndexOf(repe);
        System.out.println(salida + " " + salida2);

    }
}
