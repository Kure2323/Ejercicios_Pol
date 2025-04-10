package Lambda.Pokemon;

//import Pokedex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppPokemon {

    public static void main(String[] args) {


        Pokedex poke1 = new Pokedex("Squirtle", 5);
        Pokedex poke2 = new Pokedex("Charmander", 2);



        Pokemon magikarp = new Pokemon() {
            @Override
            public void atacar(int nivel, Pokedex pokedex) {
                System.out.println("Atacando con nivel " + nivel + " SALPICADURAAAA!!");
                System.out.println("Lucha contra " + pokedex.getPokemon());
            }
        };

        magikarp.atacar(12, poke1);

        Pokemon pikachu = (int nivel, Pokedex pokedex) -> {
            System.out.println("Atacando con nivel " + nivel + " IMPACTRUENOOOOO!!!!");
            System.out.println("PIKA PIKA PIKACHU");
            System.out.println("Lucha contra " + pokedex.getPokemon());
        };

        pikachu.atacar(35, poke2);

        List<Pokedex> listaPokedex = new ArrayList<>();

        listaPokedex.add(poke1);
        listaPokedex.add(poke2);
        listaPokedex.add(new Pokedex("Bulbasur", 15));

        //Esto es para ordenar mediante número de entrenadores.
        Collections.sort(listaPokedex,(pokedex, pokedex2) -> pokedex.getEntrenadores().compareTo(pokedex2.getEntrenadores()));
        Collections.sort(listaPokedex, Comparator.comparing(Pokedex::getEntrenadores));
        //listaPokedex.sort();

        for (Pokedex pok: listaPokedex) {
            System.out.println(pok.getPokemon() + " " + pok.getEntrenadores());
        }

        //Ordenar por orden alfabético de los pokemons
        Collections.sort(listaPokedex,(pokedex, pokedex2) -> pokedex.getPokemon().compareTo(pokedex2.getPokemon()));

        for (Pokedex pok: listaPokedex) {
            System.out.println(pok.getPokemon() + " " + pok.getEntrenadores());
        }

        listaPokedex.add(new Pokedex("Digglet", 15));

        //Ordenar por entrenadores del revés con el .reversed() al final
        listaPokedex.sort(Comparator.comparing(Pokedex::getEntrenadores).thenComparing(Pokedex::getEntrenadores).reversed());








    }


}
