package Unidad_2;

import java.util.Scanner;

public class Proyecto_Num_Suerte {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento: (dd/mm/aaaa)");
        String entry = entrada.nextLine();

        String fecha = entry.replace("/","");   //Le quitamos / a la fecha introducida

        int largo = fecha.length(); //Medimos la cantidad de caracteres que tiene

        while(largo >= 9 || largo <= 7) { //Realizamos un while como filtro para nuestro sistema de fecha
            System.out.println("Porfavor usa el sistema dd/mm/aaaa");
            System.out.println("Introduzca de nuevo la fecha:");
            fecha = entrada.nextLine();
        }

        String dd = fecha.substring(0,2);
        int dia = Integer.parseInt(dd);
        String mm = fecha.substring(2,4);
        int mes = Integer.parseInt(mm);
        String aa = fecha.substring(4);
        int año = Integer.parseInt(aa);

        int dma = dia + mes + año; //Operación

        String suma = Integer.toString(dma);    //Paso a String dma (Numero de 4 cifras)
        String p1 = suma.substring(0,1);    //Vamos haciendo substrings a cada una de las cifras
        String p2 = suma.substring(1,2);
        String p3 = suma.substring(2,3);
        String p4 = suma.substring(3,4);

        int num1 = Integer.parseInt(p1);    //Pasamos de nuevo a enteros cada uno de los substrings de las cifras
        int num2 = Integer.parseInt(p2);
        int num3 = Integer.parseInt(p3);
        int num4 = Integer.parseInt(p4);

        int res = num1 + num2 + num3 + num4;    //Realizamos la operación del número de la suerte

        System.out.println("Tu número de la suerte es: " + res);
    }
}
