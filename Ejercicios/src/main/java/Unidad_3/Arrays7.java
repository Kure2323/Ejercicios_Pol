package Unidad_3;

import java.util.Scanner;

public class Arrays7 {
    void ejecutar() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Capacidad de la primera Array.");
        int cap1 = entrada.nextInt();

        int[] arr1 = new int[cap1];
        for (int i = 0; i<cap1; i++) {
            System.out.println("Introduzca el número de la posición " + (i + 1));
            arr1[i] = entrada.nextInt();
        }
        System.out.println("Capacidad de la segundo Array.");
        int cap2 = entrada.nextInt();

        int[] arr2 = new int[cap1];
        for (int i = 0; i<cap2; i++) {
            System.out.println("Introduzca el número de la posición " + (i + 1));
            arr2[i] = entrada.nextInt();
        }
        int captot = cap2 +cap1;
        int[] suma = new int[captot];
        for (int i = 0; i < cap1; i++){
            suma[i] = arr1[i];
        }
        for (int i = 0; i < cap2; i++) {
            suma[i + cap1] = arr2[i];
        }
        for (int i = 0; i < captot; i++) {
            System.out.print("[" + suma[i] + "]");
        }












    }
}
