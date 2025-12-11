package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.*;
import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class UsuarioVentana {
    public static void main(String[] args) {
        // Selección de tipo de usuario
        String[] tiposUsuario = {"Estudiante", "Docente"};
        String tipoSeleccionado = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de usuario a registrar:",
                "Registro de Usuario",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tiposUsuario,
                tiposUsuario[0]);

        if (tipoSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "❌ Operación cancelada.");
            System.exit(0);
        }

        // Datos comunes
        String id = solicitarNoVacio("ID:");
        String nombre = solicitarSoloLetras("Nombre (solo letras):");
        String correo = solicitarCorreo("Correo:");

        Usuario cuenta = new Usuario("usuarioGen", "clave123", null);

        if (tipoSeleccionado.equals("Estudiante")) {
            // Registro de estudiante
            Estudiante estudiante = new Estudiante(id, nombre, correo, cuenta);

            // Selección de carrera
            String[] opcionesCarrera = {"Licenciatura en Ciberseguridad", "Programación", "Redes"};
            String seleccionCarrera = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione una carrera:",
                    "Carrera",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionesCarrera,
                    opcionesCarrera[0]);

            // Selección de horario
            String[] opcionesHorario = {
                "Mañana (7:00 a.m - 12:45 p.m)",
                "Tarde (12:50 p.m - 5:45 p.m)",
                "Noche (5:50 p.m - 10:45 p.m)"
            };
            String seleccionHorario = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione un horario:",
                    "Horario",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionesHorario,
                    opcionesHorario[0]);

            JOptionPane.showMessageDialog(null,
                "✅ Estudiante registrado:\n" +
                "ID: " + estudiante.getId() + "\n" +
                "Nombre: " + estudiante.getNombre() + "\n" +
                "Correo: " + estudiante.getCorreo() + "\n" +
                "Carrera: " + seleccionCarrera + "\n" +
                "Horario: " + seleccionHorario);

        } else {
            // Registro de docente
            Docente docente = new Docente(id, nombre, correo, cuenta);

            // Selección de tipo de evaluación
            String[] tiposEval = {"Examen", "Laboratorio", "Talleres", "Semestral"};
            String tipoEval = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione el tipo de evaluación:",
                    "Evaluación",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    tiposEval,
                    tiposEval[0]);

            // Nota numérica 1-100
            int nota = -1;
            boolean valido = false;
            while (!valido) {
                try {
                    String entrada = JOptionPane.showInputDialog("Ingrese la nota (1 - 100):");
                    if (entrada == null) System.exit(0);
                    nota = Integer.parseInt(entrada);
                    if (nota >= 1 && nota <= 100) valido = true;
                    else JOptionPane.showMessageDialog(null, "⚠️ La nota debe estar entre 1 y 100.");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "⚠️ Solo se permiten números.");
                }
            }

            // Conversión a letra
            String letra;
            if (nota <= 60) letra = "F";
            else if (nota <= 70) letra = "D";
            else if (nota <= 80) letra = "C";
            else if (nota <= 90) letra = "B";
            else letra = "A";

            JOptionPane.showMessageDialog(null,
                "✅ Docente registrado:\n" +
                "ID: " + docente.getId() + "\n" +
                "Nombre: " + docente.getNombre() + "\n" +
                "Correo: " + docente.getCorreo() + "\n" +
                "Evaluación: " + tipoEval + "\n" +
                "Nota: " + nota + " (" + letra + ")");
        }
    }
}