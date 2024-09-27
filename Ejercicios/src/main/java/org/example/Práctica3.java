package org.example;
import java.util.Scanner;

public class Práctica3 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = entrada.next();
        System.out.println("Hola " + nombre + ". Introduce tu edad:");
        int edad = entrada.nextInt();

        while(edad < 0){
            System.out.println("Lo siento, no se pueden introducir valores en negativo. Vuelva a introducirla.");
            edad = entrada.nextInt();
        }

        if (edad > 17){
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
        }else{
            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            int edad_restante = (18 - edad);
            System.out.println("Te faltan " + edad_restante + " años para ser mayor de edad.");
        }
    }
}
