package utp.Ac.Pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

public class Docente {
    private String id;
    private String nombre;
    private String correo;
    private List<String> asignaturas;
    private Usuario cuentaUsuario;

    public Docente(String id, String nombre, String correo, Usuario cuentaUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.cuentaUsuario = cuentaUsuario;
        this.asignaturas = new ArrayList<>();
    }

    public void asignarAsignatura(String asignatura) {
        this.asignaturas.add(asignatura);
    }

    public void editar(String nuevoNombre, String nuevoCorreo) {
        this.nombre = nuevoNombre;
        this.correo = nuevoCorreo;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public List<String> getAsignaturas() { return asignaturas; }
    public Usuario getCuentaUsuario() { return cuentaUsuario; }
    public void setCuentaUsuario(Usuario cuentaUsuario) { this.cuentaUsuario = cuentaUsuario; }
}
