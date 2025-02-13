package org.example.PlatStreaming;

public class PlanPremium extends Suscripcion{
    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");
    }

    @Override
    void obtenerPeriodoPrueba() {
        System.out.println("14 días de prueba gratuita.");
    }
}
