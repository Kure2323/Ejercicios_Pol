package Iteradores;

import java.util.*;

public class IteradorMecanografia {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce la palabra:");

        String entrada = in.nextLine();

        LinkedList<Character> palabra = new LinkedList<>();

        ListIterator<Character> it = palabra.listIterator();

        for (char c : entrada.toCharArray()) {

            switch (c) {

                case '<':
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()) {
                        it.previous();
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

    }

}
