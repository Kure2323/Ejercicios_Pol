package Unidad_1;
import java.util.Scanner;

//Realizar un programa que permita leer 2 números diferentes por teclado y nos diga cuál de ellos es el mayor.
//En caso de que el usuario introduzca dos números iguales, informaremos con el siguiente mensaje:
//        "ERROR: los números introducidos son iguales".

public class Ejercicio2 {

    public void ejecutar() {

        System.out.println("Introduce un número...");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Introduce un segundo número...");
        int num2 = entrada.nextInt();

        if (num1 == num2){
            System.out.println("ERROR: los números introducidos son iguales");
        }else{
            if (num1 > num2){
                System.out.println("El primer número introducido es mayor.");
            }else{
                System.out.println("El segundo número introducido es mayor.");
            }
        }



    }
}