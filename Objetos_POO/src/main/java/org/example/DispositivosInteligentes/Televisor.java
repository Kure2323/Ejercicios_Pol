package org.example.DispositivosInteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }

    @Override
    public void encender() {
        if (isEstado()) {
            System.out.println("El televisor ya está encendido.");
        } else {
            System.out.println("Encendiendo televisor.");
            setEstado(true);
        }
    }
}
