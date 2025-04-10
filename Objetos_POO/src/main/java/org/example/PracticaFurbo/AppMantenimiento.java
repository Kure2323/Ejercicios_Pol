package org.example.PracticaFurbo;

import java.util.Scanner;

import static org.example.PracticaFurbo.Masajista.listaMasajistas;

public class AppMantenimiento {

    static Scanner in = new Scanner(System.in);

    /**
     * Método el cual inicia todo el mantenimiento.
     * Sólo está disponible la tercera (3º) opción.
     * También es el único método public pues no me interesa que el resto sean llamados.
     */
    public static void iniciarMantenimiento() {
        System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
        System.out.println();
        System.out.println("    [1]. Mantenimiento de jugadores");
        System.out.println("        Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).");
        System.out.println("    [2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("        Dentro podremos añadir entrenadores y modificar sus datos.");
        System.out.println("    [3]. Mantenimiento masajistas (añadir-modificar datos-salir) ");
        System.out.println("        Dentro podremos añadir masajistas y modificar sus datos.");
        System.out.println("    [4]. Consultar equipos");
        System.out.println("        Dentro se deben listar los tipos de equipos del club y elegir uno.");
        System.out.println("    [X]. Salir");
        System.out.println();
        System.out.println("=============================================");
        System.out.println();
        System.out.println("Selecciona una opción -->");
        recibirOpcion();
    }

    /**
     * Recibe el dato recibido de la pantalla principal y le deriva a cada método correspondiente
     */
    private static void recibirOpcion() {
        switch (in.next()) {
            case "3":
                mantenerMasajistas();
                break;
            default:
                //Debe forzar salida del programa pues hay ocasiones donde este método es llamado y se solapa con otros,
                //en dichas ocasiones no termina el programa.
                System.exit(0);
                break;
        }
    }

    /**
     * Método para organizar y situar cómodamente las pantallas
     */
    private static void mantenerMasajistas() {
        pantalla3();
        recibirOpcion3();
    }

    /**
     * Muestra por pantalla el menú de las tercera opción del menú principal de mantenimiento.
     * En este menú se muestran las opciones
     */
    private static void pantalla3() {
        System.out.println("=== Mantenimiento de Masajistas ===");
        System.out.println();
        System.out.println("    [1]. Añadir masajista nuevo");
        System.out.println("    [2]. Modificar masajista existente");
        System.out.println("    [X]. Volver a menú principal");
    }

    /**
     * Recibe el dato de la pantalla3 y lo redirige a sus métodos correspondientes en un switch case,
     * en caso de 'X' o cualquier otro, vuelve a la pantalla anterior
     */
    private static void recibirOpcion3() {
        switch (in.next()) {
            case "1":
                anyadirMasajistaNuevo();
                break;
            case "2":
                modificarMasajista();
                break;
            default:
                iniciarMantenimiento();
                break;
        }
    }

    /**
     * Método donde se modifica un masajista, en caso de no existir ningún masajista vuelve a la pantalla anterior
     * Para seleccionar a un masajista tan solo se debe introducir su número correspondiente
     */
    private static void modificarMasajista() {
        if (listaMasajistas.isEmpty()) {
            System.out.println("No hay masajistas a los que modificar.");
            mantenerMasajistas();
        }

        System.out.println("¿Qué masajista quiere modificar? introduzca su número");
        for (Masajista mas : listaMasajistas) {
            System.out.println("    [" + listaMasajistas.indexOf(mas) + "] " + mas);
        }
        System.out.println("    [X] Volver");
        String entrada = in.next();
        for (Masajista mas : listaMasajistas) {
            if (Integer.toString(listaMasajistas.indexOf(mas)).equals(entrada)) {
                modificarMasajista(mas);
            }
        }

        mantenerMasajistas();
    }

    /**
     * Método en el que se pide todo para añadir un nuevo masajista y crearlo
     * Tras crearlo vuelve al menú de masajistas
     */
    private static void anyadirMasajistaNuevo() {
        System.out.println("Introducir el nombre del masajista");
        String nombre = in.next();
        System.out.println("Introduce los años del masajista");
        int anyo = in.nextInt();
        System.out.println("Introduce la titulación del masajista");
        String titulacion = in.next();
        System.out.println("Introduce los años de experiencia del masajista");
        Masajista masajistaN = new Masajista(nombre, anyo, titulacion, in.nextInt());
        System.out.println("El masajista " + nombre + " ha sido creado con éxito");
        mantenerMasajistas();
    }

    /**
     * Método donde tanto se muestra como se obtiene los datos de la pantalla de cuando una vez ya ha sido
     * seleccionado el masajista a modificar. En este menú se selecciona el atributo que se quiere cambiar del masajista
     * @param modifica Es introducido el masajista seleccionado en el menú de selección de masajista
     */
    private static void modificarMasajista(Masajista modifica) {
        System.out.println("¿Qué quiere modificar del masajista en cuestión?");
        System.out.println("    [1]. Nombre");
        System.out.println("    [2]. Edad");
        System.out.println("    [3]. Titulación");
        System.out.println("    [4]. Años de experiencia");
        System.out.println("    [X]. Volver");
        switch (in.next()) {
            case "1":
                System.out.println("Introduce el nombre que quiere que tenga:");
                modifica.setNombre(in.next());
                System.out.println("Modificado con éxito");
                modificarMasajista(modifica);
                break;
            case "2":
                System.out.println("Introduce la edad que quiere que tenga:");
                modifica.setEdad(in.nextInt());
                System.out.println("Modificado con éxito");
                modificarMasajista(modifica);
                break;
            case "3":
                System.out.println("Introduce la titulación que quiere que tenga:");
                modifica.setTitulacion(in.next());
                System.out.println("modificado con éxito");
                modificarMasajista(modifica);
                break;
            case "4":
                System.out.println("Introduce los años de experiencia que quiere que tenga:");
                modifica.setAnosExperiencia(in.nextInt());
                System.out.println("Modificado con éxito");
                modificarMasajista(modifica);
                break;
            default:
                break;
        }
    }
}
