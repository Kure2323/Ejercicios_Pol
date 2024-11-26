package Unidad_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac_sopa {
    public void sopa() {

        Scanner entrada = new Scanner(System.in);

        //Todas las variables, vectores y matrices usadas a lo largo del programa
        int filas;
        int columnas;
        String[] vector_sopa;
        String[] palabra;
        String[] palabras;
        int pos_f;
        int pos_c;
        int final_posf = 0;
        int final_posc = 0;
        int pos_palabra = 0;
        int aciertos = 1;
        boolean encontrado = false;
        int p = 0;  //Usado para ir pasando de palabra en palabra en el array 'palabras'

        //Pedir filas y columnas
        while (true) {  //bucle para volver a pedir datos en caso de 'catch'

            try {
                System.out.println("Introduce el número de filas:");
                filas = entrada.nextInt();  //Número de filas de la matriz sopa
                System.out.println("Introduce el número de columnas:");
                columnas = entrada.nextInt();   //Número de columnas de la matriz sopa
                if (filas <= 0 || columnas <= 0) {
                    System.out.println("No debe ser menor a 1.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Introduce valores válidos");
                entrada.nextLine();
            }

        }

        String[][] sopa = new String[filas][columnas];  //Matriz de la sopa de letras

        //Pedir sopa
        for (int i = 0; i < sopa.length; i++) {

            while (true) {

                System.out.println("Introduce las letras de la fila " + (i + 1));
                String fila = entrada.next();
                String vector[] = fila.replace(" ", "").split("");   //Realiza un split a lo introducido
                if (vector.length != columnas) {    //Comprueba que lo introducido es de mismo tamaño que lo anteriormente estipulado
                    System.out.println("Formato incorrecto: " + columnas + " letras.");
                    entrada.nextLine();
                    continue;
                }
                if (fila.matches("[A-Za-z]+") == false) {   //Únicamente permite la entrada de valores como letras
                    System.out.println("Solo puede introducir letras.");
                    entrada.nextLine();
                    continue;
                }
                vector_sopa = vector;
                break;

            }
            for (int j = 0; j < sopa[0].length; j++) {  //Transfiere los datos introducidos a la matriz
                sopa[i][j] = vector_sopa[j];
            }

        }

        //Mostrar sopa
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                System.out.print(sopa[i][j] + "  ");
            }
            System.out.println();
        }


        //Pedir palabra
        System.out.println("Introduzca la palabra a buscar:");
        palabras = entrada.next().split(","); //Contenedor de palabras

        while (true) {
            if (!palabras[p].matches("[a-zA-Z ]+")) {  //Paso un filtro para comprobar que tan solo son letras
                System.out.println("Valores incorrectos en la entrada '" + palabras[p] + "'.");
                if (p == palabras.length-1) {   //En caso de que p sea la última posición hacemos return
                    return;
                } else {    //En caso contrario simplemente sigue el programa
                    p++;
                    continue;
                }

            }
            encontrado = false;
            aciertos = 1;
            palabra = palabras[p].split("");  //Hago de la palabra un array para facilitar el trabajo próximo
            //Búsqueda y localización de la palabra en la sopa (Recorrido 3x3)
            Todo:
            for (int i = 0; i < sopa.length; i++) { //Bucle para ir de fila en fila

                for (int j = 0; j < sopa[0].length; j++) {  //Bucle para ir de columna en columna
                    pos_palabra = 0;    //Pos de la array de la palabra a buscar, la busco de posición en posición
                    final_posf = i;
                    final_posc = j;

                    if (sopa[i][j].toLowerCase().equals(palabra[pos_palabra].toLowerCase())) {  //Compara si la posición del recorrido de la matriz coincide con la primera letra de la palabra
                        pos_palabra++;  //Suma uno y pasa a la siguiente letra de la palabra

                        if (aciertos == palabra.length) {   //Comprobarnte de aciertos
                            encontrado = true;
                            break Todo; //Sale de todos los bucles
                        }
                        //Bucle interno para cada posición alrededor del punto de partida (3x3)
                        //Se trata de tomar la posición 'i' y 'j' para trazar una búsqueda de 1 letra de largo a su alrededor haciendo uso de otros dos bucles for
                        for (int k = -1; k < 2; k++) {

                            interno:
                            for (int l = -1; l < 2; l++) {

                                //Chuleta para la posición encontrada donde: -1 -1 = arriba izquierda, -1 0 = arriba, -1 1 = arriba derecha... etc
                                //                            System.out.print(k + " " + l + "/");
                                try {   //todo se encuentra dentro de un try catch pues cabe la posibilidad de andar buscando fuera de la matriz

                                    if (k == 0 && l == 0) { //No nos interesa buscar en la posición 0, 0 respecto a la primera letra encontrada por lo que seguimos antes de hacer más
                                        continue interno;
                                    }
                                    pos_f = k;  //Guardo los valores para ir sumándose en un futuro
                                    pos_c = l;
                                    if (sopa[i + k][j + l].toLowerCase().equals(palabra[pos_palabra].toLowerCase())) {  //Sumamos a las posiciones i y j, k y l para buscar a su alrededor más aciertos

                                        aciertos++;
                                        if (aciertos == palabra.length) {
                                            encontrado = true;  //Boolean que marca que la palabra ha sido encontrada
                                            break Todo; //Al acertar todas sale de todos los bucles
                                        }

                                        for (int m = 0; m < palabra.length - 2; m++) {  //Bucle en busca de más posibles aciertos en la dirección estipulada (pos_f y pos_c). .length - 2 pues una vez llegas al bucle por lo menos ha encontrado ya 2 letras

                                            pos_palabra++;
                                            pos_f += k; //Se expande en la dirección encontrada la anterior letra
                                            pos_c += l;
                                            if (sopa[i + pos_f][j + pos_c].toLowerCase().equals(palabra[pos_palabra].toLowerCase())) {  //Comprueba si coinciden y le otorga aciertos si así es
                                                aciertos++;
                                                if (aciertos == palabra.length) {
                                                    encontrado = true;
                                                    break Todo;
                                                }
                                            } else {    //En caso de no coincidir se dirige a la siguiente posición del 3x3
                                                aciertos = 1; //Reinicia el contador de aciertos
                                                pos_palabra = 1;    //Y el de la posición de palabra a 1 pues es posible que no esté en la posición [-1, 0], pero sí en la [-1, 1]
                                                continue interno;
                                            }

                                        }
                                    } else {    //Una vez repasado todas las posibles posiciones del 3x3 y no estar reinicia el contador de aciertos
                                        aciertos = 1;
                                    }
                                } catch (
                                        ArrayIndexOutOfBoundsException e) {    //En caso de estar buscando fuera de los límites simplemente pasa a la siguiente, no haría falta el continue, pero lo dejo para ubicarme
                                    continue interno;
                                }
                            }
                        }
                    }
                }
            }

            if (encontrado == false) {  //Comprueba q haya sido encontrada la palabra y muestra uno de los dos siguiente mensajes
                System.out.println("La palabra " + palabras[p] + " no se encuentra en la sopa de letras.");
            } else {
                System.out.println("La palabra " + palabras[p] + " está en la posición: " + final_posf + ", " + final_posc);
            }
            p++;
            if (p==palabras.length){ //Una vez cubiertas todas las palabras se termina le programa
                return;
            }
        }
    }
}
