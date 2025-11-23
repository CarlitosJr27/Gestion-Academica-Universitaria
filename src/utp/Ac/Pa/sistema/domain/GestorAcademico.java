package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class GestorAcademico {

    // Crea una nueva carrera con requisitos
    public Carrera crearCarrera(String nombre, List<Requisito> requisitos) {
        return new Carrera(nombre, requisitos);
    }

    // Crea una nueva asignatura con código, nombre y créditos
    public Asignatura crearAsignatura(String codigo, String nombre, int creditos) {
        return new Asignatura(codigo, nombre, creditos);
    }

    // Edita los atributos de una asignatura existente
    public void editarAsignatura(Asignatura asignatura, String nuevoNombre, int nuevosCreditos) {
        if (asignatura != null) {
            asignatura.setNombre(nuevoNombre);
            asignatura.setCreditos(nuevosCreditos);
        }
    }

    // Asigna un estudiante a una carrera
    public void asignarEstudianteACarrera(Carrera carrera, Estudiante estudiante) {
        if (carrera != null && estudiante != null) {
            carrera.asignarEstudiante(estudiante);
        }
    }

    // Asigna un docente a una asignatura
    public void asignarDocenteAAsignatura(Docente docente, String asignaturaCodigo) {
        if (docente != null && asignaturaCodigo != null && !asignaturaCodigo.isEmpty()) {
            docente.asignarAsignatura(asignaturaCodigo);
        }
    }

    // Valida si un estudiante cumple los requisitos de una carrera
    public boolean validarIngresoACarrera(Carrera carrera, Estudiante estudiante) {
        if (carrera != null && estudiante != null) {
            return carrera.validarRequisitos(estudiante);
        }
        return false;
    }
}
