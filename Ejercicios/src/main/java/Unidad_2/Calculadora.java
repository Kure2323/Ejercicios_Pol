package Unidad_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean div = false;
        boolean tc = true;
        System.out.println("Introduce tu nombre: ");
        String nombre = entrada.next();
        System.out.println("Bienvenid@ " + nombre + " a la calculadora.");

        System.out.println("Introduzca el primer operando:");

        while (tc){

            try{
                num1 = entrada.nextInt();
                tc = false;
            }catch (InputMismatchException e){
                System.out.println("Error, solo debe introducir valores numéricos:");
                entrada.nextLine();
            }
        }

        System.out.println("Por favor indica que operación va a querer realizar:");
        String op = entrada.next();

        if (op == "r"){
            System.out.println("Introduzca el segundo operando:");
            while (!tc){

                try{
                    num2 = entrada.nextInt();
                    tc = true;
                }catch (InputMismatchException e){
                    System.out.println("Error, solo debe introducir valores numéricos:");
                    entrada.nextLine();
                }
            }
        }

        switch (op){
            case "+":
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case "-":
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case "/":
                while (div == false){
                    if (num2 == 0){
                        System.out.println("No se puede introducir 0 de segundo operando.");
                        num2 = entrada.nextInt();
                    }else{
                        double res = num1 / num2;
                        System.out.println("El resultado de la división es: " + res);
                        div = true;
                    }
                }
                break;
            case "x":
                System.out.println("El resultado de la resta es: " + (num1 * num2));
                break;
            case "r":
                double res = Math.sqrt(num1);
                System.out.println("El resultado de la raíz cuadrada es: " + res);


        }


    }
}
