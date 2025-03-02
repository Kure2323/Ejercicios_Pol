package org.example.Lombok;

import lombok.*;

@Getter @ToString @Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Curso {
    /**
     * El nombre es el único que tiene NonNull pues se trata de un atributo imprescindible
     * y no puede ser vacío.
     */
    @NonNull
    private String nombre;
    private int horas;


}
