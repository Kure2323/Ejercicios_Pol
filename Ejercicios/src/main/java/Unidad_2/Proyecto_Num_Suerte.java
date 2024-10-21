package Unidad_2;
import java.util.Scanner;

public class Proyecto_Num_Suerte {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        boolean tc = true;
        String entry = "lel";
        int largo = 0;
        String fecha = "/";
        int dia = 0;
        int mes = 0;
        int año = 0;

        while(tc){  //Try catch que salva el error de 8 letras como primera entrada

                System.out.println("Introduce tu fecha de nacimiento: (dd/mm/aaaa)");
                entry = entrada.nextLine();
                fecha = entry.replace("/","");   //Le quitamos / a la fecha introducida
                largo = fecha.length(); //Medimos la cantidad de caracteres que tiene

                while(largo >= 9 || largo <= 7) { //Realizamos un while como filtro para nuestro sistema de fecha
                    System.out.println("Porfavor usa el sistema dd/mm/aaaa");
                    System.out.println("Introduzca de nuevo la fecha:");
                    entry = entrada.nextLine();
                    fecha = entry.replace("/","");
                    largo = fecha.length();
                }

            try{
                String dd = fecha.substring(0,2);   //Se extraen de la fecha los valores de día, mes y año como enteros
                dia = Integer.parseInt(dd);
                String mm = fecha.substring(2,4);
                mes = Integer.parseInt(mm);
                String aa = fecha.substring(4);
                año = Integer.parseInt(aa);

                if(dia > 31 || mes > 12 || año > 2024 || dia <= 0 || mes <= 0 || año < 1900){ //Filtro para que no puedan ser introducidos valores mayores a los posibles
                    System.out.println("El día no puede ser mayor de 31, el mes mayor de 12 ni el año mayor a 2024.");
                }else{
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
                    tc =false;
                }

            }catch(NumberFormatException e){
                System.out.println("ERROR, introduzca números, tampoco se admiten valores negativos. ");
            }
        }
    }
}
