package org.example.CajeroAutomatico;


import java.util.Scanner;

public class AppCajero {

    static Scanner in = new Scanner(System.in);

    public static void mostrarPantalla() {
        System.out.println("=== Cajero Automático ===");
        System.out.println();
        System.out.println("    [1]. Consultar saldo");
        System.out.println("    [2]. Ingresar dinero");
        System.out.println("    [3]. Retirar dinero");
        System.out.println("    [X]. Salir");
        System.out.println("    Selecciona una opción: ");
    }

    public static void main(String[] args) {
        iniciarApp();
    }

    private static void iniciarApp() {
        CuentaBancaria cuenta = new CuentaBancaria();
        boolean mundo = true;
        while(mundo){
            mostrarPantalla();
            switch (in.next()) {
                case "1":
                    System.out.println("Saldo disponible: " + cuenta.getSaldo());
                    break;
                case "2":
                    System.out.println("Introduce el importe a ingresar:");
                    cuenta.ingresarDinero(in.nextDouble());
                    System.out.println("Saldo ingresado con éxito. Saldo actual: " + cuenta.getSaldo() + " €");
                    break;
                case "3":
                    System.out.println("Introduce el importe a retirar:");
                    cuenta.retirarDinero(in.nextDouble());
                    break;
                default:
                    mundo = false;
                    break;

            }
        }

    }

}
