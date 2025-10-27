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

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}

