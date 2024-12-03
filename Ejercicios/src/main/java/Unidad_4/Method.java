package Unidad_4;

import java.util.Arrays;
import java.util.Random;

public class Method {

    public static int[][] RdmMatriz(int[][] matriz) {

        Random rdm = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rdm.nextInt(-51,51); //Valor a cambiar
            }
        }
        return matriz;
    }   //Rellena la matriz con valores aleatórios (Hasta 50)

    public static void MostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }   //Muestra por pantalla la matriz introducida

    public static int[] RdmArray(int[] array) {
        Random rdm = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rdm.nextInt(51); //Valor a cambiar
        }
        return array;
    }   //Rellena la array con valores aleatórios (Hast 50)

    public static int[][] OrdenarMatriz(int[][] matriz) {

        int pos = (matriz.length*matriz[0].length)-1;
        int[] vector = new int[pos + 1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vector[pos--] = matriz[i][j];
            }
        }
        pos++;
        Arrays.sort(vector);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = vector[pos++];
            }
        }



        return matriz;
    }   //Ordena la matriz de menor a mayor (Orden de posición)







}