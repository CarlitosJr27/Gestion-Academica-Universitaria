package utp.Ac.Pa.sistema.domain;

public class Requisito {
    private String descripcion;
    private Asignatura asignatura;

    public Requisito(String descripcion, Asignatura asignatura) {
        this.descripcion = descripcion;
        this.asignatura = asignatura;
    }

    public boolean verificarCumplimiento(Estudiante estudiante) {
        // Aquí puedes agregar lógica real de verificación
        return true;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
