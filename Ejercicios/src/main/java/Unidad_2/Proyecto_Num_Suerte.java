package Unidad_2;

import java.util.Scanner;

public class Proyecto_Num_Suerte {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento: (dd/mm/aaaa)");
        String entry = entrada.nextLine();

        String fecha = entry.replace("/","");
        String dd = fecha.substring(0,2);
        int dia = Integer.parseInt(dd);
        String mm = fecha.substring(2,4);
        int mes = Integer.parseInt(mm);
        String aa = fecha.substring(4);
        int año = Integer.parseInt(aa);

        int dma = dia + mes + año; //Operación

        

        System.out.println(dia + " " + mes + " " + año);

    }
}
