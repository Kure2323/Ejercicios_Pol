package org.example.TelevisionEspanyola;

public class AppProgramas {

    public static void main(String[] args) {

        Programa programa = new Programa("Hormiguero", 8, "Pablo Motos");
        programa.agregarEmpleado("Pepito", "presentador");
        programa.agregarEmpleado("Izan", "putita");
        System.out.println(programa);

        Cadena cadena = new Cadena( "Cadena libre");
        cadena.agregarPrograma(programa);
        System.out.println(cadena);


    }


}
