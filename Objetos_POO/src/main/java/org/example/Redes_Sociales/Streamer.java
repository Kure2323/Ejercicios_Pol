package org.example.Redes_Sociales;

public class Streamer extends Usuario{

    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nickname, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nickname, seguidores);
        this.horas_directo = horas_directo;
        this.numero_retransmisiones = numero_retransmisiones;
    }

    public void mostrarInfo() {
       super.mostrarInfo();
        System.out.println("Número de retransmisiones: " + numero_retransmisiones);
        System.out.println("Horas de directo: " + horas_directo);
    }




}
