package org.example.pokemon;

public class AppPokedex {
    public static void main(String[] args) {



        Pokemon pikachu2 = new Electrico(30, 21);
        pikachu2.atacar();

        Agua squirtel = new Agua(200, 100);


        Pokemon pikachu = new Electrico(100, 100);
        Pokemon squirtel2 = new Agua(200, 100);


        Pokemon[] pokemons = {new Electrico(30, 21), new Agua(200, 100)};
        for (Pokemon pok : pokemons) {
            pok.atacar();
            pok.imprimirDatos();
            if (pok instanceof AtaquesAgua && pok instanceof CosasAgua) { //Chequea que pertenezca a la instancia AtaquesAgua y si es así ejecutawd
                ((AtaquesAgua) pok).pistolaAgua();
                ((CosasAgua) pok).aquagym();
            }
        }

        Pokemon jiglipuff = new Pokemon(12, 100) {
            @Override
            public void atacar() {
                System.out.println("Nada de nada");
            }
        };
        jiglipuff.atacar();
        jiglipuff.imprimirDatos();

        AtaquesAgua ataquesAgua = new AtaquesAgua() {
            @Override
            public void hidroBomba() {
                System.out.println("BUUUUMMM");
            }

            @Override
            public void surf() {
                System.out.println("Pillando una ola");
            }

            @Override
            public void pistolaAgua() {
                System.out.println("Pew pew");
            }

            @Override
            public void salpicadura() {
                System.out.println("Splash!!");
            }
        };

        ataquesAgua.hidroBomba();

        Electrico pikachu3 = new Electrico(12, 8000){
            @Override
            public void atacar() {
                System.out.println("CHIIIIIAAAAAAAAAAAAAAAAA");
            }
        };
        pikachu3.atacar();



    }
}
