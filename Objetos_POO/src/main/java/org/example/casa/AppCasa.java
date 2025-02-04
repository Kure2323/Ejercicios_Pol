package org.example.casa;

public class AppCasa {

    public static void main(String[] args) {
        Casa casa = new Casa("Calle Mayor 123");
        casa.agregarHabitacion("Dormitorio", 5.00);
        casa.agregarHabitacion("Cocina", 15.50);
        casa.agregarHabitacion("Baño", 2.00);
        casa.agregarHabitacion("Dormitorio", 5.00);


        casa.mostrarHabitaciones();
        System.out.println();
        System.out.println(casa.getHabitacionMasGrande());
        casa.eliminarHabitacion("Dormitorio");
        casa.mostrarHabitaciones();

        casa.getHabitaciones().get(0).agregarElectrodomestico("Lavadora", 245.45);
        casa.getHabitaciones().get(0).agregarElectrodomestico("Tostadora", 20.45);
        System.out.println(casa.getHabitaciones().get(0).calcularConsumo());



    }

}
