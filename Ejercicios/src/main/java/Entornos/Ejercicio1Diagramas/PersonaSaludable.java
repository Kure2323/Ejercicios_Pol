package Entornos.Ejercicio1Diagramas;


public class PersonaSaludable extends Persona{

    private int resistencia;
    final int resistenciaDefault = 100;

    public PersonaSaludable(int edad, float peso, String nombre) {
        super(edad, peso, nombre);
        resistencia = resistenciaDefault;
    }

    public boolean madrugar(String hora) {
        return true;
    }

    @Override
    public void alimentacion() {
        super.alimentacion();
    }

    @Override
    public void bebida() {
        super.bebida();
    }

    @Override
    public void ejercicio() {
        super.ejercicio();
    }

    @Override
    public void despertarse() {
        super.despertarse();
    }
}
