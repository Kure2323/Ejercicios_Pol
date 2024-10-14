package Unidad_2;

import java.util.Scanner;

public class Basurero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String j1 = ".";
        String j2 = ".";
        System.out.println("Jugador 1, introduce el objeto.");
        j1 = entrada.next();
        String p1 = j1.substring(0,1);


        while(j2 != j1){
            System.out.println("Jugador 2: Veo veo una cosita que empieza por la letra: " + p1);
            j2 = entrada.next();

            System.out.println("Has fallado, lelo.");

        }
        System.out.println("Enhorabuena, has acertado.");
    }
}
