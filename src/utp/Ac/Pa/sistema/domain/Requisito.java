package utp.Ac.Pa.sistema.domain;

public class Requisito {
    private String descripcion;
    private Asignatura asignatura;

    public Requisito(String descripcion, Asignatura asignatura) {
        this.descripcion = descripcion;
        this.asignatura = asignatura;
    }

    public boolean verificarCumplimiento(Estudiante estudiante) {
        // lógica de verificación
        return true;
    }
}

