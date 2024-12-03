package Unidad_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

    public static void MostrarMatrizInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }   //Muestra por pantalla la matriz introducida

    public static void MostrarMatrizStr(String[][] matriz) {
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


    //Ejercicios
    public static int Cubo(int num) {
        num = num * num * num;
        return num;
    }

    public static Integer[] Ejercicio21(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        return array;
    }

    public static void Ejercicio22(Integer[] array, int num) {

        if (Arrays.asList(array).contains(num) == true) {
            System.out.println("Contiene el número introducido.");
        } else {
            System.out.println("No contiene el número introducido.");
        }

    }

    public static int NumVocales(String palabra) {

        String[] letras = palabra.split("");
        int vocales = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i].toLowerCase().equals("a")||letras[i].toLowerCase().equals("e")||letras[i].toLowerCase().equals("i")||letras[i].toLowerCase().equals("o")||letras[i].toLowerCase().equals("u")) {
                vocales++;
            }
        }


        return vocales;
    }

    public static float[] dias() {


        Scanner entrada = new Scanner(System.in);

        float[] vpasta = new float[6];
        int i = 0;

        do {
            vpasta[i] = entrada.nextFloat();

            i++;

        } while (vpasta[i] != -1);


        return vpasta;
    }







}
