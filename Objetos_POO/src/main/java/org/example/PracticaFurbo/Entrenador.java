package org.example.PracticaFurbo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo=equipo;
        this.formacionPreferida=formatoFormacion(formacionPreferida);
    }

    /**
     * Método para checkear si el formato introducido de la formación es correcto,
     * en caso de no serlo salta la excepción personalizada
     * @param formacionPreferida
     * @return
     */
    private String formatoFormacion(String formacionPreferida) {
        if (formacionPreferida.matches("[0-9]-[0-9]-[0-9]")) {
            return formacionPreferida;
        } else {
            throw new FormacionIncorrectaException("No puede introducir una formación con otro formato que no sea N-N-N");
        }
    }

    public void planificarEntrenamiento() {
        System.out.println(getNombre() + " está planificando el entrenamiento...");
    }

    public void hacerCambios() {
        System.out.println(getNombre() + " está haciendo cambios en el equipo...");
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " está entrenando a los jugadores.");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre() + " está jugando el partido contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " se está concentrando...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " se va de viaje a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("OLEEEEEE NO VEAH` MI PUPILOOOO");
    }

    @Override
    public String toString() {
        return "Entrenador(" + getNombre() + " de edad=" +
                getEdad() + ", equipo=" + equipo.name() +
                ", formación preferida=" + formacionPreferida +
                ")";
    }
}
