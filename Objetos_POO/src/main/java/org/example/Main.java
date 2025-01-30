package org.example;

import org.example.biblioteca.Editorial;
import org.example.biblioteca.Estudiante;
import org.example.biblioteca.Libro;

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

//        Prestamo prestamo = new Prestamo(new Estudiante("Manu"), new Libro("Titulo", "Macela", new Editorial("Editorial", "Pais")));
//        System.out.println(prestamo);


//        Persona persona1 = new Persona("Luis", "Sánchez", "12345678A",45, 18, "Casa Lola", "Putero");
//        Equipo equipo1 = new Equipo("Real Mutxamel");
//        System.out.println(equipo1);
//        equipo1.anyadirComponente(persona1);
//        System.out.println(equipo1);
//        equipo1.eliminarComponente(persona1);
//        System.out.println(equipo1);

        Estudiante estudiante1 = new Estudiante("Manuel", "2ºA","manumanuel@gmail.com");
        Editorial editorial = new Editorial("Editorial Chingona", "Yugoslavia");
        Libro libro = new Libro("Tú y quizás yo", "Marcela M. S.", editorial);

        libro.prestar(estudiante1);
        System.out.println(estudiante1);

        libro.devolver(estudiante1);
        System.out.println(estudiante1);
        System.out.println(editorial);
        System.out.println(libro);




    }
}