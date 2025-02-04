package org.example.TelevisionEspanyola;

public class AppProgramas {

    public static void main(String[] args) {

        Programa programa = new Programa("Hormiguero", 8, "Pablo Motos");
        programa.agregarEmpleado("Pepito", "presentador");
        programa.agregarEmpleado("Izan", "putoncio");

        System.out.println(programa.getCadena());


        Cadena cadena = new Cadena( "Cadena libre");
        cadena.agregarPrograma(programa);
        programa.agregarInvitado("Izan", "Putero profesional", 12);
        cadena.borrarPrograma(programa);
        System.out.println(programa);


    }


}
