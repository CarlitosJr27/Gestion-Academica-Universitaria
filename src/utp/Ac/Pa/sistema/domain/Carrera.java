package utp.Ac.Pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private List<Asignatura> asignaturas;
    private List<Requisito> requisitos;
    private List<Estudiante> estudiantes;

    public Carrera(String nombre, List<Asignatura> asignaturas, List<Requisito> requisitos) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.requisitos = requisitos;
        this.estudiantes = new ArrayList<>();
    }

    public Carrera(String nombre, List<Requisito> requisitos) {
        this.nombre = nombre;
        this.requisitos = requisitos;
        this.asignaturas = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void asignarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public boolean validarRequisitos(Estudiante estudiante) {
        return true; // lógica simulada
    }

    public String getNombre() { return nombre; }
    public List<Asignatura> getAsignaturas() { return asignaturas; }
    public List<Requisito> getRequisitos() { return requisitos; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
}