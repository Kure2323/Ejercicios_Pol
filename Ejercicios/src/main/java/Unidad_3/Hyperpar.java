package Unidad_3;
import java.util.Arrays;
import java.util.Scanner;

public class Hyperpar {
    public void ejercicio() {

        Scanner entrada = new Scanner(System.in);
        String num = "";
        String numeros[];
        int aciertos = 0;

        System.out.println("Introduce los números");
        while (true) {
            num = num + "," + entrada.next();
            if (num.contains("-1")) {
                break;
            }
        }
        numeros = num.split(",");
        System.out.println(Arrays.toString(numeros));

        todito:
        for (int i = 1; i < numeros.length-1; i++) {
            String peque[] = numeros[i].split("");
            for (int j = 0; j < peque.length; j++) {
                if (Integer.parseInt(peque[j]) % 2 == 0) {
                    aciertos++;
                    if (aciertos == numeros[i].length()) {
                        System.out.println("SI");
                        continue todito;
                    }
                }
            }
            if (aciertos != numeros[i].length()) {
                System.out.println("NO");
            }
            aciertos = 0;


        }





    }
    public void mario() {

        Scanner entrada = new Scanner(System.in);


        int num;
        do {
            System.out.println("Introduce la cantidad de muros.");
            num = entrada.nextInt();
        } while (num < 1 || num > 10);

        int[] muro = new int[num];

        String[] alturas = null;

        System.out.println("Introduce la altura de los muros");
        entrada.nextLine();
        alturas = entrada.nextLine().split(" ");

        if (alturas.length != num) {
            System.out.println("Error");
            return;
        }


        for (int i = 0; i < num; i++) {
            muro[i] = Integer.parseInt(alturas[i]);
        }


        int subidas = 0;
        int bajadas = 0;
        for (int i = 0; i < num - 1; i++) {
            if (muro[i] > muro[i + 1]) {
                bajadas++;
            } else if (muro[i] < muro[i + 1]) {
                subidas++;
            }
        }
        System.out.println("Hay " + subidas + " subidas y " + bajadas + " bajadas.");


    }
    public void ventas() {

        Scanner entrada = new Scanner(System.in);
        int[] vector = new int[2];

        System.out.println("Introduce");
        while (true) {
            String entry = entrada.next();

            if (!entry.matches("//d{3}.//d{2}")) {
                if (entry == "-1") {
                    break;
                } else {
                    System.out.println("Error, formato no válido");
                    return;
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    String[] aux = entry.split(".");
                    vector[i] = Integer.parseInt(aux[i]);
                }
            }
        }



    }
}
