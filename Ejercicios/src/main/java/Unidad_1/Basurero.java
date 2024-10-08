package Unidad_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basurero {
    public static void main(String[]arg){
        Scanner entrada = new Scanner(System.in);

        String princeso = "Cara de puto culo";
        int letras = princeso.length();

        System.out.println("El tamaño de la frase es " + letras);

        char mini = princeso.charAt(5);
        System.out.println("La letra en la pos 5 es " + mini);

        String trozo = princeso.substring(8,12);
        System.out.println(trozo);

        String nombre = "      Pol        ";
        String nom = nombre.trim();
        System.out.println(nom);



    }
}
