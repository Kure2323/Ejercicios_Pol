package Unidad_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SamuráisP1 {
    void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int rdm = random.nextInt(7);

        int suma1 = 0;
        boolean ver = false;
        String[] team1;
        int[] equipo1 = new int[7];

        String[] team2;
        int[] equipo2 = new int[7];
        int suma2 = 0;
        boolean vor = false;


        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        System.out.println("Equipo 1");

        do {
            suma1 = 0;
            System.out.println("Introduce la potencia de los samurais:");
            String entry1 = entrada.nextLine();
            team1 = entry1.split(",");
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
        } while (team1.length != 7 || suma1!= 30 || ver == true);
        System.out.println("Equipo completado.");

        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        System.out.println("Equipo 2");

        do {
            suma2 = 0;
            System.out.println("Introduce la potencia de los samurais:");
            String entry2 = entrada.nextLine();
            team2 = entry2.split(",");
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
        } while (team2.length != 7 || suma2!= 30 || vor == true);
        System.out.println("Equipo completado.");

        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        for (int i = 0; i < 7; i++) {
            
        }






    }
}
