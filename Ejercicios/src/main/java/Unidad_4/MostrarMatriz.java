package Unidad_4;

public class MostrarMatriz {
    public static void ejercicioTal() {

        int[][] matriz = new int[3][3];

        matriz = Method.RdmMatriz(matriz);
        Method.MostrarMatrizInt(matriz);
        System.out.println();
        Method.OrdenarMatriz(matriz);
        Method.MostrarMatrizInt(matriz);


    }
}
