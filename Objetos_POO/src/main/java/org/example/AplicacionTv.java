package org.example;

import java.util.Scanner;

public class AplicacionTv {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Televisor televisor = new Televisor();

//        System.out.println("Canal: " + televisor.getCanal() + " Volumen: " + televisor.getVolumen());
//        televisor.bajarCanal();
//        televisor.subirCanal();
//        televisor.bajarCanal();
//        televisor.setCanal(55);
//        televisor.setVolumen(96);

//        Paciente paciente = new Paciente("Llados", 'H', 30, 130.8, 170);
//        paciente.mostrarInfoPaciente();
//        Paciente paciente1 = new Paciente();
//        paciente1.mostrarInfoPaciente();
//        Paciente paciente2 = new Paciente("Boix", 18, 'H');
//        paciente2.mostrarInfoPaciente();
//
        System.out.println("Introduce un nombre:");
        String nombre = in.next();
        System.out.println("Introduce una edad:");
        int edad = in.nextInt();
        System.out.println("Introduce el género:");
        char sexo = in.next().charAt(0);
        System.out.println("Introduce el peso;");
        double peso = in.nextDouble();
        System.out.println("Introduce la altura:");
        int altura = in.nextInt();

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente(nombre, edad, sexo);
        Paciente paciente3 = new Paciente(nombre, sexo, edad, peso, altura);
        paciente3.mostrarInfoPaciente();

        paciente1.setNombre("Paco");
        paciente1.setEdad(35);
        paciente1.setSexo('H');
        paciente1.setPeso(87);
        paciente1.setAltura(145);

        System.out.println(paciente1);

        comprobarPeso(paciente1);
        comprobarPeso(paciente2);
        comprobarPeso(paciente3);



    }
    public static void comprobarPeso(Paciente paciente) {
        int IMC = paciente.calcularIMC();

        switch (IMC) {
            case Paciente.PESO_BAJO:
                System.out.println("La persona " + paciente.getNombre() + " está por debajo de su peso ideal");
                break;
            case Paciente.PESO_IDEAL:
                System.out.println("La persona " + paciente.getNombre() + " está en su peso ideal");
                break;
            case Paciente.SOBREPESO:
                System.out.println("La persona " + paciente.getNombre() + " está sobre su peso ideal");
                break;
        }


    }

    public static void esMayorDeEdad(Paciente paciente) {

        if (paciente.esMayorDeEdad()){
            System.out.println("El paciente " + paciente.getNombre() + " es mayor de edad");
        } else {
            System.out.println("El paciente " + paciente.getNombre() + " es menor de edad");
        }

    }


}
