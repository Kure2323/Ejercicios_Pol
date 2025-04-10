package Iteradores;
// Esquema de la entrada: fin de la entrada
import java.util.*;

public class Problema144 {

    static Scanner in;

    public static boolean casoDePrueba() {

        if (!in.hasNext())
            return false;
        else {

            String entrada = in.nextLine();

            LinkedList<Character> palabra = new LinkedList<>();

            ListIterator<Character> it = palabra.listIterator();

            for (char c : entrada.toCharArray()) {

                switch (c) {

                    case '-':
                        while (it.hasPrevious()) {
                            it.previous();
                        }
                        break;
                    case '+':
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '*':
                        if (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()) {
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(c);
                        break;

                }


            }

            for (char c : palabra) {
                System.out.print(c);
            }
            System.out.println();




            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        while(casoDePrueba())
            ;

    } // main

} // class Solution