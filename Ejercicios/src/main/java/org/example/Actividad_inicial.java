package org.example;

import java.util.Scanner;

public class Actividad_inicial {

    public void ejecutar() {
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();
        System.out.println("Bienvenido " + nombre);

        int numero1 = 0;
        int numero2 = 0;

        while (numero1==0 || numero2==0) {

            System.out.println("Error, ambos números no deben ser 0, introduzca de nuevo los números:");
           System.out.println("Dime un número:");
            System.out.println("Dime otro número:");

        }
        if (numero1==0 || numero2==0){System.out.println("ERROR. Un sumando no puede ser 0.");
        }else{int resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
        }

    }

}