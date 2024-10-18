package Unidad_2;

import java.util.Scanner;

public class Bucles1 {

    void ejecutar() {

        Scanner entrada = new Scanner(System.in);
        String contrasenya = "termostatopersistente";
        String ans;

        System.out.println("Introduce la contraseña:");
        do {

            ans = entrada.nextLine();
            if (!ans.equals(contrasenya)){
                System.out.println("Has fallado, vuelve a intentarlo:");
            }

        } while (!ans.equals(contrasenya));
        System.out.println("Has acertado.");
    }
}