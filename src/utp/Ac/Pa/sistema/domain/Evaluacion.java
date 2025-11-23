package utp.Ac.Pa.sistema.domain;

public class Evaluacion {
    private String tipo;
    private double nota;
    private String fecha;
    private Estudiante estudiante;
    private Asignatura asignatura;

    public Evaluacion(String tipo, double nota, String fecha, Estudiante estudiante, Asignatura asignatura) {
        this.tipo = tipo;
        this.nota = nota;
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public void registrarNota(double nuevaNota) {
        this.nota = nuevaNota;
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public double getNota() { return nota; }
    public String getFecha() { return fecha; }
    public Estudiante getEstudiante() { return estudiante; }
    public Asignatura getAsignatura() { return asignatura; }
}
