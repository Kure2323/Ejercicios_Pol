package Unidad_2;

import java.util.Scanner;

public class Bucles4 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int j = 1;

        System.out.println("Introduce una frase:");
        String fr = entrada.nextLine();
        int lon = fr.length();

        while(j <= lon){
            String res = fr.substring(i,j);
            System.out.println(res);
            i++;
            j++;
        }


    }
}
