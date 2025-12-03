package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Evaluacion;
import utp.Ac.Pa.sistema.domain.Estudiante;
import utp.Ac.Pa.sistema.domain.Asignatura;
import utp.Ac.Pa.sistema.domain.Usuario;

public class EvaluacionVentana {
    public static void main(String[] args) {
        String tipo = JOptionPane.showInputDialog("Tipo de evaluación:");
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota:"));
        String fecha = JOptionPane.showInputDialog("Fecha:");

        Estudiante estudiante = new Estudiante("E1", "Carlos", "carlos@mail.com", new Usuario("carlos", "123", null));
        Asignatura asignatura = new Asignatura("MAT101", "Matemáticas", 4);

        Evaluacion evaluacion = new Evaluacion(tipo, nota, fecha, estudiante, asignatura);

        JOptionPane.showMessageDialog(null,
            "Evaluación registrada:\nTipo: " + evaluacion.getTipo() +
            "\nNota: " + evaluacion.getNota() +
            "\nFecha: " + evaluacion.getFecha());
    }
}