package utp.Ac.Pa.sistema.domain;

public class Reporte {
    private Estudiante estudiante;
    private double promedio;
    private String observaciones;

    public Reporte(Estudiante estudiante, double promedio, String observaciones) {
        this.estudiante = estudiante;
        this.promedio = promedio;
        this.observaciones = observaciones;
    }

    public void generar() {
        // lógica de generación
    }

    public void exportarPDF() {
        // lógica de exportación
    }
}

