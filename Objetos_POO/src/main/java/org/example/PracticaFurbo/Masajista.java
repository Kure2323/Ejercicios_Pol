package org.example.PracticaFurbo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter @Setter @ToString
public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;
    static ArrayList<Masajista> listaMasajistas = new ArrayList<>();

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
        //Lista para la app de mantenimiento
        listaMasajistas.add(this);
    }

    public void darMasaje(Jugador jugador) {
        System.out.println(getNombre() + " le está dando un masaje tranquilizante a " + jugador);
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " está empezando a concentrarse...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " se va de viaje a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("OLEEEE GOLASO MI NENEEEE BOOOOFFFF");
    }


    @Override
    public String toString() {
        return "Masajista(" + getNombre() + " de edad=" +
                getEdad() + ", titulación=" + titulacion +
                ", años de experiencia=" + anosExperiencia +
                ")";
    }
}
