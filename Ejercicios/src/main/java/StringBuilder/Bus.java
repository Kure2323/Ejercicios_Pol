package StringBuilder;

import java.util.*;

public class Bus {

    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0;
        int c = 0;
        int d = 0;

        System.out.println("\n<<<<<<<<<< CARRERA >>>>>>>>>>");
        Thread.sleep(3000);
        Random rdm = new Random();

        while (a < TAM && b < TAM && c < TAM) {

            int turno = rdm.nextInt(4)+1;

            if (turno == 1) {
                a++; // avanzamos
            } else if (turno == 2){
                b++;
            } else if (turno == 3){
                c++;
            } else {
                d++;
            }

            limpiarPantalla();

            if (a<TAM) {
                System.out.println(dibujarCarrera(a,b,c,d));
                Thread.sleep(70);

            }

        }

        if (a >= TAM) {
            System.out.println("\033[32m" + "HA GANADO ANDY" + "\033[0m");
        } else if (b >= TAM){
            System.out.println("\033[32m" + "HA GANADO IZAN" + "\033[0m");
        } else if(c >= TAM){
            System.out.println("\033[32m" + "HA GANADO POL" + "\033[0m");
        } else {
            System.out.println("\033[32m" + "HA GANADO RAÚL" + "\033[0m");
        }


    }

    public static String dibujarCarrera(int n1, int n2, int n3, int n4){

        StringBuilder sb1 = new StringBuilder();


        sb1.append("-".repeat(117)).append("\n");
        sb1.append(" ".repeat(n1)).append("_______________  ").append(" ".repeat(100 - n1)).append("|\n");
        sb1.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb1.append(" ".repeat(n1)).append("|       ANDY      |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb1.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");

        sb1.append(" ".repeat(n2)).append("_______________  ").append(" ".repeat(100 - n2)).append("|\n");
        sb1.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb1.append(" ".repeat(n2)).append("|       IZAN      |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb1.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");

        sb1.append(" ".repeat(n3)).append("_______________  ").append(" ".repeat(100 - n3)).append("|\n");
        sb1.append(" ".repeat(n3)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n3)).append("|\n");
        sb1.append(" ".repeat(n3)).append("|        POL      |)").append(" ".repeat(TAM - n3)).append("|\n");
        sb1.append(" ".repeat(n3)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n3)).append("|\n");

        sb1.append(" ".repeat(n4)).append("_______________  ").append(" ".repeat(100 - n4)).append("|\n");
        sb1.append(" ".repeat(n4)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n4)).append("|\n");
        sb1.append(" ".repeat(n4)).append("|       RAÚL      |)").append(" ".repeat(TAM - n4)).append("|\n");
        sb1.append(" ".repeat(n4)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n4)).append("|\n");
        sb1.append("_".repeat(117));

        return sb1.toString();
    }


    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

}