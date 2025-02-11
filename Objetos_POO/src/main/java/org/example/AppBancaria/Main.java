package org.example.AppBancaria;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        System.out.println(cliente3.getId());
        Cuenta cuenta = new Cuenta();
        Cuenta cuenta1 = new Cuenta();
        System.out.println(cuenta1.getIban());


    }
}
