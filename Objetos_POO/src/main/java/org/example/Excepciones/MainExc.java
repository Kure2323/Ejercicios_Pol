package org.example.Excepciones;

public class MainExc {

    public static void main(String[] args) throws NivelValidoException {

        int nivel = 150;

        if (nivel > 100) {
            throw new NivelValidoException();
        }


    }

}
