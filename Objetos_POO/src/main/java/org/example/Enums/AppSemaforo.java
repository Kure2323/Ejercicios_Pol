package org.example.Enums;

public class AppSemaforo {

    public static void main(String[] args) {
        Semaforo color = Semaforo.ROJO;
        for (int i = 0; i < 10; i++) {
            System.out.println(color.siguiente());
        }
    }


}
