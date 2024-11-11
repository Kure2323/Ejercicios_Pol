package Unidad_3;

import java.util.Scanner;

public class Navidad {
    void ejecutar() {
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[7];
        String[] navidad = {"n", "a", "v", "i", "d", "a", "d"};
        System.out.println("Introduce el número de la navidad (7 números)");
        String entry = entrada.next();
        String[] entr = entry.split("");
        for (int i = 0; i < 7; i++) {
            for (int b = 0; b < Integer.parseInt(entr[i]); b++) {
                System.out.print(navidad[i]);
            }
        }
    }
}
