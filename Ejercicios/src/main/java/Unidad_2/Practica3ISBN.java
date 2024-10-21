package Unidad_2;

import java.util.Scanner;

public class Practica3ISBN {
    void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        int res = 0;
        int j = 0;

        System.out.println("Introduzca el ISBN:");
        String isbn = entrada.next();
        int lisbn = isbn.length();


        while (lisbn != 10){
            System.out.println("Error, debe contener 10 caracteres, introduzca el ISBN");
            isbn = entrada.next();
            lisbn = isbn.length();
        }
        isbn = isbn.toLowerCase();

        int quest = isbn.indexOf("?");

        if (quest == -1) {

        }

        if (isbn.substring(9,10).equals("x")){

            for (int i = 10; i > 1; i--) {
                String num = isbn.substring(j, j + 1);
                int nums = Integer.parseInt(num);
                res = res + (nums * i);
                //            System.out.println(res + " " + nums + " " + i);
                j++;
            }
            res = res + 10;


        }else {

            for (int i = 10; i > 0; i--) {
                String num = isbn.substring(j, j + 1);
                int nums = Integer.parseInt(num);
                res = res + (nums * i);
                //            System.out.println(res + " " + nums + " " + i);
                j++;
            }
        }
        System.out.println(res);


        if( res % 11 == 0){
            System.out.println("Su ISBN es correcto.");
        }else{
            System.out.println("Su ISBN NO es correcto");
        }


    }
}
