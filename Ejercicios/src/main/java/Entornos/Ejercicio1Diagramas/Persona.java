package Entornos.Ejercicio1Diagramas;

public abstract class Persona implements Habitos{

    protected int edad;
    private float peso;
    public String nombre;
    static public int estimacionVida;

    public Persona(int edad, float peso, String nombre) {
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
    }

    public void despertarse() {

    }

    private void dormirse() {

    }

    @Override
    public void ejercicio() {

    }

    @Override
    public void alimentacion() {

    }

    @Override
    public void bebida() {

    }



}
