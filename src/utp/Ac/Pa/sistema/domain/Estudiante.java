package utp.Ac.Pa.sistema.domain;

public class Estudiante {
    private String id;
    private String nombre;
    private String correo;
    private String carrera;
    private String grupo;

    public Estudiante(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }

    public void asignarCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void asignarGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String obtenerPromedio() {
        // Lógica para calcular promedio
        return "Promedio calculado";
    }

    public void editar(String nuevoNombre, String nuevoCorreo) {
        this.nombre = nuevoNombre;
        this.correo = nuevoCorreo;
    }

    // Getters y setters omitidos por brevedad
}

