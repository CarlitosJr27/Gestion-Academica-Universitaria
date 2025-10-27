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
        System.out.println("Generando reporte para: " + estudiante.getNombre());
        System.out.println("Promedio: " + promedio);
        System.out.println("Observaciones: " + observaciones);
    }

    public void exportarPDF() {
        System.out.println("Exportando reporte en PDF...");
    }

    // Getters y Setters
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
