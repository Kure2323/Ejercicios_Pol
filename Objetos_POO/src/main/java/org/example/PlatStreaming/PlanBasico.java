package org.example.PlatStreaming;

public class PlanBasico extends Suscripcion{

    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");
    }

    @Override
    void obtenerPeriodoPrueba() {
        System.out.println("30 días de prueba gratuita.");
    }
}
