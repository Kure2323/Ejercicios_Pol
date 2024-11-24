package Unidad_3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Prac_sopa {
    public void sopa() {

        Scanner entrada = new Scanner(System.in);
        Random rdm = new Random();

        int repes = 0;
        int filas;
        int columnas;
        String[] vector_sopa;
        String[] palabra;
        int pos_f;
        int pos_c;
        int final_posf = 0;
        int final_posc = 0;
        int pos_palabra = 0;
        int aciertos = 1;
        boolean encontrado = false;

        //Pedir filas y columnas
        while (true) {

            try{
                System.out.println("Introduce el número de filas:");
                filas = entrada.nextInt();
                System.out.println("Introduce el número de columnas:");
                columnas = entrada.nextInt();
                if (filas <= 0 || columnas <= 0) {
                    continue;
                }
                break;
            }catch(InputMismatchException e) {
                System.out.println("Introduce valores válidos");
                entrada.nextLine();
            }

        }

        String[][] sopa = new String[filas][columnas];

        //Pedir sopa
        for (int i = 0; i < sopa.length; i++) {

            filtro:
            while (true) {

                System.out.println("Introduce las letras de la fila " + (i+1));
                String fila = entrada.next();
                String vector[] = fila.split("");
                if (vector.length != columnas) {
                    System.out.println("Formato incorrecto: " + columnas + " letras.");
                    entrada.nextLine();
                    continue filtro;
                }
                if (fila.matches("[A-Za-z]+") == false) {
                    System.out.println("Solo puede introducir letras.");
                    entrada.nextLine();
                    continue filtro;
                }
                vector_sopa = vector;
                break filtro;

            }
            for (int j = 0; j < sopa[0].length; j++) {
                sopa[i][j] = vector_sopa[j];
            }

        }

        //Mostrar sopa
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }

        //Pedir palabra

        while (true) {
            System.out.println("Introduzca la palabra a buscar:");
            String busca = entrada.next();
            if (!busca.matches("[a-zA-Z]+")) {
                System.out.println("Valores incorrectos.");
                entrada.nextLine();
                continue;
            }
            palabra = busca.split("");
            break;
        }


        Todo:
        for (int i = 0; i < sopa.length; i++) {

            Siguiente_vuelta:
            for (int j = 0; j < sopa[0].length; j++) {
                pos_palabra = 0;
                final_posf = i;
                final_posc = j;

                if (sopa[i][j].toLowerCase().equals(palabra[pos_palabra].toLowerCase())) {
                    pos_palabra++;

                    if (aciertos == palabra.length) {
                        encontrado = true;
                        break Todo;
                    }
                    //Bucle interno para cada posición alrededor del punto de partida

                    for (int k = -1; k < 2; k++) {

                        interno:
                        for (int l = -1; l < 2; l++) {

                            //Chuleta
//                            System.out.print(k + " " + l + "/");
                            try {

                                if (k == 0 && l == 0) {
                                    continue interno;
                                }
                                pos_f = k;
                                pos_c = l;
                                if (sopa[i + k][j + l].toLowerCase().equals(palabra[pos_palabra].toLowerCase())) {

                                    aciertos++;
                                    if (aciertos == palabra.length) {
                                        encontrado = true;
                                        break Todo;
                                    }

                                    for (int m = 0; m < palabra.length - 2; m++) {

                                        pos_palabra++;
                                        pos_f += k;
                                        pos_c += l;
                                        if (sopa[i + pos_f][j + pos_c].toLowerCase().equals(palabra[pos_palabra].toLowerCase())) {
                                            aciertos++;
                                            if (aciertos == palabra.length) {
                                                encontrado = true;
                                                break Todo;
                                            }
                                        } else {
                                            aciertos = 1;
                                            pos_palabra = 1;
                                            continue interno;
                                        }

                                    }
                                } else {
                                    aciertos = 1;
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                continue interno;
                            }
                        }
                    }
                }
            }
        }
        if (encontrado == false) {
            System.out.println("La palabra no se encuentra en la sopa de letras.");
        } else {
            System.out.println("La palabra está en la posición: " + final_posf + ", " + final_posc);
        }











    }
}
