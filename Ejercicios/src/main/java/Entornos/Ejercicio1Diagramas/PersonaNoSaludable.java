package Entornos.Ejercicio1Diagramas;


public class PersonaNoSaludable extends Persona {

    private int colesterol;
    final int colesterolDefault = 100;

    public PersonaNoSaludable(int edad, float peso, String nombre) {
        super(edad, peso, nombre);
        colesterol = colesterolDefault;
    }

    public void llegarTarde(String horita) {

    }

    @Override
    public void ejercicio() {
        super.ejercicio();
    }

    @Override
    public void despertarse() {
        super.despertarse();
    }

    @Override
    public void alimentacion() {
        super.alimentacion();
    }

    @Override
    public void bebida() {
        super.bebida();
    }
}
