package utp.Ac.Pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

public class Docente {
    private String id;
    private String nombre;
    private String correo;
    private List<String> asignaturas;

    public Docente(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.asignaturas = new ArrayList<>();
    }

    public void asignarAsignatura(String asignatura) {
        this.asignaturas.add(asignatura);
    }

    public void editar(String nuevoNombre, String nuevoCorreo) {
        this.nombre = nuevoNombre;
        this.correo = nuevoCorreo;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }
}
