package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import utp.Ac.Pa.sistema.domain.*;
import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class DocenteVentana {
    public static void main(String[] args) {
        String id = solicitarNoVacio("ID del docente:");
        String nombre = solicitarSoloLetras("Nombre del docente (solo letras):");
        String correo = solicitarCorreo("Correo del docente:");

        Usuario cuenta = new Usuario("usuarioDoc", "clave456", null);
        Docente docente = new Docente(id, nombre, correo, cuenta);

        JOptionPane.showMessageDialog(null,
            "Docente creado:\nID: " + docente.getId() +
            "\nNombre: " + docente.getNombre() +
            "\nCorreo: " + docente.getCorreo());

        // Evaluación integrada
        String opcion = JOptionPane.showInputDialog("¿Desea evaluar a 1 o varios estudiantes? (1 / varios)");

        if (opcion != null && opcion.equalsIgnoreCase("1")) {
            evaluarUnEstudiante(docente);
        } else if (opcion != null && opcion.equalsIgnoreCase("varios")) {
            evaluarVariosEstudiantes(docente);
        }
    }

    private static void evaluarUnEstudiante(Docente docente) {
        String tipo = solicitarSoloLetras("Tipo de evaluación (ejemplo: Examen):");
        double nota = Double.parseDouble(solicitarNoVacio("Nota (ejemplo: 4.5):"));
        String fecha = solicitarNoVacio("Fecha (ejemplo: 2025-12-04):");

        Estudiante estudiante = new Estudiante("E1", "Carlos", "carlos@mail.com", new Usuario("carlos", "123", null));
        Asignatura asignatura = new Asignatura("MAT101", "Matemáticas", 4);

        Evaluacion evaluacion = new Evaluacion(tipo, nota, fecha, estudiante, asignatura);

        JOptionPane.showMessageDialog(null,
            "Evaluación registrada:\nDocente: " + docente.getNombre() +
            "\nEstudiante: " + evaluacion.getEstudiante().getNombre() +
            "\nAsignatura: " + evaluacion.getAsignatura().getNombre() +
            "\nTipo: " + evaluacion.getTipo() +
            "\nNota: " + evaluacion.getNota());
    }

    private static void evaluarVariosEstudiantes(Docente docente) {
        List<Evaluacion> evaluaciones = new ArrayList<>();
        int cantidad = Integer.parseInt(solicitarNoVacio("¿Cuántos estudiantes desea evaluar?"));

        for (int i = 1; i <= cantidad; i++) {
            String tipo = solicitarSoloLetras("Tipo de evaluación para estudiante " + i + ":");
            double nota = Double.parseDouble(solicitarNoVacio("Nota estudiante " + i + ":"));
            String fecha = solicitarNoVacio("Fecha estudiante " + i + ":");

            Estudiante estudiante = new Estudiante("E" + i, "Estudiante" + i, "est" + i + "@mail.com", new Usuario("est" + i, "123", null));
            Asignatura asignatura = new Asignatura("MAT101", "Matemáticas", 4);

            evaluaciones.add(new Evaluacion(tipo, nota, fecha, estudiante, asignatura));
        }

        StringBuilder reporte = new StringBuilder("✅ Evaluaciones registradas por el docente " + docente.getNombre() + ":\n");
        for (Evaluacion e : evaluaciones) {
            reporte.append("Estudiante: ").append(e.getEstudiante().getNombre())
                   .append(" | Nota: ").append(e.getNota())
                   .append(" | Tipo: ").append(e.getTipo())
                   .append(" | Fecha: ").append(e.getFecha()).append("\n");
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}