package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class Carrera {
    private String nombre;
    private List<Requisito> requisitos;

    public Carrera(String nombre, List<Requisito> requisitos) {
        this.nombre = nombre;
        this.requisitos = requisitos;
    }

    public boolean validarRequisitos(Estudiante estudiante) {
        // lógica de validación
        return true;
    }

    public void asignarEstudiante(Estudiante estudiante) {
        estudiante.asignarCarrera(nombre);
    }
}

