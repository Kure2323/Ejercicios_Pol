package org.example;

import java.util.Random;

public class Paciente {

    Random rdm = new Random();

    private final static char GENERO_DEF = 'X';

    private String nombre;
    private String dni;
    private char sexo;
    private int edad;
    private double peso;
    private int altura;

    public Paciente() {
//        generarDNI();
//        this.sexo = GENERO_DEF;
        this("",GENERO_DEF,0,0,0);
    }
    public Paciente(String nombre, char sexo, int edad, double peso, int altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.altura = altura;
        generarDNI();

    }
    public Paciente(String nombre, int edad, char genero) {
        this(nombre, GENERO_DEF, edad, 0, 0);
    }

    public void mostrarInfoPaciente() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad  + ", Peso: " + this.peso + ", Altura: " + this.altura
        + ", Sexo: " + this.sexo + ", DNI: " + this.dni);
    }

    private void generarDNI() {

        int num =rdm.nextInt(10000000,99999999);
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        this.dni = Integer.toString(num) + letras[num%23];

    }





}
