package org.example;

public class Main {
    public static void main(String[] args) {

//        Persona persona1 = new Persona("Pepe", "Sánchez","12345678A", 80,30);
//        Persona persona2 = new Persona();
//
//        persona1.imprimirPersona();
//        persona2.imprimirPersona();
//        System.out.println(persona1.concatenar());
//        System.out.println(persona1.getEdad());
//        persona1.setNombre("Messi");
//        System.out.println(persona1.getNombre());

//
//        Editorial editorial1 = new Editorial("Freelance", "Groenlandia");
//        Estudiante estudiante1 = new Estudiante("Manuel", "2'ASIR", "noseke@alu.edu.hva.es");
//        Libro libro1 = new Libro("La novia de Pol","Marcela", editorial1);
//        estudiante1.setLibroPrestado(libro1);
//        System.out.println(libro1);
//

        Prestamo prestamo = new Prestamo(new Estudiante("Manu"), new Libro("Titulo", "Macela", new Editorial("Editorial", "Pais")));
        System.out.println(prestamo);

    }
}