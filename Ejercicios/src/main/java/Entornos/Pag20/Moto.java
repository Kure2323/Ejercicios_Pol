package Entornos.Pag20;

public class Moto extends Vehiculo{

    private String ruedasMoto;

    public Moto(String motor, String cilindrada, String caballos, String ruedasMoto) {
        super(motor, cilindrada, caballos);
        this.ruedasMoto=ruedasMoto;
    }

    public void limpiezaMoto() {
        System.out.println("Limpiando moto.");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo moto.");
    }
}
