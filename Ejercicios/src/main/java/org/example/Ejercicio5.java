package org.example;
import java.util.Scanner;

//Realizar un programa para calcular el mínimo de 3 números diferentes leídos desde teclado.
//En caso de que el usuario introduzca dos o tres números iguales, informaremos con el siguiente mensaje:
//        "ERROR: hay números introducidos que son iguales".

public class Ejercicio5 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero1 = entrada.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = entrada.nextInt();
        System.out.println("Introduce otro número más");
        int numero3 = entrada.nextInt();

        if(numero1 == numero2 || numero2 == numero3 || numero3 == numero1){
            System.out.println("ERROR: hay números introducidos que son iguales");
        }else{
            if()
        }
    }
}
