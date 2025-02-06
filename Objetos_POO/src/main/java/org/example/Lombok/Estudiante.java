package org.example.Lombok;

import lombok.*;

@Getter @ToString @Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Estudiante {
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

}
