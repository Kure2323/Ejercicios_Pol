package Unidad_2;

import java.util.Random;

public class Random2 {
    void ejecutar(){

        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for ( int i = 0; i < 10; i++ ){
            int rdm = random.nextInt(0,61);
            String contrasenya = caracteres.substring(rdm,rdm + 1);
            System.out.print(contrasenya);
        }

    }
}
