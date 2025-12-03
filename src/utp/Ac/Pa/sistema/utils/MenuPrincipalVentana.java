package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;

import utp.Ac.Pa.sistema.domain.Asignatura;
import utp.Ac.Pa.sistema.domain.Docente;
import utp.Ac.Pa.sistema.domain.Estudiante;
import utp.Ac.Pa.sistema.domain.Grupo;
import utp.Ac.Pa.sistema.domain.Horario;
import utp.Ac.Pa.sistema.domain.Usuario;

public class MenuPrincipalVentana {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog(
                "Menú Principal\n" +
                "1. Registrar Estudiante\n" +
                "2. Registrar Docente\n" +
                "3. Registrar Asignatura\n" +
                "4. Registrar Grupo\n" +
                "5. Salir\n\n" +
                "Ingrese una opción:"
            );

            if (opcion == null) break; // Si cierran la ventana

            switch (opcion) {
                case "1":
                    registrarEstudiante();
                    break;
                case "2":
                    registrarDocente();
                    break;
                case "3":
                    registrarAsignatura();
                    break;
                case "4":
                    registrarGrupo();
                    break;
                case "5":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }

    private static void registrarEstudiante() {
        String id = JOptionPane.showInputDialog("ID del estudiante:");
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String correo = JOptionPane.showInputDialog("Correo:");
        Usuario cuenta = new Usuario("userEst", "1234", null);

        Estudiante estudiante = new Estudiante(id, nombre, correo, cuenta);
        JOptionPane.showMessageDialog(null,
            "Estudiante creado:\nID: " + estudiante.getId() +
            "\nNombre: " + estudiante.getNombre() +
            "\nCorreo: " + estudiante.getCorreo());
    }

    private static void registrarDocente() {
        String id = JOptionPane.showInputDialog("ID del docente:");
        String nombre = JOptionPane.showInputDialog("Nombre:");
        String correo = JOptionPane.showInputDialog("Correo:");
        Usuario cuenta = new Usuario("userDoc", "abcd", null);

        Docente docente = new Docente(id, nombre, correo, cuenta);
        JOptionPane.showMessageDialog(null,
            "Docente creado:\nID: " + docente.getId() +
            "\nNombre: " + docente.getNombre() +
            "\nCorreo: " + docente.getCorreo());
    }

    private static void registrarAsignatura() {
        String codigo = JOptionPane.showInputDialog("Código de la asignatura:");
        String nombre = JOptionPane.showInputDialog("Nombre:");
        int creditos = Integer.parseInt(JOptionPane.showInputDialog("Créditos:"));

        Asignatura asignatura = new Asignatura(codigo, nombre, creditos);
        JOptionPane.showMessageDialog(null,
            "Asignatura creada:\nCódigo: " + asignatura.getCodigo() +
            "\nNombre: " + asignatura.getNombre() +
            "\nCréditos: " + asignatura.getCreditos());
    }

    private static void registrarGrupo() {
        String id = JOptionPane.showInputDialog("ID del grupo:");
        String nombre = JOptionPane.showInputDialog("Nombre del grupo:");
        Asignatura asignatura = new Asignatura("INF101", "Programación", 5);
        Docente docente = new Docente("D1", "Profesor Juan", "juan@mail.com", new Usuario("juan", "abcd", null));
        Horario horario = new Horario("Lunes", "08:00", "10:00");

        Grupo grupo = new Grupo(id, nombre, asignatura, docente, horario);
        JOptionPane.showMessageDialog(null,
            "Grupo creado:\nID: " + grupo.getId() +
            "\nNombre: " + grupo.getNombre() +
            "\nAsignatura: " + grupo.getAsignatura().getNombre() +
            "\nDocente: " + grupo.getDocente().getNombre() +
            "\nHorario: " + grupo.getHorario().getDia() + " " +
            grupo.getHorario().getHoraInicio() + "-" + grupo.getHorario().getHoraFin());
    }
}