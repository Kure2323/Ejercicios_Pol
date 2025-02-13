package org.example.pokemon;

public class AppPokedex {
    public static void main(String[] args) {


        Electrico pikachu = new Electrico(100, 100);
        Pokemon pikachu2 = new Electrico(30, 21);
        pikachu.atacar();
        pikachu2.atacar();

        Agua squirtel = new Agua(200, 100);
        squirtel.atacar();
        squirtel.imprimirDatos();


    }
}
