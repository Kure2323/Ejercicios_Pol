package Unidad_4;

import java.util.Arrays;
import java.util.Scanner;

public class Guijarros {
    public static void balanza() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Número de Guijarros:");
        int num = entrada.nextInt();
        int[] peso = new int[num];

        System.out.println("Pesos:");
        entrada.nextLine();
        String[] aux = entrada.nextLine().split(" ");

        if (aux.length != num) {
            System.out.println("Debes introducir la misma cantidad de pesos anteriormente dichos");
            System.exit(0);
        }

        try{
            for (int i = 0; i < aux.length; i++) {
                peso[i] = Integer.parseInt(aux[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Se ha cagao");
            System.exit(0);
        }

        System.out.println(Arrays.toString(peso));




    }
}
