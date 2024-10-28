package Unidad_2;

import java.util.Scanner;

public class Pre5 {
    void ejecutar(){

        Scanner entrada = new Scanner(System.in);



        System.out.println("Introduce el sueldo número 1");
        int sueldo1 = entrada.nextInt();
        System.out.println("Introduce el sueldo número 2");
        int sueldo2 = entrada.nextInt();
        System.out.println("Introduce el sueldo número 3");
        int sueldo3 = entrada.nextInt();
        System.out.println("Introduce el sueldo número 4");
        int sueldo4 = entrada.nextInt();
        System.out.println("Introduce el sueldo número 5");
        int sueldo5 = entrada.nextInt();

        int max = 0;
        String xam = "";

        if (max < sueldo1) {
            max = sueldo1;
            xam = "El sueldo más alto es el primero";
        }
        if (max < sueldo2) {
            max = sueldo2;
            xam = "El sueldo más alto es el segundo";
        }
        if (max < sueldo3) {
            max = sueldo3;
            xam = "El sueldo más alto de el tercero";
        }
        if (max < sueldo4) {
            max = sueldo4;
            xam = "El sueldo más alto es el cuarto";
        }
        if (max < sueldo5) {
            max = sueldo5;
            xam = "El sueldo más alto es el quinto";
        }

        System.out.println(xam);
        if (sueldo1 > 1000){
            System.out.println("El primer sueldo es mayor a 1000");
        }
        if (sueldo2 > 1000) {
            System.out.println("El segundo sueldo es mayor a 1000");
        }
        if (sueldo3 > 1000){
            System.out.println("El tercer sueldo es mayor a 1000");
        }
        if (sueldo4 > 1000) {
            System.out.println("El cuarto sueldo es mayor a 1000");
        }
        if (sueldo5 > 1000) {
            System.out.println("El quinto sueldo es mayor a 1000");
        }
    }
}
