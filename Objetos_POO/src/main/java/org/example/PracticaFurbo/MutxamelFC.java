package org.example.PracticaFurbo;

import lombok.Data;

@Data
public abstract class MutxamelFC implements FuncionesIntegrantes{

    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad) {
        this.nombre=nombre;
        this.edad=edad;
    }

}
