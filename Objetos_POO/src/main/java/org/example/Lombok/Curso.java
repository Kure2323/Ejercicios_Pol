package org.example.Lombok;

import lombok.*;

import java.util.Objects;

@Getter @ToString @Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Curso {
    @NonNull
    private String nombre;
    private int horas;


}
