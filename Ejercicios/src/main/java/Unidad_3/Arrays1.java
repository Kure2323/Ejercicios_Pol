package Unidad_3;

import java.util.Random;

public class Arrays1 {
    void ejecutar(){

        int[] nums = new int[8];
        Random random = new Random();
        int suma = 0;

        for (int i = 0; i < nums.length -1;i++){
            nums[i] = random.nextInt(0,500);
            System.out.print("[" + nums[i] + "]");
            suma = nums[i] + suma;
        }
        System.out.println(suma);













    }
}
