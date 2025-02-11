package org.example.Redes_Sociales;

public class Usuario {

    private String nombre;
    private int edad;
    private String nickname;
    private int seguidores;

    public Usuario(String nombre, int edad, String nickname, int seguidores) {
        this.edad=edad;
        this.nombre=nombre;
        this.nickname=nickname;
        this.seguidores=seguidores;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("De edad: " + edad);
        System.out.println("Nickname: " + nickname);
        System.out.println("Seguidores: " + seguidores);
    }



}
