package org.example.Lombok;

import lombok.*;

@Getter @ToString @Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Estudiante {
    /**
     * El nombre es el único que tiene NonNull pues se trata de un atributo imprescindible
     * y no puede ser vacío.
     */
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

}
