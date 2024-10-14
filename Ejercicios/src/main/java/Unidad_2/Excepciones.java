package Unidad_2;

import java.util.Scanner;

public class Excepciones {
    public void ejecutar(){

        Scanner entrada = new Scanner(System.in);

        int dividendo = 0;
        String numero = "";


        if (entrada.hasNextInt()){
            System.out.println("Introduce un número: ");
            numero = entrada.next();
            System.out.println("Introduce el dividendo: ");
            dividendo = entrada.nextInt();
        }else{
            System.out.println("El formato no es numérico...");
        }

        int num_entero = 0;
        int division = 0;

        try{
            System.out.println("Introduce el divisor: ");
            num_entero = Integer.parseInt(numero);
            division = dividendo / num_entero;

        }catch (NumberFormatException e1){

            System.out.println("No has escrito un número... " + e1.getMessage());

        }catch (ArithmeticException e2){

            System.out.println("El denominador es 0. Diisión errónea. " + e2.getMessage());

        }finally {
            System.out.println("El resultado es " + division);
        }




    }
}
