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
}
