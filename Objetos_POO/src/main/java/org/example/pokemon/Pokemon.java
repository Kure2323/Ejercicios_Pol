package org.example.pokemon;

abstract class Pokemon {

    private int nivel;
    private int ps;

    public Pokemon(int nivel, int ps) {
        this.ps=ps;
        this.nivel=nivel;
    }

    public abstract void atacar();

    public void imprimirDatos(){
        System.out.println(" nivel = " + nivel + " vida = " + ps);
    }

}
