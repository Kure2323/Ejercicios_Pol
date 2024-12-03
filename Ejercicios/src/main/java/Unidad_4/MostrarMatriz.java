package Unidad_4;

public class MostrarMatriz {
    public static void ejercicioTal() {

        int[][] matriz = new int[3][3];

        matriz = Method.RdmMatriz(matriz);
        Method.MostrarMatriz(matriz);
        System.out.println();
        Method.OrdenarMatriz(matriz);
        Method.MostrarMatriz(matriz);


    }
}
