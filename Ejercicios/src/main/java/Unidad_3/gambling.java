package Unidad_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class gambling {
    void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String[] color = {"rojo", "negro"};
        Integer numeros[] = new Integer[37];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }

        String pares[] = {"par", "impar"};

        System.out.println("******BIENVENIDO A LA RULETA*******");
        System.out.println("Introduce tu número:");
        int num = entrada.nextInt();
        String usuario = "";
        String par = "";
        if (Arrays.asList(numeros).contains(num)) {

            if (num != 0) {
                System.out.println("Introduce un color:");
                usuario = entrada.next();

                if (Arrays.asList(color).contains(usuario.toLowerCase())) {
                    System.out.println("Inserta par/impar:");
                    par = entrada.next();

                    if (!Arrays.asList(pares).contains(par.toLowerCase())) {
                        System.out.println("ERROR. La opción par/impar no es correcta.");
                        return;
                    }
                } else {
                    System.out.println("ERROR. El color no es válido");
                    return;
                }
            }
        } else {
            System.out.println("ERROR tu número no se comprende entre el 0-36");
            return;
        }
        String sorteo_color = color[random.nextInt(color.length)];
        int sorteo_numero = numeros[random.nextInt(numeros.length)];
        String sorteo_par = "";

        if (sorteo_numero % 2 == 0) {
            sorteo_par = "par";
        } else {
            sorteo_par = "impar";
        }

        System.out.println("Ha tocado " + sorteo_numero + " " + sorteo_color + " " + sorteo_par);

        if (sorteo_numero == num && sorteo_color.equals(usuario) && sorteo_par.equals(par)) {
            System.out.println("HAS GANADO");
        } else if (num != 0 && sorteo_color.equals(color)) {
            System.out.println("Has acertado el color");
        } else if (num != 0 && sorteo_par.equals(par)) {
            System.out.println("Has acertado la opción " + par);
        } else if (num != 0 && num == sorteo_numero) {
            System.out.println("Has acertado el número");
        }else if (num==0){
            System.out.println("HAS GANADO");
        }else{
            System.out.println("Has perdido.");
        }
    }
}
