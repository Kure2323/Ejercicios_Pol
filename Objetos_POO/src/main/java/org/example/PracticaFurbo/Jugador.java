package org.example.PracticaFurbo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.OutputStream;
import java.util.ArrayList;

@Getter @Setter
public class Jugador extends MutxamelFC implements AccionesDeportivas{

    private static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria=categoria;
        this.dorsal=comprobarDorsal(dorsal);
        this.posicion=posicion;
        listaJugadores.add(this);
    }

    /**
     * Método para checkear si el dorsal introducido existía ya,
     * en caso de existir salta la excepción personalizada y salta un mensaje.
     * @param dorsal
     * @return
     */
    private int comprobarDorsal(int dorsal) {
        for (Jugador jug : listaJugadores) {
            if (jug.getDorsal() == dorsal) {
                throw new DorsalRepeException("No pueden haber dos personas con el mismo dorsal");
            }
        }
        return dorsal;
    }

    public void calentar() {
        System.out.println(getNombre() + " está empezando a calentar.");
    }

    public void descansar() {
        System.out.println(getNombre() + " está empezando a descansar.");
    }

    public void marcarGol() {
        System.out.println("SSSSSSIIIIUUUUUUU!!!! NOSEKE TAL");
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " está empezando a entrenar.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre() + " está jugando el partido contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " comienza a concentrarse en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " se va a viajar a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("OLE OLE OLE TREMENSO GOLASO NINIO 'ER DE MI PRIMO");
    }

    public int setDorsal(int dorsal) {
        return comprobarDorsal(dorsal);
    }

    @Override
    public String toString() {
        return "Jugador(" + getNombre() + " de edad=" +
                getEdad() + ", categoría=" + categoria.name() +
                ", dorsal=" + dorsal + ", posición=" +
                posicion.name() + ")";
    }
}
