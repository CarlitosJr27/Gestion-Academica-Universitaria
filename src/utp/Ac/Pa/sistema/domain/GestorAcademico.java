package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class GestorAcademico {
    public Carrera crearCarrera(String nombre, List<Requisito> requisitos) {
        return new Carrera(nombre, requisitos);
    }

    public Asignatura crearAsignatura(String codigo, String nombre, int creditos) {
        return new Asignatura(codigo, nombre, creditos);
    }

    public void editarAsignatura(Asignatura asignatura, String nuevoNombre, int nuevosCreditos) {
        asignatura.setNombre(nuevoNombre);
        asignatura.setCreditos(nuevosCreditos);
    }

    public void asignarEstudianteACarrera(Carrera carrera, Estudiante estudiante) {
        carrera.asignarEstudiante(estudiante);
    }
}
