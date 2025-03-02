package org.example.pokemon;

public class Agua extends Pokemon implements AtaquesAgua, CosasAgua{

    public Agua(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("PISTOLA AGUAAAAAA, SQUERO SQUERO");
    }

    @Override
    public void hidroBomba() {
        System.out.println("HIDROBOMBAAA");
    }

    @Override
    public void surf() {
        System.out.println("SURFFF");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("PEW PEW PEW");
    }

    @Override
    public void salpicadura() {
        System.out.println("Chof Chof");
    }

    @Override
    public void aquagym() {
        System.out.println("Iaio's gym");
    }
}
