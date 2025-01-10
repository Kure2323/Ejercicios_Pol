package Unidad_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntornosDeDesarrollo {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el NIF:");
        String NIF = in.next();
        boolean nifValido = esNIFValido(NIF);

        while (true) {
            try{
                System.out.println("Introduce el número de plazas:");
                int plaza = in.nextInt();
                boolean plazaValido = esNumeroPlazasValido(plaza);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error al introducir el número, por favor, introdúzcalo de nuevo:");
                in.nextLine();
            }
        }
    }
    public static boolean esNIFValido(String nif) {

        if (nif.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][A-Z]") || nif.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][a-z]")){
            return true;
        }
        System.out.println("Error en el NIF");
        return false;


    }
    public static boolean esNumeroPlazasValido(int numeroPlazas) {

        if (numeroPlazas < 0 || numeroPlazas > 51) {
            System.out.println("Error en el número de plazas");
            return false;
        }

        return true;

    }

}
