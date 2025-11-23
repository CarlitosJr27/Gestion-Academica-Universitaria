package utp.Ac.Pa.sistema.domain;

public class Estudiante {
    private String id;
    private String nombre;
    private String correo;
    private String carrera;
    private String grupo;
    private Usuario cuentaUsuario;

    public Estudiante(String id, String nombre, String correo, Usuario cuentaUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.cuentaUsuario = cuentaUsuario;
    }

    public void asignarCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void asignarGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void editar(String nuevoNombre, String nuevoCorreo) {
        this.nombre = nuevoNombre;
        this.correo = nuevoCorreo;
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getCarrera() { return carrera; }
    public String getGrupo() { return grupo; }
    public Usuario getCuentaUsuario() { return cuentaUsuario; }
    public void setCuentaUsuario(Usuario cuentaUsuario) { this.cuentaUsuario = cuentaUsuario; }
}
