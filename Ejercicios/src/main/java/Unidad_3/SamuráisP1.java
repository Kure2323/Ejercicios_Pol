package Unidad_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SamuráisP1 {
    void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int rdm = random.nextInt(7);

        //Sentencio todas las variables y arrays que voy a ir usando a lo largo del programa

        int[] equipo1 = new int[7];
        String[] team = new String[0];
        int[] equipo2 = new int[7];
        int suma = 0;
        boolean ver = false;

        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        for (int j = 0; j < 2; j++) {
            do {    //Realizo un bucle como filtro para las arrays
                System.out.println("Equipo " + (j + 1));
                ver = false;    //Variables que necesitan ser reiniciadas por cada vuelta del bucle
                suma = 0;
                System.out.println("Introduce la potencia de los samurais:");
                try{    //Try-catch para salvar posibles entradas de valores no deseados
                    String entry = entrada.nextLine();
                    team = entry.replace(" ","").split(",");    //Quito los espacios para salvar errores
                    System.out.println(Arrays.toString(team));
                    if (team.length != 7) { //En caso de que la array no tenga una capacidad de 7
                        System.out.println("El equipo debe de ser de 7");
                    } else {
                        for (int i = 0; i < 7; i++) {   //Bucle para pasar a int la array
                            int num = Integer.parseInt(team[i]);
                            suma += num;    //Valor que uso para verificar que entre todas las potencias suma 30
                            equipo2[i] = num;
                            if (num > 24 || num < 1) {  //En caso de que la potencia del samurai esté fuera de los valores establecidos
                                ver = true; //Cambia el valor de ver para que reinicie el bucle
                                System.out.println("Los valores no deben ser mayores a 24 o menores a 1.");
                            }
                        }
                        if (suma != 30) {   //En caso de que el sumatorio no de 30
                            System.out.println("ERROR. La potencia total no suma 30.");
                        }
                    }
                }catch (NumberFormatException e){   //En caso de saltar el catch salta el siguiente mensaje y se reinicia el bucle por longitud de la array a falta del error
                    System.out.println("Debe introducir únicamente números y entre comas de la siguiente manera: 1,2,3,4,5,6,7");
                }
            } while (team.length != 7 || suma!= 30 || ver == true); //Filtro para salir del bucle de elección de potencias
            System.out.println("Equipo completado.");
            if (j == 0) {   //Copio el equipo para poder pedir el segundo sin perder el primero
                equipo1 = equipo2.clone();
            }
        }
        System.out.println(Arrays.toString(equipo1));
        System.out.println(Arrays.toString(equipo2));

        //8888888888888888888888888888888888888888888888888888888888888888888888888888888888888

        int p1 = 0; //Número de eliminaciones de cada equipo
        int p2 = 0;
        for (int i = 0; ; i++) {    //Bucle infinito para la pelea de saumrai
            if (rdm == 7) { //Para que vuelva al inicio de la array en caso de seguir la pelea
                rdm = 0;
            }
            if (equipo1[rdm] > equipo2[rdm]){   //Cuando gana el equipo 1 suma un punto y deja a 0 al samurai del equipo 2
                System.out.println("Samurai " + (rdm + 1) + ". Gana Equipo 1. " + equipo1[rdm] + " vs " + equipo2[rdm]);
                equipo2[rdm] = 0;
                p1++;
            }
            if (equipo2[rdm] > equipo1[rdm]){   //Lo mismo pero del otro lado
                System.out.println("Samurai " + (rdm + 1) + ". Gana Equipo 2. " + equipo1[rdm] + " vs " + equipo2[rdm]);
                equipo1[rdm] = 0;
                p2++;
            }
            if (equipo2[rdm] == equipo1[rdm]) { //En caso de empate ambos puntuan y ambos ponen a 0 el samurai
                System.out.println("¡EMPATE! ambos samurais mueren " + equipo1[rdm] + " vs " + equipo2[rdm]);
                equipo2[rdm] = 0;
                equipo1[rdm] = 0;
                p1++;
                p2++;
            }
            if (p1 > 4) {   //En caso de que un equipo obtiene más de 4 ptos quiere decir que ha ganado
                if (p1 == p2) { //En caso de ser empate
                    System.out.println("¡EMPATE!");
                    break;
                }else{
                    System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + p2 + " bajas.");
                    break;
                }
            }
            if (p2 > 4) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + p1 + " bajas.");
                break;
            }
            rdm++;  //Pasa a la siguiente posición de las arrays
        }
    }
}