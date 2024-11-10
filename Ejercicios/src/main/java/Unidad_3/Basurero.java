package Unidad_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Basurero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int rdm = random.nextInt(7);

        //Sentencio todas las variables y arrays que voy a ir usando a lo largo del programa

        int suma1 = 0;
        boolean ver = false;
        String[] team1 = new String[0];
        int[] equipo1 = new int[7];

        String[] team2 = new String[0];
        int[] equipo2 = new int[7];
        int suma2 = 0;
        boolean vor = false;

        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888


        //Con un do while pido la potencia de los samurais del priimer equipo
        for (int j = 0; j < 2; j++) {
            do {    //No es más que el código del primer código pero duplicado cambiando el nombre de algunas variables

                System.out.println("Equipo " + (j + 1));
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
                                System.out.println("Los valores no deben ser mayores a 24 o menores a 1.");
                            }
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
            if (j == 0) {
                equipo1 = equipo2.clone();
            }
        }
        System.out.println(Arrays.toString(equipo1));
        System.out.println(Arrays.toString(equipo2));






    }
}
