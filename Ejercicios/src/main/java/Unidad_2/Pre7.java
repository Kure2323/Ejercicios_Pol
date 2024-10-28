package Unidad_2;
import java.util.Scanner;
public class Pre7 {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la cantidad de números de la secuencia:");
        int cant = entrada.nextInt();
        int x = 0;
        int y = 1;

        System.out.printf("0 1 ");

        for (int i = 0; i < (cant -2); i++){
            int res = x + y;
            x = y;
            y = res;

            System.out.printf(y + " ");
        }
    }
}
