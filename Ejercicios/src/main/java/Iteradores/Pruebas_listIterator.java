package Iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Pruebas_listIterator {

    public static void main(String[] args) {

        ArrayList<Character> letritas = new ArrayList<>(Arrays.asList('a','b','c','x','z'));

        ListIterator<Character> iterator = letritas.listIterator();

        while (iterator.hasNext())  {
            System.out.print(iterator.next() + " ");
            iterator.set('r');

            if (letritas.get(3) == 'x') {
                iterator.set('r');
            }
            iterator.add('z');

        }
        System.out.println();
        ListIterator<Character> iteratorPaTras = letritas.listIterator(letritas.size());

        while (iteratorPaTras.hasPrevious())  {
            System.out.print(iteratorPaTras.previous() + " ");



        }

    }

}
