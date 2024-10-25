package Unidad_2;

import java.util.Scanner;

public class Pre3 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce los meses que tienes que pagar:");
        int cant = entrada.nextInt();
        int res = 10;

        for(int i = 1; i <= cant; i++){
            res = res * 2;
        }

        System.out.println(res - 10);
    }
}
