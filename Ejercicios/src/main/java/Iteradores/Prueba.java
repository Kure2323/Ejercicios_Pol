package Iteradores;

import javax.imageio.event.IIOReadProgressListener;
import java.util.*;

public class Prueba {

    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(1,23, 45,3,4,5));

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {

            Integer num = it.next();

            if (num == 23) {
                it.remove();
            }

            System.out.println(num);
        }

        System.out.println(numeros);

        ArrayList<Casino> listaCasino = new ArrayList<>();
        listaCasino.add(new Casino("poker", 500));
        listaCasino.add(new Casino("ruleta", 25));
        listaCasino.add(new Casino("black jack", 50));

        Iterator<Casino> casinoIterator = listaCasino.iterator();

        while (casinoIterator.hasNext()) {
            Casino casino = casinoIterator.next();

            System.out.println(casino);

            if (casino.getApuesta_minima() > 0.20) {
                System.out.println("Raúl no puede jugar");
            }

            if (casino.getApuesta_minima() < 30) {
                casinoIterator.remove();
            }

        }

        System.out.println(listaCasino);

        HashMap<String,String> diccionario = new HashMap<>();
        diccionario.put("Hola","Helou");
        diccionario.put("Casa","House");
        diccionario.put("Lápiz","Pencil");

//        for (Map.Entry<String,String> df : diccionario.entrySet()) {
//            Es lo mismo que lo de abajo.
//        }

        Iterator<Map.Entry<String,String>> iter = diccionario.entrySet().iterator();


        while (iter.hasNext()) {
            Map.Entry<String,String> mapita = iter.next();
            System.out.println("Palabra en español: " + mapita.getKey() + ". Palabra en inglés: " + mapita.getValue());
        }


    }

}
