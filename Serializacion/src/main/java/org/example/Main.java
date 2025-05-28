package org.example;

import org.example.Ejercicio1.Persona;
import org.example.Ejercicio5.Empleado;
import org.example.Ejercicio5.Jefe;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        runEjercicio5();
    }


    private static void runEjercicio5() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 3000));
        empleados.add(new Empleado("Ana", 2500));
        empleados.add(new Empleado("Luis", 4000));

        ArrayList<Jefe> jefes = new ArrayList<>();
        jefes.add(new Jefe("Carlos", 5000, "IT"));
        jefes.add(new Jefe("Marta", 6000, "HR"));

        // Serializar la lista de objetos Empleado y Jefe
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/empleados_jefes.ser"));
            out.writeObject(empleados);
            out.writeObject(jefes);
            out.close();
        } catch (IOException e) {
            System.out.println("Algo ha salido mal.");
            e.printStackTrace();
        }
        System.out.println("Objetos serializados correctamente.");
        // Deserializar los objetos Empleado y Jefe
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/empleados_jefes.ser"));
            ArrayList<Empleado> empleadosDeserializados = (ArrayList<Empleado>) in.readObject();
            ArrayList<Jefe> jefesDeserializados = (ArrayList<Jefe>) in.readObject();
            in.close();

            System.out.println("Objetos deserializados correctamente.");
            for (Empleado empleado : empleadosDeserializados) {
                System.out.println(empleado);
            }
            for (Jefe jefe : jefesDeserializados) {
                System.out.println(jefe);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha salido mal al deserializar.");
            e.printStackTrace();
        }
    }

    private static void runEjercicio4() {
        HashMap<String, Persona> personasMap = new HashMap<>();
        personasMap.put("654321", new Persona("Juan", 30, "12345678A"));
        personasMap.put("123456", new Persona("Ana", 25, "87654321B"));
        personasMap.put("789012", new Persona("Luis", 40, "11223344C"));

        // Serializar el HashMap de objetos Persona
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/mapa.ser"));
            out.writeObject(personasMap);
            out.close();
        } catch (IOException e) {
            System.out.println("Algo ha salido mal.");
            e.printStackTrace();
        }

        // Deserializar el HashMap de objetos Persona y mostrarlo ordenado por clave
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/mapa.ser"));
            HashMap<String, Persona> mapaDeserializado = (HashMap<String, Persona>) in.readObject();
            in.close();

            System.out.println("Objeto deserializado correctamente.");
            mapaDeserializado.entrySet().stream()
                    .sorted(HashMap.Entry.comparingByKey())
                    .forEach(entry -> System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue()));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha salido mal al deserializar.");
            e.printStackTrace();
        }
    }

    private static void runEjercicio1y2() {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 30, "12345678A"));
        personas.add(new Persona("Ana", 25, "87654321B"));
        personas.add(new Persona("Luis", 40, "11223344C"));

        // Serializar la lista de objetos Persona
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/personas.ser"));

            out.writeObject(personas);
            out.close();
        } catch (IOException e) {
            System.out.println("Algo ha salido mal.");
            e.printStackTrace();
            // Crear un archivo vacío si falla la serialización
            try { //Ejercicio 3
                new FileOutputStream("src/main/resources/personas.ser").close();
                runEjercicio1y2();
            } catch (IOException ex) {
                System.out.println("No se pudo crear el archivo vacío.");
                ex.printStackTrace();
            }
        }
        System.out.println("Objetos serializados correctamente.");

        // Deserializar el objeto Persona
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/personas.ser"));
            ArrayList<Persona> p = (ArrayList<Persona>) in.readObject();
            in.close();

            System.out.println("Objeto deserializado correctamente.");
            for (Persona persona : p) {
                System.out.println(persona);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha salido mal al deserializar.");
            e.printStackTrace();
        }

    }

}