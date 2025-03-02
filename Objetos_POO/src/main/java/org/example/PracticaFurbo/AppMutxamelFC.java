package org.example.PracticaFurbo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AppMutxamelFC {

    public static void main(String[] args) {

        //Creación de jugadores
        Jugador[] jugadores = {
                new Jugador("Messi", 23, Equipos.SENIOR, 1, Posiciones.CENTROCAMPISTA),
                new Jugador("Cristiano", 43, Equipos.SENIOR, 2, Posiciones.DELANTERO),
                new Jugador("Mariano", 33, Equipos.SENIOR, 3, Posiciones.DEFENSA),
                new Jugador("Juana", 21, Equipos.SENIOR, 4, Posiciones.CENTROCAMPISTA),
                new Jugador("Paola", 22, Equipos.SENIOR, 5, Posiciones.PORTERO),
        };

        //ArrayList del resto de tipos de clases por comodidad haciendo uso de polimorfismo
        ArrayList<MutxamelFC> personas = new ArrayList<>();

        personas.add(new Entrenador("Oak", 55, Equipos.SENIOR, "2-3-4"));
        personas.add(new  Masajista("Lola", 45, "Curso de masajista", 15));
        personas.add(new  Masajista("Manolo", 23, "AEO", 2));
        personas.add(new Acompanyante("Jose", 45, jugadores[0], "Padre"));
        personas.add(new Acompanyante("Manola", 67, jugadores[2], "Madre"));

        //Concentrarse
        for (Jugador jug : jugadores) {
            jug.concentrarse();
        }
        for (MutxamelFC mut : personas) {
            mut.concentrarse();
        }

        //Entrenar
        for (Jugador jug : jugadores) {
            jug.entrenar();
        }
        for (MutxamelFC mut : personas) {
            if (mut instanceof AccionesDeportivas) {
                ((AccionesDeportivas) mut).entrenar();
            }
        }

        //Dar masajes
        for (MutxamelFC mut : personas) {
            if (mut instanceof Masajista) {
                ((Masajista) mut).darMasaje(jugadores[0]);
            }
        }

        //Viajar a Madrid
        for (Jugador jug : jugadores) {
            jug.viajar("Madrid");
        }
        for (MutxamelFC mut : personas) {
            mut.viajar("Madrid");
        }

        //Planificar entrenamiento
        for (MutxamelFC mut : personas) {
            if (mut instanceof Entrenador) {
                ((Entrenador) mut).planificarEntrenamiento();
            }
        }

        //Entrenar de nuevo
        for (Jugador jug : jugadores) {
            jug.entrenar();
        }
        for (MutxamelFC mut : personas) {
            if (mut instanceof AccionesDeportivas) {
                ((AccionesDeportivas) mut).entrenar();
            }
        }

        //Descansar y calentar
        for (Jugador jug : jugadores) {
            jug.descansar();
            jug.calentar();
        }

        //Jugar partido
        for (Jugador jug : jugadores) {
            jug.jugarPartido("Equipo Furbo Malo");
        }

        for (MutxamelFC mut : personas) {
            if (mut instanceof AccionesDeportivas) {
                ((AccionesDeportivas) mut).jugarPartido("Equipo Furbo Malo");
            }
        }

        //Animar Equipo
        for (MutxamelFC mut : personas) {
            if (mut instanceof Acompanyante) {
                ((Acompanyante) mut).animarEquipo();
            }
        }

        //Hacer Cambios
        for (MutxamelFC mut : personas) {
            if (mut instanceof Entrenador) {
                ((Entrenador) mut).hacerCambios();
            }
        }

        //Marcar Gol
        for (Jugador jug : jugadores) {
            jug.marcarGol();
        }

        //Celebrar Gol
        for (Jugador jug : jugadores) {
            jug.celebrarGol();
        }
        for (MutxamelFC mut : personas) {
            mut.celebrarGol();
        }

        //Dar masaje a varios jugadores
        for (MutxamelFC mut : personas) {
            if (mut instanceof Masajista) {
                for (int i = 0; i < jugadores.length; i++) {
                    ((Masajista) mut).darMasaje(jugadores[i]);
                }
            }
        }

        //Viajar a Mutxamel ahora
        for (Jugador jug : jugadores) {
            jug.viajar("Mutxamel");
        }
        for (MutxamelFC mut : personas) {
            mut.viajar("Mutxamel");
        }

        //Descansar
        for (Jugador jug : jugadores) {
            jug.descansar();
        }

        AppMantenimiento.iniciarMantenimiento();









    }

}
