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

        if(sueldo1 > sueldo2 && sueldo1 > sueldo3 && sueldo1 > sueldo4 && sueldo1 > sueldo5){
            System.out.println("El primer sueldo es el más alto " + sueldo1);
        }else if(sueldo2 > sueldo1 && sueldo2 > sueldo3 && sueldo2 > sueldo4 && sueldo2 > sueldo5){
            System.out.println("El segundo sueldo es el más alto " + sueldo2);
        }else if(sueldo3 > sueldo1 && sueldo3 > sueldo2 && sueldo3 > sueldo4 && sueldo3 > sueldo5){
            System.out.println("El tercer sueldo es el más alto " + sueldo3);
        }else if( sueldo4 > sueldo1 && sueldo4 > sueldo2 && sueldo4 > sueldo3 && sueldo4 > sueldo5){
            System.out.println("El cuarto sueldo es el más alto " + sueldo4);
        }else if(sueldo5 > sueldo1 && sueldo5 > sueldo2 && sueldo5 > sueldo3 && sueldo5 > sueldo4){
            System.out.println("El quinto sueldo es el más alto " + sueldo5);
        }









    }
}
