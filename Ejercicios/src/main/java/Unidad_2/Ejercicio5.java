package Unidad_2;
import java.util.Scanner;

public class Ejercicio5 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        int i = 0;

        System.out.println("Jugador 1 ingrese una frase: ");
        String p1 = entrada.nextLine();
        System.out.println("Jugador 2 ingrese una palabra: ");
        String palabra = entrada.nextLine();
        String p2 = " " + palabra + " ";

        while(i < 10){
            int resultado = p1.indexOf(p2);
            if(resultado >= 0){
                System.out.println("Enhorabuena, has acertado una palabra");
                i = 10;
            }else{
                int intentos = 10-i;
                System.out.println("Has fallado, sigue intentándolo, te quedan " + intentos + " intentos");
                p2 = entrada.nextLine();
            }
            i++;
        }
    }
}
