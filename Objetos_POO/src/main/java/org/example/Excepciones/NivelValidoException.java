package org.example.Excepciones;

public class NivelValidoException extends Exception {

    public NivelValidoException() {
        super("El nivel no puede ser mayor de 100");
    }



}
