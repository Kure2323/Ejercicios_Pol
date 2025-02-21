package org.example.Festival;

public class Concierto {
    public static void main(String[] args) {


        try{
            Persona[] personas = { new Artista("Sofía", 25, "Rock Alternativo"),
                    new Asistente("Lucas", 15, TipoEntrada.VIP), new Organizador("Martín", 30, "Producción")};

        }catch (EdadMinimaException e){
            System.out.println(e.getMessage());
        }

//        for (Persona per : personas) {
//            per.mostrarInfo();
//            if (per instanceof Organizable) {
//                ((Organizable) per).organizarEvento();
//            }
//
//        }



        for (TipoEntrada entrada : TipoEntrada.values()) {
            System.out.println(entrada.name());
        }


    }




}





//    public static void mostrarAcceso(Persona persona) {
//        persona.accederEvento();
//    }

