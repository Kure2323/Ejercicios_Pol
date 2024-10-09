package Unidad_2;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el valor de N");
        String n = entrada.nextLine();

        System.out.println("Escribe el valor de M");
        int M = entrada.nextInt();
        int nlarg = n.length();

        //lo largo que debe ser
        int debe = nlarg - M;

        String result = n.substring(0,debe);
        System.out.println(result);






    }
}
