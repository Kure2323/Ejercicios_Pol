package org.example.Lombok;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;


//@RequiredArgsConstructor    //Solo no nulls y finals
//@Data   //Hace getter, setter, toString y constructor requerido
@Getter @ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class Instituto {

    @NonNull
    private String nombre;
    @Setter
    private String poblacion;
    @Setter
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    @Setter
    private ArrayList<Curso> listaCursos = new ArrayList<>();


    public Instituto(String nombre, String poblacion) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.poblacion = poblacion;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            listaEstudiantes.add(estudiante);
            if (estudiante.getCurso() != null) {
                agregarCurso(estudiante.getCurso());
            }
        }
    }

    public void agregarCurso(Curso curso) {
        if (curso != null) {
            for (Curso cur : listaCursos) {
                if (curso.getNombre().equals(cur.getNombre()) && curso.getHoras() == cur.getHoras()) {
                    return;
                }
            }
            listaCursos.add(curso);
        }
    }

}
