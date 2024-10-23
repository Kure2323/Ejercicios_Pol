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
        isbn = isbn.toLowerCase();

        int quest = isbn.indexOf("?"); //Posición del interrogante quest, quest + 1
        int struq = isbn.lastIndexOf("?");
        int equis = isbn.indexOf("x");

        boolean tc = true;


        while (true){
            if(equis != -1){
                if(equis != 9){
                    System.out.println("Error, la equis debe estar en última posición.");
                }
            }


            if(lisbn != 10){
                System.out.println("Error, debe contener 10 caracteres.");
            }
            if(quest != struq){
                System.out.println("Error, debe contener tan solo una interrogación.");
            }
            if (quest == -1 && equis == -1)  {
                try{
                    int e = Integer.parseInt(isbn);
                } catch (NumberFormatException e) {
                    System.out.println("Error, no debe contener caracteres diferentes a números, ? y X.");

                }
            } else if (quest != -1 && equis == -1) {
                try{
                    String la = isbn.substring(0,quest);
                    String din = isbn.substring(quest + 1);
                    int al = Integer.parseInt(la);
                    int nid = Integer.parseInt(din);
                }catch (NumberFormatException e){
                    System.out.println("Error, no debe contener caracteres diferentes a números, ? y X.");

                }
            } else if (quest != -1 && equis != -1){
                String la = isbn.substring(0,quest);
                String din = isbn.substring(quest + 1,9);
                int al = Integer.parseInt(la);
                int nid = Integer.parseInt(din);
            }

            if((equis == -1 || equis == 9) && lisbn == 10 && quest == struq){
                break;
            }

            System.out.println("Introduzca de nuevo el ISBN:");
            isbn = entrada.next();
            lisbn = isbn.length();
            isbn = isbn.toLowerCase();
            quest = isbn.indexOf("?");
            struq = isbn.lastIndexOf("?");
            equis = isbn.indexOf("x");
        }


        if (quest != -1) {

            for(int i = 0;i < 10; i++){

                String letra = Integer.toString(i);
                String la = isbn.substring(0,quest);
                String din = isbn.substring(quest + 1);

                String test = la + Integer.toString(i) + din;
                res = 0;
                j = 0;

                if (isbn.substring(9,10).equals("x")){

                    for (int p = 10; p > 1; p--) {
                        String num = test.substring(j, j + 1);
                        int nums = Integer.parseInt(num);
                        res = res + (nums * p);
                        j++;
                    }

                    res = res + 10;

                }else {

                    for (int q = 10; q > 0; q--) {
                        String num = test.substring(j, j + 1);
                        int nums = Integer.parseInt(num);
                        res = res + (nums * q);
                        j++;
                    }

                }

                if(res % 11 == 0){
                    System.out.println("Su ISBN correcto es: " + test);
                    break;
                }

            }
            if(res % 11 != 0){
                System.out.println("Su ISBN no tiene combinación correcta,");
            }



        }else{
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
}
