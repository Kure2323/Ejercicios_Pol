package Entornos.Pag20;

public abstract class Vehiculo {

    private String motor;
    private String cilindrada;
    private String caballos;

    public Vehiculo(String motor, String cilindrada, String caballos) {
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.caballos = caballos;
    }

    public abstract void encender();

}
