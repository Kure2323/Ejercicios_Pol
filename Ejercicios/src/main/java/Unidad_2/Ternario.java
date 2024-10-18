package Unidad_2;

import java.util.Scanner;

public class Ternario {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        int a=1, b=5, c=7;
        int res = a == 7 * c && b == c ? a = 3 : b == 5 ? a * 7 : c / 7;

        System.out.println("Se sentencian las siguientes variables:");
        System.out.println("a=1, b=5, c=7");
        System.out.println("res = a == 7 * c && b == c ? a = 3 : b == 5 ? a * 7 : c / 7;");
        System.out.println("Y se muetra esta operación ternaria, resuélvela:");
        int resp = entrada.nextInt();

        while (resp != res){
            System.out.println("Has fallado");
            resp = entrada.nextInt();
        }
        System.out.println("Has acertado");

    }
}
