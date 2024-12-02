package Unidad_4;

import java.util.Random;

public class MetodoPrincipal {

    public static void AleatorioMatriz(int[][] matriz) {
        Random rdm = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rdm.nextInt();
            }
        }
        return AleatorioMatriz();
    }








}
