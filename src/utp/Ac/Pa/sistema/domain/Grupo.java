package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class Grupo {
    private String id;
    private List<Estudiante> estudiantes;
    private Docente docente;
    private Asignatura asignatura;

    public Grupo(String id, Docente docente, Asignatura asignatura) {
        this.id = id;
        this.docente = docente;
        this.asignatura = asignatura;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void asignarHorario(Horario horario) {
        // lógica de asignación
    }
}
