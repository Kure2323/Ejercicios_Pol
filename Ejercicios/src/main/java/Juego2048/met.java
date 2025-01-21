package Juego2048;

import java.util.Random;
import java.util.Scanner;

public class met {
    static Scanner in = new Scanner(System.in);
    static Random rdm = new Random();

    public static void showM(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]);

            }
            System.out.println();
        }

    }

    public static int[][] createInitial() {

        int num = rdm.nextInt(0,7);
        int[][] matriz = new int[4][4];
        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                count++;
                if (count == num) {
                    matriz[i][j] = 2;
                } else if (count == num + 2) {
                    matriz[i][j] = 2;
                }

            }
        }
        return matriz;

    }

    public static void requestMove() {
        switch (in.next().toLowerCase()){
            case "w":
                //Insertar método aquí
                break;
            case "a":
                //Insertar método aquí
                break;
            case "s":
                break;
            case "d":
                break;
        }
    }

    public static int[][] executeMove(int[][] matriz) {

        //Default exec direction downwards
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {



            }
        }


    }



}
