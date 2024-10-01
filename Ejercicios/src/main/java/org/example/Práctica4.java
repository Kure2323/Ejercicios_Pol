package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Práctica4 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        boolean tc = true;
        int multiplicando = 0;
        int multiplicador = 0;

        while(tc) {
            try {
                System.out.println("Introduce el multiplicando (3 cifras):");
                multiplicando = entrada.nextInt();
                System.out.println("Introduce el multiplicador (3 cifras):");
                multiplicador = entrada.nextInt();
                tc = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce de nuevo");
                entrada.nextLine();
            }
        }

        while(multiplicador > 999 || multiplicando > 999 || multiplicando < 100 || multiplicador < 100){
            System.out.println("Error, deben ser números de 3 cifras");
            System.out.println("Introduce el multiplicando (3 cifras):");
            multiplicando = entrada.nextInt();
            System.out.println("Introduce el multiplicador (3 cifras):");
            multiplicador = entrada.nextInt();
        }

        int resultado = multiplicando * multiplicador;

        System.out.println("El producto de la multiplicación es: " + resultado);
        System.out.println("El proceso es:");
        System.out.println("   " + multiplicando);
        System.out.println(" x " + multiplicador);
        System.out.println("________");

        String num = Integer.toString(multiplicador);
        String num1 = num.substring(2,3);
        String num2 = num.substring(1,2);
        String num3 = num.substring(0,1);

        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        int num_3 = Integer.parseInt(num3);

        int rnum1 = num_1 * multiplicando;
        int rnum2 = num_2 * multiplicando;
        int rnum3 = num_3 * multiplicando;

        System.out.println("   " + rnum1);
        System.out.println("  " + rnum2 + "x");
        System.out.println(" " + rnum3 + "xx");
        System.out.println("________");
        System.out.println(resultado);
    }
}
