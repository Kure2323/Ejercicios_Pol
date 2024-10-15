package Unidad_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ampliacion1 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca su altura: ");
        boolean has = true;
        int h = 0;

        while (has){
            try{
                h = entrada.nextInt();
                if (h > 0){
                    if (h <= 150){
                        System.out.println("Persona de altura baja.");
                    }else if (h >= 151 && h <= 175){
                        System.out.println("Persona de altura media.");
                    }else if (h <= 176){
                        System.out.println("Persona alta.");
                    }
                    has = false;
                }else{
                    System.out.println("Error, no deben ser valores negativos. Introduzca de nuevo:");
                }

            }catch (InputMismatchException e){
                System.out.println("Introduzca un dato numérico");
                entrada.nextLine();
            }
        }





    }
}
