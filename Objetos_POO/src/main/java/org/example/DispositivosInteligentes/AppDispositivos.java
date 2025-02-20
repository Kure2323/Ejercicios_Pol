package org.example.DispositivosInteligentes;

import java.util.ArrayList;

public class AppDispositivos {
    public static void main(String[] args) {
//        AireAcondicionado samsung = new AireAcondicionado("Samsung");
//        samsung.encender();
//        samsung.encender();
//        samsung.apagar();
//        samsung.sincronizar();
//        samsung.mostrarEstado();

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG SMART"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Haier Inverter"));
        listaDispositivos.add(new Televisor("Samsung comedor"));

        for (Dispositivo dis : listaDispositivos) {
            dis.encender();
            if (dis instanceof ControlRemoto) {
                ((ControlRemoto) dis).sincronizar();
            }
        }


        Dispositivo proyector = new Dispositivo("Optoma") {
            @Override
            public void encender() {
                if (!isEstado())
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                else {
                    System.out.println("El proyector ya está encendido");
                    setEstado(true);
                }
            }
        };

        ControlRemoto controlProyector = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        Dispositivo hornoInteligente = new Dispositivo("Horno Inteligente") {
            @Override
            public void encender() {
                if (isEstado())
                    System.out.println("El horno ya está encendido.");
                else {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                }
            }
        };

        listaDispositivos.add(hornoInteligente);
        listaDispositivos.add(proyector);

        for (Dispositivo dispositivo : listaDispositivos) {
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.getNombre().equals("Optoma")) {
                controlProyector.sincronizar();
            }
        }


    }
}
