package Unidad_3;

public class Arrays6 {
    void ejecutar(){

        int[] Arr = {1,2,3,2,1};
        int[] rrA = new int[Arr.length];
        int verificador = 0;

        for (int i = 0; i < Arr.length - 1;i++){
            int x = Arr[i];
            int y = Arr[(Arr.length - 1) - i];
            if (x != y) {
                verificador++;
            }
        }
        if (verificador > 0) {
            System.out.println("El array no es simétrico");
        } else {
            System.out.println("El array es simétrico");
        }
    }
}
