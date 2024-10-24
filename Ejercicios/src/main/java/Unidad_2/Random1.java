package Unidad_2;

import java.util.Random;

public class Random1 {

    void ejecutar(){

        Random random = new Random();

    int rdm = random.nextInt(1,7);
    int mdr = random.nextInt(1,7);

        System.out.println("El primer dado ha salido: " + rdm);
        System.out.println("El segundo dado ha salido: " + mdr);
        System.out.println("La suma de los dados es: " + (rdm + mdr));













    }
}
