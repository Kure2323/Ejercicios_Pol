package Comparadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class Prueba_mapas {


    public static void main(String[] args) {
        Map<Integer,String> mapita = new HashMap<>();

        mapita.put(1234,"Patricia");
        mapita.put(5678,"Manuel");
        mapita.put(3456,"Raúl");

        List<Map.Entry<Integer,String>> listaMapa = new ArrayList<>(mapita.entrySet());
        listaMapa.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Integer,String> mapita2 : listaMapa) {

            System.out.println(mapita2.getKey() + " con nombre " + mapita2.getValue());

        }



    }

}
