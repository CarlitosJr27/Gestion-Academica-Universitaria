package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
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
            "✅ Docente creado:\nID: " + docente.getId() +
            "\nNombre: " + docente.getNombre() +
            "\nCorreo: " + docente.getCorreo());

        // Selección del tipo de evaluación
        String[] tipos = {"Examen", "Laboratorio", "Talleres", "Semestral"};
        String tipoSeleccionado = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de evaluación:",
                "Evaluación",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipos,
                tipos[0]);

        if (tipoSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "❌ Operación cancelada.");
            System.exit(0);
        }

        // Nota: solo números entre 1 y 100
        int nota = -1;
        boolean valido = false;
        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog("Ingrese la nota (1 - 100):");
                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "❌ Operación cancelada.");
                    System.exit(0);
                }
                nota = Integer.parseInt(entrada);
                if (nota >= 1 && nota <= 100) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "⚠️ La nota debe estar entre 1 y 100.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "⚠️ Solo se permiten números.");
            }
        }

        // Conversión de nota a letra
        String letra;
        if (nota <= 60) letra = "F";
        else if (nota <= 70) letra = "D";
        else if (nota <= 80) letra = "C";
        else if (nota <= 90) letra = "B";
        else letra = "A";

        // Mostrar resultado final
        JOptionPane.showMessageDialog(null,
            "✅ Evaluación registrada:\n" +
            "Docente: " + docente.getNombre() + "\n" +
            "Tipo de evaluación: " + tipoSeleccionado + "\n" +
            "Nota: " + nota + "\n" +
            "Calificación final: " + letra);
    }
}