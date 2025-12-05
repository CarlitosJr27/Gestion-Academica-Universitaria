package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.*;

import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class EvaluacionVentana {
    public static void main(String[] args) {
        String tipo = solicitarSoloLetras("Tipo de evaluación (ejemplo: Examen, Proyecto):");
        double nota = Double.parseDouble(solicitarNoVacio("Nota (ejemplo: 4.5):"));
        String fecha = solicitarNoVacio("Fecha (ejemplo: 2025-12-04):");

        Estudiante estudiante = new Estudiante("E1", "Carlos", "carlos@mail.com", new Usuario("carlos", "123", null));
        Asignatura asignatura = new Asignatura("MAT101", "Matemáticas", 4);

        Evaluacion evaluacion = new Evaluacion(tipo, nota, fecha, estudiante, asignatura);

        JOptionPane.showMessageDialog(null,
            "Evaluación registrada:\nTipo: " + evaluacion.getTipo() +
            "\nNota: " + evaluacion.getNota() +
            "\nFecha: " + evaluacion.getFecha() +
            "\nEstudiante: " + evaluacion.getEstudiante().getNombre() +
            "\nAsignatura: " + evaluacion.getAsignatura().getNombre());
    }
}