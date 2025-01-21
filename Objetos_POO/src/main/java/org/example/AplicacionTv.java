package org.example;

public class AplicacionTv {


    public static void main(String[] args) {
        Televisor televisor = new Televisor();

//        System.out.println("Canal: " + televisor.getCanal() + " Volumen: " + televisor.getVolumen());
//        televisor.bajarCanal();
//        televisor.subirCanal();
//        televisor.bajarCanal();
//        televisor.setCanal(55);
//        televisor.setVolumen(96);

        Paciente paciente = new Paciente("Llados", 'H', 30, 130.8, 170);
        paciente.mostrarInfoPaciente();
        Paciente paciente1 = new Paciente();
        paciente1.mostrarInfoPaciente();
        Paciente paciente2 = new Paciente("Boix", 18, 'H');
        paciente2.mostrarInfoPaciente();




    }




}
