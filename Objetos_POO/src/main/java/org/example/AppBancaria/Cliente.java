package org.example.AppBancaria;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Scanner;


@Getter
public class Cliente {
    Scanner in = new Scanner(System.in);

    private static int cantidad = 0;
    private int id;
    private String nombre;
    private String apellidos;

    public Cliente() {
        id = generarId();
        System.out.println("Introduzca el nombre:");
        nombre = in.next();
        System.out.println("Introduzca los apellidos:");
        apellidos = in.next();
    }

    private int generarId() {
        return ++cantidad;
    }




}
