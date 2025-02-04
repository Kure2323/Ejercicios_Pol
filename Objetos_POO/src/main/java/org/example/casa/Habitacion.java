package org.example.casa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Habitacion {

    Scanner in = new Scanner(System.in);

    private String nombre;
    private double metros4;

    public ArrayList<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }

    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, double metros4) {
        this.nombre = nombre;
        this.metros4=metros4;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetros4() {
        return metros4;
    }

    public void setMetros4(double metros4) {
        this.metros4 = metros4;
    }

    public void agregarElectrodomestico(String nombre, double consumo){

        for (Electrodomestico ele : electrodomesticos) {
            if (nombre.equals(ele.getNombre())) {
                System.out.println("Ya existe.");
                return;
            }
        }
        electrodomesticos.add(new Electrodomestico(nombre,consumo));
    }

    public void mostrarElectrodomesticos(Habitacion habitacion){

        for (Electrodomestico electrodomestico : electrodomesticos){
            System.out.println("- " + electrodomestico.getNombre() + " con un consumo de: " + electrodomestico.getConsumo());
        }

    }

    public double calcularConsumo(){
        double res = 0;
        for (Electrodomestico ele : electrodomesticos) {
            res += ele.getConsumo();
        }
        return res;
    }

    @Override
    public String toString() {
        return "Habitación : [ nombre=" + getNombre() + " metros cuadrados= " + getMetros4();
    }
}
