package Unidad_4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

    public static void ejercicio1() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el número `N`");
        int n = entrada.nextInt();
        System.out.println("El número `N` al cubo es: " + Method.Cubo(n));

    }

    public static void ejercicio2() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce N:");
        int cant = entrada.nextInt();

        Integer[] vector = new Integer[cant];

        Method.Ejercicio21(vector);

        System.out.println(Arrays.toString(vector));

        System.out.println("Introduzca un valor:");

        cant = entrada.nextInt();
        Method.Ejercicio22(vector, cant);





    }

    public static void ejercicio3() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una cadena de palabras");
        String palabra = entrada.next();

        palabra = palabra.toUpperCase();

        System.out.println(palabra);

        System.out.println("Hay un total de " + Method.NumVocales(palabra) + " vocales en esta palabra.");


    }

    public static int factorial(int num) {

        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact*=i;
        }

        return fact;

    }
    
    public static int factorial_recursivo(int num) {

        if (num == 0 || num == 1) {
            return 1;
        }

        return num*factorial_recursivo(num-1);



    }

    public static void triangulo(int num) {

        String ast = "";

        for (int i = 0; i < 4; i++) {
            ast += "* ";
            System.out.println(ast);
        }

    }

    public static void rectriangulo(int num) {

        String ast = "* ";

        if (num + 1 < 0) {
            System.exit(0);
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print(ast);
            }
            System.out.println();
            rectriangulo(num -1);

        }


    }

    public static int fibonacci(int n){

        if (n<2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    public static int nums(int num) {

        if (num != 0) {
            System.out.print(nums(num-1) + 1 + " ");
        }
        return num;

    }

    public static long sums(long num) {

        if (num != 0) {
            num = sums(num-1) + num;
        }
        return num;
    }


}
