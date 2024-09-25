package org.example;
import java.util.Scanner;

public class Ejercicio4 {
    public void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor de la base");
        int base = entrada.nextInt();

            while (base < 0) {
                System.out.println("El valor de la base debe ser positivo");
                base = entrada.nextInt();
            }
            System.out.println("Valor de la altura");
            int altura = entrada.nextInt();

            while (altura < 0) {
                System.out.println("El valor de la altura tiene que ser positivo");
                altura = entrada.nextInt();
            }
            System.out.println("El área del triángulo es " + (base * altura)/2);


        }
    }
