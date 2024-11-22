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
        int suma = 0;
        int filas = rdm.nextInt(1,6);
        int columnas = rdm.nextInt(1,6);

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = rdm.nextInt(10) + 1;

            }
        }

        for (int[] fila: matriz) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + suma);
            suma=0;
        }
        System.out.println();

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma+=matriz[j][i];
            }
            System.out.println("Columna " + i + ": " + suma);
            suma=0;

        }


    }
    public void ejsmatriz3() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la cantidad de alumnos:");
        int filas = entrada.nextInt();
        System.out.println("Introduce la cantidad de asignaturas:");
        int columnas = entrada.nextInt();
        String[][] matriz = new String[filas + 1][columnas + 1];
        int pos = 1;

        for (int i = 1; i < matriz.length; i++) {   //PIDO EL NOMBRE DE LOS ESTUDIANTES CON UN BUCLES FOR POR POSICIÓNES
            System.out.println("Introduce el nombre del estudiante número " + i);
            matriz[i][0] = entrada.next();
        }

        for (int i = 1; i < matriz[0].length; i++) {    //PIDO EL NOMBRE DE LAS ASIGNATURAS
            System.out.println("Introduce el nombre de la asignatura número " + i);
            matriz[0][i] = entrada.next();
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                System.out.println("Introduce la nota de " + matriz[i][0] + " para la asignatura de " + matriz[0][j]);
                matriz[i][j] = entrada.next();
            }

        }
        matriz[0][0] = "Estudiantes";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        //Nota media
        float media = 0;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                media = Integer.parseInt(matriz[i][j]) + media;
            }
            System.out.println("La media de " + matriz[i][0] + " es : " + (media/columnas));
            media=0;
        }
        System.out.println();
        for (int i = 1; i < matriz[0].length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                media = Integer.parseInt(matriz[j][i]) + media;
            }
            System.out.println("La media de " + matriz[0][i] + " es : " + (media/filas));
            media=0;
        }
    }
    public void vectores_matrices() {

        Scanner entrada = new Scanner(System.in);

        int vector[] = {3,4,5,3,2};

        int matriz[][] = new int[2][vector.length];

        for (int i = 0; i < vector.length; i++) {
            matriz[0][i] = vector[i];

        }
        for (int[] filas : matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }
        System.out.println();

        int matriz2[][] = new int[3][4];

        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Introduce valores de la fila " + i);
            String fila[] = entrada.next().split(",");
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = Integer.parseInt(fila[j]);
            }
        }
        for (int[] filas : matriz2) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }


        String matriz3[][] = new String[10][10];

        for (int i = 0; i < matriz3.length; i++) {
            System.out.println("Introduce valores de la fila " + i);
            String fila[] = entrada.next().split("");
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j] = fila[j];
            }
        }
        for (String[] filas : matriz3) {
            for (String columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }










    }
}

