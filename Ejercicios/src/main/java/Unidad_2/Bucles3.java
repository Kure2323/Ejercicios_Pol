package Unidad_2;

import java.util.Scanner;

public class Bucles3 {
    void ejecutar(){

        Scanner entrada = new Scanner(System.in);
        int num1 = 50;
        int num2 = 1;

        do{

            int res = num1 % 3;
            num1 -= 1;
            if (res == 0){
                System.out.println(num1 +1);
            }

        }while (num1 != 1);
    }
}
