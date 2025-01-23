package Juego2048;


import java.util.Random;
import java.util.Scanner;

public class main {

    static Scanner in = new Scanner(System.in);
    static Random rdm = new Random();

    public static void main(String[] args) {

        showIntroduction();
        int[][] matriz = createInitial();
        showMatrix(matriz);

    }



    public static void showIntroduction() {
        System.out.println("Bienvenido a 2048.");
        System.out.println("Para mover las fichas se usan las siguientes teclas: 'wasd'.");
        System.out.println();
        System.out.println("Comencemos!!");
        System.out.println();
    }

    /**
     * Provisional de mostrar matriz del juego
     * Deberá ser cambiado por el recuadro del juego
     * Debe redirigir a la siguiente acción del juego (Pedir movimiento)
     * @param matriz
     */
    private static void showMatrix(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        showInterRound();
        requestMove(matriz);
    }

    private static void showInterRound() {
        System.out.println();
        System.out.println("Introduce el movimiento a efectuar:");
        System.out.println();

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

    private static void requestMove(int[][] matriz) {

        String respuesta = in.next().toLowerCase();

        switch (respuesta){
            case "w":
                for (int i = 0; i < 4; i++) {
                    matriz = antiClockRotation(matriz);
                }
                matriz = executeDefaultMove(matriz);
                matriz = antiClockRotation(matriz);
                break;
            case "a":
                matriz = executeDefaultMove(matriz);
                fusionNumbers(matriz);
                break;
            case "s":
                matriz = executeDefaultMove(antiClockRotation(matriz));
                for (int i = 0; i < 3; i++) {
                    matriz = antiClockRotation(matriz);
                }
                break;
            case "d":
                for (int i = 0; i < 2; i++) {
                    matriz = antiClockRotation(matriz);
                }
                matriz = executeDefaultMove(matriz);
                for (int i = 0; i < 2; i++) {
                    matriz = antiClockRotation(matriz);
                }
                break;
            default:
                requestMove(matriz);
                break;
        }

        showMatrix(matriz);
    }

    /**
     * It's default movement direction is left because of the way of the 'for' is reading the matrix.
     * It is executed 4 times due to the possibility of a number on the right side.
     * Only is needed a method to fusion the numbers and to rotate the matrix the way the user wants to move.
     * May it need to be executed twice in a single move due to the fact that maybe 4 numbers fusion and there would be
     * blanc spaces.
     * @param matriz
     * @return
     */
    private static int[][] executeDefaultMove(int[][] matriz) {
        //Default exec direction left
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 1; j < matriz[i].length; j++) {

                    if (matriz[i][j - 1] == 0) {
                        matriz[i][j - 1] = matriz[i][j];
                        matriz[i][j] = 0;
                    }

                }
            }
        }
        return matriz;
    }

    private static void fusionNumbers(int[][] matriz) {
        //It is necessary an executeDefaultMove
        //and the given matrix might be moved to the left

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {

                if (matriz[i][j] == matriz[i][j - 1]) {
                    matriz[i][j - 1] += matriz[i][j];
                    matriz[i][j] = 0;
                }

            }
        }
        executeDefaultMove(matriz);

    }

    /**
     * Rotate the matrix in anti clock rotation so:
     * The default move is left, with antiClockRotation will execute an down move
     * NO FURULA
     * @param matriz
     * @return
     */
    private static int[][] antiClockRotation(int[][] matriz) {

        int[][] result = new int[4][4];
        int[] array = new int[4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                array[j] = matriz[i][j];

            }
            result = auxAntiClockRotation(array,i,result);
        }
        return result;

    }
    private static int[][] auxAntiClockRotation(int[] array, int fori, int[][] result) {

        for (int i = 0; i < array.length; i++) {
            result[i][fori] = array[i];
        }
        return result;

    }


}
