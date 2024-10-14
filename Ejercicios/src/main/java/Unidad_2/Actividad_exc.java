package Unidad_2;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad_exc {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);


        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        int anyo_nac = 1800;
        boolean error = false;

        System.out.println("Teclee 1 si quiere usar el modo 1");
        System.out.println("Teclee 2 si quiere usar el modo 2");
        System.out.println("1. Año de nacimientoo");
        System.out.println("2. Edad");

        String modo = entrada.next();


        if (modo.equals("1")){
            System.out.println("Introduce el año de nacimiento: ");
            String anyo_nacimiento = entrada.next();

            try{
                anyo_nac = Integer.parseInt(anyo_nacimiento);
            }catch (NumberFormatException e){
                System.out.println("Has introducido un formato erróneo. No es un número. " + e.getMessage());
            }

            if (anyo_nac<1900 || anyo_nac>anyo_actual){
                System.out.println("El año introducido no es correcto");
                error = true;
            }

        }else if (modo.equals("2")){

            int edad = 0;

            System.out.println("Introduce la edad: ");

            if (entrada.hasNextInt()){
                edad = entrada.nextInt();
            }else{
                System.out.println("La edad introducida no tiene un formato válido.");
            }

            if (edad<0){
                System.out.println("La edad introducida no es válida.");
                error = true;
            }else{
                anyo_nac = anyo_actual - edad;

            }

        }else{

            System.out.println("El modo introducido no es correcto.");
        }

        if (error == false){
            if (anyo_nac>=1900 && anyo_nac<=1927){
                System.out.println("Eres de la Gen sin bautizar.");
            }else if ( anyo_nac>=1928 && anyo_nac<=1944){
                System.out.println("Eres de la Gen silent");
            }else if( anyo_nac>=1945 && anyo_nac<=1964){
                System.out.println("Eres de la Gen baby boomers");
            }else if(anyo_nac>= 1965 && anyo_nac<= 1981){
                System.out.println("Eres de la Gen X");
            }else if(anyo_nac>=1982 && anyo_nac<= 1994){
                System.out.println("Eres de la Gen Millenial");
            }else if(anyo_nac>= 1995 && anyo_nac<= anyo_actual){
                System.out.println("Eres de la Gen Z");
            }
        }














    }
}
