package Unidad_2;

import java.util.Scanner;

public class Pre6 {
    void ejecutar(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la cantidad de alumnos:");
        int cant = entrada.nextInt();
        double total_edad = 0;
        double total_altura = 0;
        int año = 0;
        int estatura = 0;
        int i = 1;

        while (i <= cant) {
            System.out.println("Introduce la edad del alumno número " + i);
            double edad = entrada.nextInt();
            total_edad = edad + total_edad;
            if (edad > 18) {
                año++;
            }
            System.out.println("Introduce la altura en cm del alumno número " + i);
            double altura = entrada.nextInt();
            total_altura = altura + total_altura;
            if (altura > 175) {
                estatura++;
            }
            i++;
        }
        double media_edad = total_edad/cant;
        double media_altura = total_altura/cant;
        System.out.println("La edad media de los alumnos es: " + media_edad);
        if (año > 0) {
            System.out.println(año + " alumnos son mayores de edad");
        }
        System.out.println("La altura media de los alumnos es: " + media_altura);
        if (estatura > 0) {
            System.out.println(estatura + " alumnos miden más de 175 cm");
        }
    }
}
