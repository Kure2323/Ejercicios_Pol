package org.example.casa;

public class AppCasa {

    public static void main(String[] args) {
        Casa casa = new Casa("Calle Mayor 123");
         casa.agregarHabitacion("Dormitorio", 5.00);
         casa.agregarHabitacion("Cocina", 15.50);
         casa.agregarHabitacion("Baño", 2.00);

         casa.mostrarHabitaciones();
    }

}
