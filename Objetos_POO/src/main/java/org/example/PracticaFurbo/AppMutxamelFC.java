package org.example.PracticaFurbo;

public class AppMutxamelFC {

    public static void main(String[] args) {

        Jugador cristianito = new Jugador("Cristianito", 34, Equipos.CADETE, 23, Posiciones.DELANTERO);
        System.out.println(cristianito);
        Jugador messi = new Jugador("Messi", 23, Equipos.INFANTIL, 23, Posiciones.CENTROCAMPISTA);
        System.out.println(messi);


        Entrenador cholo = new Entrenador("Cholo Simeone", 54, Equipos.ALEVIN, "3-4-5");
        System.out.println(cholo);

    }

}
