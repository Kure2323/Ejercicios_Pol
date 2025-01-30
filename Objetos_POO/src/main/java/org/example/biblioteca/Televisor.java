package org.example.biblioteca;

public class Televisor {

    private int canal = 1;
    private int volumen = 5;

    public Televisor() {

    }

    public Televisor(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }

    public void subirCanal() {
        if (this.canal != 99){
            this.canal = ++canal;
            System.out.println("Canal: " + canal);
        }
    }
    public void bajarCanal() {
        if (this.canal != 1){
            this.canal = --canal;
            System.out.println("Canal: " + canal);
        }
    }
    public int getCanal() {
        return this.canal;
    }
    public int getVolumen() {
        return this.volumen;
    }
    public void setCanal(int valorCanal) {
        if (valorCanal < 100 && valorCanal > 0){
            this.canal = valorCanal;
            System.out.println("Canal: " + canal);
        }
    }
    public void setVolumen(int valorVolumen) {
        if (valorVolumen < 100 && valorVolumen > 0) {
            this.volumen = valorVolumen;
            System.out.println("Volumen: " + volumen);
        }
    }



}
