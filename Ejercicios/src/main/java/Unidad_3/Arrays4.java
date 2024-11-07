package Unidad_3;

import java.util.Scanner;

public class Arrays4 {
    void ejecutar(){

        Scanner entrada = new Scanner(System.in);

        int[] nums = {1,2,3,4,5};
        int[] arr = new int[(nums.length -1)];
        System.out.println("Ingresa el índice a eliminar:");
        int elim = entrada.nextInt();
        int j = 0;

        for (int i = 0; i<nums.length; i++) {
            if (i == elim) {
                continue;
            } else {
                arr[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print("[" + arr[i] + "]");
        }








    }
}
