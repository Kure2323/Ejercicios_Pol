package org.example.PlatStreaming;

public class PlataformaStreaming {

    public static void main(String[] args) {

        Suscripcion[] listaSuscripcion = {
                new PlanGratis("Gratis",0.00),
                new PlanBasico("Básico", 3.49),
                new PlanPremium("Premium", 5.00),
                new PlanFamiliar("Familiar", 12.00)
        };

        for (int i = 0; i < listaSuscripcion.length; i++) {
            listaSuscripcion[i].obtenerBeneficios();
            listaSuscripcion[i].mostrarInfo();
            listaSuscripcion[i].obtenerPeriodoPrueba();
        }




    }

}
