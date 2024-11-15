package Unidad_3;

import java.util.Arrays;
import java.util.Random;

public class Arraysort {
    public void ejecutar() {

        int original[] = {7, 8, 1, 1, 4, 4, 6};
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.binarySearch(original, 4));
        int auxiliar[] = new int[original.length];
        int sin_duplicados[];
        int tam = 0;

        for (int i = 0; i<original.length; i++) {
            if (i != original.length-1 && original[i]==original[i+1]) {
                continue;
            }else{
                auxiliar[i] = original[i];
            }
        }
        System.out.println(Arrays.toString(auxiliar));
        int[] auxiliar2 = new int[0];
        for (int i = 0; i<original.length;i++) {
            if (i!=0 && original[i]==original[i-1]) {
                continue;
            }else{

                auxiliar2[i]=original[i];

            }
        }




    }
    public void duplicados3() {

        int sorteo[] = new int[6];
        Random rdm = new Random();

        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = rdm.nextInt(49) + 1;

        }
        System.out.println(Arrays.toString(sorteo));

        Arrays.sort(sorteo);
        boolean orderados_duplicados = true;

        while (orderados_duplicados) {
            orderados_duplicados = false;

            for (int i = 0; i < sorteo.length; i++) {

                if (i!=sorteo.length-1 && sorteo[i]==sorteo[i+1]){
                    System.out.println("Duplicado: " + sorteo[i]);
                    sorteo[i]= rdm.nextInt(49) + 1;
                    orderados_duplicados = true;
                }

            }
            Arrays.sort(sorteo);
        }
        System.out.println(Arrays.toString(sorteo));




    }
    public void prueba_distinct() {
        int original[] = {1,1,2,2,3,4,9,9};

        System.out.println(Arrays.toString(original));

        int limpio[] = Arrays.stream(original).distinct().toArray();

        System.out.println(Arrays.toString(limpio));




    }
}