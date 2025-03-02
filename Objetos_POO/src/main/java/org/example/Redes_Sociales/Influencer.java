package org.example.Redes_Sociales;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nickname, int seguidores) {
        super(nombre, edad, nickname, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public void agregarColaborador(String nombre) {
        colaboraciones.add(nombre);
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Colaboradores: " + colaboraciones.toString());
    }




}
