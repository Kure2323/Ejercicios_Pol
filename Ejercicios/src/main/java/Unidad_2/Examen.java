package Unidad_2;

import java.time.LocalDate;

import java.util.*;

public class Examen {
    void ejercicio1(){
        System.out.println("El ejercicio 1");
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Acabo de pensar un número [0-100]... ¿puedes adivinarlo? ¡Tienes 10 intentos!");
        int num = random.nextInt(101);
        System.out.println(num);
        for (int i = 1; i <= 10; i++){
            int intento = -1;
            try{
                System.out.println("Intento " + i + ". Introduce un número:");
                intento = entrada.nextInt();
            } catch (InputMismatchException e){
                entrada.nextLine();
            }

            if (intento < 0 || intento > 100){
                System.out.println("El número no puede ser negativo, mayor a 100 o letras.");
                continue;
            }

            if (num == intento) {
                System.out.println("¡HAS ACERTADO! El número era " + num);
                break;
            } else if (intento < num) {
                System.out.println("Tu número es menor al que he pensado.");
            } else if (intento > num) {
                System.out.println("Tu número es mayor al que he pensado.");
            }
            if (i == 10) {
                System.out.println("Te has quedado sin intentos, el número que estaba pensando era el " + num);
            }
        }













    }
    void ejercicio2(){
        System.out.println("El ejercicio 2");

        Scanner entrada = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        String hoys = today.toString();
        String actual = hoys.substring(0,4);
        int hoy = Integer.parseInt(actual);
        System.out.println(actual);
        int año = 0;

        while (true) {
            System.out.println("Introduce un año:");
            año = entrada.nextInt();
            if (año < 1900 || año > hoy) {
                System.out.println("No debe ser mayor al año actual ni menor al 1900");
                continue;
            }
            System.out.println(año);
            break;
        }

        for (int i = año; i < hoy; i++) {
            int cantidad = 0;
            int resto_cuatro = i % 4;
            int resto_cien = i % 100;
            int resto_cuatrocientos = i % 400;

            if (resto_cuatro == 0){
                if (resto_cien == 1) {

                }
            }
        }



    }
}
