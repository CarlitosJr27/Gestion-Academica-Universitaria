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
        return true;
    }

    public void asignarEstudiante(Estudiante estudiante) {
        estudiante.asignarCarrera(nombre);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Requisito> requisitos) {
        this.requisitos = requisitos;
    }
}

