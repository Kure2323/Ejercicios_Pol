package Unidad_4;

public class MetodosPrueba {

    public static int gradosKelvin(int celsius){

        final int CTE_KELVIN = 273;
        int kelvin = celsius + CTE_KELVIN;

        return kelvin;
    }
    public static void prueba_mismaclase() {
        gradosKelvin(17);
    }

}
