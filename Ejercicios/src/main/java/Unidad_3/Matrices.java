package Unidad_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public void prueba() {

        Scanner entrada = new Scanner(System.in);

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
        //Otra forma de mostrar en pantalla
        for (int[] filas : matriz2) {
            System.out.print(Arrays.toString(filas));
            System.out.println();
        }
        System.out.println();
        //Otra forma de mostrar en pantalla
        for (int[] filas : matriz2) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }

        //Buscar dentro de la matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (matriz2[i][j] == 90) {
                    System.out.println("Existe 90.");
                    break;
                }
            }
        }

        //Pedir cada posición de una matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dime el valor de la posición (" + i + "," + j + ")");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }



    }
    public void identidad() {

        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;

                }
            }
        }

        for (int[] filas:matriz) {
            for (int columnas:filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("x ");
                } else if (matriz[i][j]==0) {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length-1; j >= 0; j--) {
                if (matriz[i][j] == 1) {
                    System.out.print("x ");
                } else if (matriz[i][j]==0) {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length-1; j >= 0; j--) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }




    }
    public void ejerciciochikitín() {

        int[][] matriz1 = {{1,5,9},{20,17,2}};
        int[][] matriz2 = {{3,2,57},{4,89,3}};
        int[][] bigass = new int[2][3];

        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("Formato incorrecto");
            return;

        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz2[i][j]>=matriz1[i][j]) {
                    bigass[i][j] = matriz2[i][j];
                    System.out.print(bigass[i][j] + " ");
                } else {
                    bigass[i][j] = matriz1[i][j];
                    System.out.print(bigass[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
    public void ejsmatriz1() {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Introduce la matriz 3x3");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Posición: " + i + ", " + j);
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Introduce el número a buscar:");
        int num = entrada.nextInt();
        int nota = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != num) {
                    nota++;
                    if (nota == 9) {
                        System.out.println("No se encuentra en la matriz");
                    }
                    continue;
                }
                System.out.println("El número " + num + " se encuentra en la posición (" + i + ", " + j + ")");
            }
        }
    }
    public void ejsmatriz2() {
        Random rdm = new Random();

        int[][] matriz = new int[rdm.nextInt(1,6)][rdm.nextInt(1,6)];

        int suma_filas = 0;
        int suma_columna = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila " + (i+1) + ":");
            suma_columna = 0;
            suma_filas = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rdm.nextInt(1,20);
                suma_columna = suma_columna + matriz[i][j];
            }
            System.out.println(suma_columna);

        }





    }
}

