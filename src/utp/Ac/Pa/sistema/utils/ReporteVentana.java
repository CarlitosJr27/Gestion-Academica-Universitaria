package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Reporte;

import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class ReporteVentana {
    public static void main(String[] args) {
        String titulo = solicitarSoloLetras("Tipo de reporte (ejemplo: Estudiante, Universidad, Docente):");
        String contenido = solicitarNoVacio("Contenido del reporte:");

        Reporte reporte = new Reporte(titulo, java.util.Arrays.asList(contenido));

        JOptionPane.showMessageDialog(null,
            "Reporte creado:\nTítulo: " + reporte.getTitulo() +
            "\nContenido:\n" + String.join("\n", reporte.getContenido()));
    }
}