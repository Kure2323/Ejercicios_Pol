package Unidad_3;

public class Arrays2 {
    void ejecutar(){

        int[] Arr = {5,1,2,3,4};
        int[] rrA = new int[Arr.length];

        for (int i = 0; i < Arr.length - 1;i++){
            int x = Arr[i];
            int y = Arr[(Arr.length - 1) - i];
            rrA[i] = y;
            rrA[(Arr.length - 1) - i] = x;
        }
        for (int i = 0; i < rrA.length; i++){
            System.out.print("[" + rrA[i] + "]");
        }

    }
}
