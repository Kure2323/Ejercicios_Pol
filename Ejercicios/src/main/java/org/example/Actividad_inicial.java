package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_inicial {

    public void ejecutar() {
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("Bienvenido " + nombre);

            try {
                System.out.println("Introduce un número");
                int numero1 = entrada.nextInt();
                System.out.println("Introduce otro número");
                int numero2 = entrada.nextInt();
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("ERROR, eres un poco gilipollas.");
                int numero1 = 0;
                int numero2 = 0;
            }
            System.out.println("Introduce un número");
            int numero1 = entrada.nextInt();
            System.out.println("Introduce otro número");
            int numero2 = entrada.nextInt();

            if (numero1==0 || numero2==0){
                System.out.println("ERROR. Un sumando no puede ser 0.");
            }else{
                int resultado = numero1 + numero2;
                    System.out.println("El resultado de la suma es: " + resultado);
        }

    }

}
