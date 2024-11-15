package Unidad_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pract_Prim {
    public void practica() {
        Scanner entrada = new Scanner(System.in);
        Random rdm = new Random();
        Integer[] elec = new Integer[7];

        System.out.println("Introduce los datos de tu boleto:");
        boolean filtro = false;

        String entry = entrada.next();
        if (entry.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}") == true) {
            filtro = true;
            String[] num = entry.split("[-/]");
            for (int i = 0; i < num.length; i++) {
                elec[i] = Integer.parseInt(num[i]);
            }
            for (int i = 0; i < elec.length-1; i++) {
                if (elec[i] < 1 || elec[i] > 49) {
                    filtro = false;
                }
            }
            if (elec[6] > 9 || elec[6] < 0) {
                filtro = false;
            }
            if (elec.length > Arrays.stream(elec).distinct().toArray().length) {
                filtro = false;
            }
        }
        if (filtro == false) {
            System.out.println("Formato introducido no válido");
            return;
        }
        System.out.println(Arrays.toString(elec));
        Integer loteria[] = new Integer[6];






    }
}
