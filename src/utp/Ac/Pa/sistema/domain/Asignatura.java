package utp.Ac.Pa.sistema.domain;

public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;

    public Asignatura(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    // Setters (necesarios para GestorAcademico)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
