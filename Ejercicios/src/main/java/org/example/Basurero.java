package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basurero {
    public static void main(String[]arg){
        Scanner entrada = new Scanner(System.in);

        boolean tc = true;

        while(tc){
            try {
                System.out.println("Introduce un número");
                int num = entrada.nextInt();
                tc = false;

            } catch (InputMismatchException e) {
                System.out.println("Gilipollas...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("Gilipollas");
                System.out.println("Vuelve a introducirlo reventao");
                entrada.nextLine();
            }
        }


    }
}
