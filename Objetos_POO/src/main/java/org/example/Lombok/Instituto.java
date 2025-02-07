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

    /**
     * Como nombre es obligatorio debe ser NonNull y además
     * al no poder ser cambiado una vez creado, este no tiene Setter
     * al contrario que el resto de atributos.
     */
    @NonNull
    private String nombre;
    @Setter
    private String poblacion;
    @Setter
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    @Setter
    private ArrayList<Curso> listaCursos = new ArrayList<>();

    /**
     * Constructor creado para el caso de solo introducción de nombre y población.
     * @param nombre
     * @param poblacion
     */
    public Instituto(String nombre, String poblacion) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.poblacion = poblacion;
    }

    /**
     * Cuando el estudiante agregado sea not null entonces se añadirá a la lista de estudiantes
     * y además se incluirá el curso al que pertenece a la lista de cursos,
     * si es q este no existe ya y no sea nulo.
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            listaEstudiantes.add(estudiante);
            if (estudiante.getCurso() != null) {
                agregarCurso(estudiante.getCurso());
            }
        } else {
            System.out.println("No se puede agregar un estudiante nulo.");
        }
    }

    /**
     * Método que en caso de meter un curso not null lo busca en la lista de cursos, y si en esta no se
     * encuentra ya se añade.
     * @param curso
     */
    public void agregarCurso(Curso curso) {
        if (curso != null) {
            for (Curso cur : listaCursos) {
                if (curso.getNombre().equals(cur.getNombre()) && curso.getHoras() == cur.getHoras()) {
                    return;
                }
            }
            listaCursos.add(curso);
        } else {
            System.out.println("No se puede agregar un curso nulo.");
        }
    }

}
