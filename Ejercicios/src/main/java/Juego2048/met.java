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
        }

    }

    public static int[][] createInitial() {

        int num = rdm.nextInt(0,7);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == 0) {

                }

            }
        }
        return matriz;

    }

}
