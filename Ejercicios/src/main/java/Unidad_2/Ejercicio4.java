package Unidad_2;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine();
        System.out.println("Introduce la palabra repetida:");
        String repe = entrada.nextLine();
        String ropo = repe + "  ";

        String entera = " " + frase + " ";
        int letrasf = entera.length();
        int letrasr = ropo.length();

        String salida = entera.replace(" " + repe + " ","");
        int letrasff = salida.length();
        int resultado = (letrasf - letrasff) / letrasr;
        System.out.println("Tiene " + repe + " " + resultado + " veces.");
    }
}
