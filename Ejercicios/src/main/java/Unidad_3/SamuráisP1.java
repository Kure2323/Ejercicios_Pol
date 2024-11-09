package Unidad_3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SamuráisP1 {
    void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int rdm = random.nextInt(7);

        int suma1 = 0;
        boolean ver = false;
        String[] team1 = new String[0];
        int[] equipo1 = new int[7];

        String[] team2 = new String[7];
        int[] equipo2 = new int[7];
        int suma2 = 0;
        boolean vor = false;

        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        System.out.println("Equipo 1");

        do {
            ver = false;
            suma1 = 0;
            System.out.println("Introduce la potencia de los samurais:");
            try{
                String entry1 = entrada.nextLine();
                team1 = entry1.replace(" ", "").split(",");
                System.out.println(Arrays.toString(team1));
                if (team1.length != 7) {
                    System.out.println("El equipo debe de ser de 7");
                } else {
                    for (int i = 0; i < 7; i++) {
                        int num = Integer.parseInt(team1[i]);
                        suma1 += num;
                        equipo1[i] = num;
                        if (num > 24 || num < 1) {
                            ver = true;
                        }
                    }
                    if (ver == true) {
                        System.out.println("Los valores no deben ser mayores a 24 o menores a 1.");
                    }
                    if (suma1 != 30) {
                        System.out.println("ERROR. La potencia total no suma 30.");
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Debe introducir únicamente números y entre comas de la siguiente manera: 1,2,3,4,5,6,7");
            }

        } while (team1.length != 7 || suma1!= 30 || ver == true);
        System.out.println("Equipo completado.");

        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        System.out.println("Equipo 2");

        do {
            vor = false;
            suma2 = 0;
            System.out.println("Introduce la potencia de los samurais:");
            try{
                String entry2 = entrada.nextLine();
                team2 = entry2.replace(" ","").split(",");
                System.out.println(Arrays.toString(team2));
                if (team2.length != 7) {
                    System.out.println("El equipo debe de ser de 7");
                } else {
                    for (int i = 0; i < 7; i++) {
                        int num2 = Integer.parseInt(team2[i]);
                        suma2 += num2;
                        equipo2[i] = num2;
                        if (num2 > 24 || num2 < 1) {
                            vor = true;
                        }
                    }
                    if (vor == true) {
                        System.out.println("Los valores no deben ser mayores a 24 o menores a 1.");
                    }
                    if (suma2 != 30) {
                        System.out.println("ERROR. La potencia total no suma 30.");
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Debe introducir únicamente números y entre comas de la siguiente manera: 1,2,3,4,5,6,7");
            }
            
        } while (team2.length != 7 || suma2!= 30 || vor == true);
        System.out.println("Equipo completado.");

        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; ; i++) {
            if (rdm == 7) {
                rdm = 0;
            }
            if (equipo1[rdm] > equipo2[rdm]){
                System.out.println("Samurai " + (rdm + 1) + ". Gana Equipo 1. " + equipo1[rdm] + " vs " + equipo2[rdm]);
                equipo2[rdm] = 0;
                p1++;
            }
            if (equipo2[rdm] > equipo1[rdm]){
                System.out.println("Samurai " + (rdm + 1) + ". Gana Equipo 2. " + equipo1[rdm] + " vs " + equipo2[rdm]);
                equipo1[rdm] = 0;
                p2++;
            }
            if (equipo2[rdm] == equipo1[rdm]) {
                System.out.println("¡EMPATE! ambos samurais mueren " + equipo1[rdm] + " vs " + equipo2[rdm]);
                equipo2[rdm] = 0;
                equipo1[rdm] = 0;
                p1++;
                p2++;
            }
            if (p1 > 4) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + p2 + " bajas.");
                break;
            }
            if (p2 > 4) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + p1 + " bajas.");
                break;
            }
            rdm++;
        }






    }
}
