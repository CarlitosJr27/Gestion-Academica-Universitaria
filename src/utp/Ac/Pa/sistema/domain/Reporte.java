package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class Reporte {
    private String titulo;
    private List<String> contenido;

    public Reporte(String titulo, List<String> contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() { return titulo; }
    public List<String> getContenido() { return contenido; }

    public void mostrar() {
        System.out.println("=== " + titulo + " ===");
        for (String linea : contenido) {
            System.out.println(linea);
        }
    }
}