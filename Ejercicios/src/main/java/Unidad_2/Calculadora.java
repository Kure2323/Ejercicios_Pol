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
        System.out.println("Bienvenid@ " + nombre + " a la calculadora."); //Damos la bienvenida
        System.out.println("Introduzca el primer operando:"); //Pido el primer operando y realizo un try-catch para ello

        while (tc){

            try{
                num1 = entrada.nextInt();
                tc = false;
            }catch (InputMismatchException e){
                System.out.println("Error, solo debe introducir valores numéricos:");
                entrada.nextLine();
            }
        }

        System.out.println("Por favor indica que operación va a querer realizar:"); //Pido la operación a realizar
        String op = entrada.next(); //La guardo en op

        if (op.equals("r")){    //Abro un if para el caso de la raíz, pues en este supuesto no pedirá un segundo operando
            double res = Math.sqrt(num1);
            System.out.println("El resultado de la raíz cuadrada es: " + res);

        }else{  //En el interior se encuentra un while con try-catch por el segundo operando
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
            switch (op){ //Realizo un switch abarcando posibles respuestas frente a la operación a realizar
                case "+":
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case "/":
                    while (!div){   //La división se registra en una variable double para obtener valores decimales
                        if (num2 == 0){
                            System.out.println("No se puede introducir 0 de segundo operando.");
                            num2 = entrada.nextInt();
                        }else{
                            double res = (double) num1 / num2;
                            System.out.println("El resultado de la división es: " + res);
                            div = true;
                        }
                    }
                    break;
                case "x":
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                default:
                    System.out.println("Error, operación no reconocida.");  //Resultado en caso de que op ne se encuentre entre los case
            }
        }
    }
}
