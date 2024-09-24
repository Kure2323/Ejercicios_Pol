package org.example;
import java.util.Scanner;

//Realizar un programa para dividir dos números leídos por teclado y escribir el resultado.
//Se debe controlar que el divisor no sea igual a 0 e informaremos con el siguiente mensaje:
//        "ERROR: no se puede dividir entre 0".


public class Ejercicio3 {

    public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el número a dividir:");
        int num1 = entrada.nextInt();

        System.out.println("Introduzca el número divisor:");
        int num2 = entrada.nextInt();
        if (num2 == 0) {
            System.out.println("ERROR: no se puede dividir entre 0.");
        } else {
            int resultado = num1 / num2;
            System.out.println("El resultado es " + num1 / num2);
        }
    }
}