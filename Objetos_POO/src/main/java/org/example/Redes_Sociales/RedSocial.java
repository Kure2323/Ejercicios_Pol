package org.example.Redes_Sociales;

public class RedSocial {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Izan", 19, "IzanButanero", 101);
        Influencer influencer = new Influencer("Andrew", 20, "Andisito69UwU", 5000);
        influencer.agregarColaborador("Pepsi-cola");
        influencer.mostrarInfo();
    }

}

