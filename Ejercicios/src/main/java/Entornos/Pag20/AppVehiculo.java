package Entornos.Pag20;

public class AppVehiculo {



    public static void main(String[] args) {


        Moto moto = new Moto("Motor to wapo", "Cilindrada de la hostia", "Caballito", "Rueda gorda");
        Coche coche = new Coche("Motor de coche", "Cilindrada de coche", "Caballos de vapos");

        moto.encender();
        moto.limpiezaMoto();
        coche.limpiezaCoche();
        coche.encender();



    }


}
