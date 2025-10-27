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

    public double calcularPromedio() {
        return nota;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
