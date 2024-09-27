package org.example;

import java.util.Scanner;

public class BocadilloEj5 {
    public void ejecutar(){
        System.out.println("Responda a las siguientes questiones con un sí o un no");
        System.out.println("Tienes tomate?");
        Scanner entrada = new Scanner(System.in);
        String valor = entrada.next();

        System.out.println("Tienes aceite?");
        String valor1 = entrada.next();

        System.out.println("Tienes jamón?");
        String valor2 = entrada.next();

        if(valor.equals("no") || valor1.equals("no") || valor2.equals("no")){
            System.out.println("Vamos de compras");
        }else{
            System.out.println("Vamos a hacer el bocadillo");
        }
    }
}
