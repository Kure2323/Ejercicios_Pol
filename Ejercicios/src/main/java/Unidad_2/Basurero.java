package Unidad_2;

import java.util.Scanner;

public class Basurero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce números");
        String num = entrada.nextLine();
        float res = Integer.parseInt(num);
        System.out.println(res);
    }
}
