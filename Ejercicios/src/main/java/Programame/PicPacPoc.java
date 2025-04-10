package Programame;
import java.util.Scanner;

public class PicPacPoc {

    static Scanner entrada = new Scanner(System.in);


    public static boolean casoDePrueba() {

        String[] vector = entrada.nextLine().split(" ");

        if (vector[0].equals("0")) {
            return false;
        } else {

            if (comprobador(vector)) {
                return false;
            }
            System.out.println(puntuaciones(vector));

            return true;
        }
    }

    public static void main(String[] args) {

        while (casoDePrueba()) {
        }

    }

    public static boolean comprobador(String[] array) {

        boolean salida = false;

        try{
            if (Integer.parseInt(array[0]) != array.length - 1) {
                salida = true;
            }
        } catch (NumberFormatException e) {
            salida = true;
        }

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals("PIC") && !array[i].equals("POC") && !array[i].equals("PONG!")) {
                salida = true;
                break;
            }
        }
        if (!array[array.length - 1].equals("PONG!")) {
            salida = true;
        }
        if (salida) {
            return true;
        } else {
            return false;
        }


    }


    public static String puntuaciones(String[] vector) {
        int i = 0;
        int d = 0;
        boolean turno = true;
        for (int j = 1; j < vector.length; j++) {

            if (vector[j].equals("PIC")) {
                turno = !turno;

            } else if (vector[j].equals("PONG!")) {

                if (turno) {
                    i++;
                } else {
                    d++;

                }
            }

        }

        return i + " " + d;
    }
}