package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Práctica3 {
    public void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        boolean ent = true;
        int edad = 0;
        String nombre = "nada";

        while (ent == true) {
            try {
                System.out.println("Introduce tu nombre");
                nombre = entrada.next();
                System.out.println("Hola " + nombre + ". Introduce tu edad:");
                edad = entrada.nextInt();
                ent = false;
            } catch (InputMismatchException e) {
                System.out.println("ERROR, vuelva a introducir");
                entrada.nextLine();
            }
        }


        while (edad < 0) {
            System.out.println("Lo siento, no se pueden introducir valores en negativo. Vuelva a introducirla.");
            edad = entrada.nextInt();
        }

        if (edad > 17) {
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
        } else {
            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            int edad_restante = (18 - edad);
            System.out.println("Te faltan " + edad_restante + " años para ser mayor de edad.");
        }
    }
}

