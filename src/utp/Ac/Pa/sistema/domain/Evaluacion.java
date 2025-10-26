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
        return nota; // simplificado
    }
}

