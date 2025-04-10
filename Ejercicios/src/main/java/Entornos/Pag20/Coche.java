package Entornos.Pag20;

import com.sun.security.jgss.GSSUtil;

public class Coche extends Vehiculo{

    public Coche(String motor, String cilindrada, String caballos) {
        super(motor, cilindrada, caballos);
    }

    public void limpiezaCoche() {
        System.out.println("Limpieando coche.");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo coche.");
    }
}
