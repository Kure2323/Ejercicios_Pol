package Unidad_3;

import java.util.Arrays;

public class Matrices {
    public void prueba() {

        int matriz[][] = new int[3][4];

        int matriz2[][] = {{12,32,44,1},{33,2,90,56}};

        System.out.println(matriz2[0][2]);
        System.out.println("Tamaño fila: " + matriz2.length);
        System.out.println("Tamaño columna: " + matriz2[0].length);
        System.out.println(Arrays.toString(matriz2));


        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");

            }
            System.out.println();

        }




    }
}
