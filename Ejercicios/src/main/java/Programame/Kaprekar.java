package Programame;

import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {

    static Scanner in;

    public static void casoDePrueba() {

        String[] numDerecho = new String[4];
        numDerecho = in.next().split("");



        int cont = 0;
        int resultado = 0;



        try{
            for (int i = 0; resultado != 6174 ; i++) {

                Arrays.sort(numDerecho);
                String[] reves = girar(numDerecho);

                int menorM = pasarInt(numDerecho);
                int mayorM = pasarInt(reves);

                resultado = mayorM - menorM;

                String res = Integer.toString(resultado);

                while (res.length() < 4) {
                    res = "0" + res;
                }

                numDerecho = res.split("");



                cont = i;


            }
            System.out.println(cont);
        } catch (NumberFormatException e) {
            System.out.println("8");
        }



//        System.out.println(Arrays.toString(numDerecho));
//        System.out.println(Arrays.toString(reves));




    } // casoDePrueba

    private static int pasarInt(String[] num) {
        String letra = "";

        for (int i = 0; i < num.length; i++) {
            letra += num[i];
        }
        return Integer.parseInt(letra);

    }

    private static String[] girar(String[] numDerecho) {
        String[] reves = new String[4];
        for (int i = 0; i < numDerecho.length; i++) {
            reves[i] = numDerecho[numDerecho.length - (i + 1)];
        }
        return reves;
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    } // main

}
