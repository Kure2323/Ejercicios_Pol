package org.example;

import java.util.Random;

public class Paciente {

    Random rdm = new Random();

    private final static char GENERO_DEF = 'X';
    public final static int SOBREPESO = 1;
    public final static int PESO_BAJO = -1;
    public final static int PESO_IDEAL = 0;
    private final static int MAYOR_EDAD = 18;


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
        comprobarSexo(sexo);
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

    public int calcularIMC() {

        double IMC = peso/(Math.pow(altura,2));
        if (IMC < 20) {
            return PESO_BAJO;
        } else if (IMC > 25) {
            return SOBREPESO;
        }
        return PESO_IDEAL;

    }

    public boolean esMayorDeEdad() {

        if (edad >= MAYOR_EDAD) {
            return true;
        } else {
            return false;
        }

    }

    private void comprobarSexo(char sexo) {

        if (sexo != 'M' && sexo != 'H') {
            this.sexo = GENERO_DEF;
        } else {
            this.sexo = sexo;
        }

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return this.peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }
    public char getSexo() {
        return this.sexo;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {

        return "Paciente con nombre " + this.nombre + " y " + this.edad + " años de edad. Género " + this.sexo + " y" + " dni: " + this.dni + " con una altura de " + this.altura + " y con un peso de " + this.peso;

    }



}
