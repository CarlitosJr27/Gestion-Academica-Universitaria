package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Asignatura;
import utp.Ac.Pa.sistema.domain.Docente;
import utp.Ac.Pa.sistema.domain.Estudiante;
import utp.Ac.Pa.sistema.domain.Grupo;
import utp.Ac.Pa.sistema.domain.Horario;
import utp.Ac.Pa.sistema.domain.Usuario;

import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class MenuPrincipalVentana {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog(
                "Menú Principal\n\n" +
                "1. Registrar Estudiante\n" +
                "2. Registrar Docente\n" +
                "3. Registrar Asignatura\n" +
                "4. Registrar Grupo\n" +
                "5. Salir\n\n" +
                "Ingrese una opción:"
            );

            if (opcion == null || opcion.equals("5")) {
                JOptionPane.showMessageDialog(null, "Programa finalizado.");
                break;
            }

            switch (opcion) {
                case "1": registrarEstudiante(); break;
                case "2": registrarDocente(); break;
                case "3": registrarAsignatura(); break;
                case "4": registrarGrupo(); break;
                default: JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }

    private static void registrarEstudiante() {
        String id = solicitarNoVacio("ID del estudiante:");
        String nombre = solicitarSoloLetras("Nombre del estudiante (solo letras):");
        String correo = solicitarCorreo("Correo del estudiante:");

        Usuario cuenta = new Usuario("usuarioEst", "clave123", null);
        Estudiante estudiante = new Estudiante(id, nombre, correo, cuenta);

        JOptionPane.showMessageDialog(null,
            "✅ Estudiante creado:\nID: " + estudiante.getId() +
            "\nNombre: " + estudiante.getNombre() +
            "\nCorreo: " + estudiante.getCorreo());
    }

    private static void registrarDocente() {
        String id = solicitarNoVacio("ID del docente:");
        String nombre = solicitarSoloLetras("Nombre del docente:");
        String correo = solicitarCorreo("Correo del docente:");

        Usuario cuenta = new Usuario("usuarioDoc", "clave456", null);
        Docente docente = new Docente(id, nombre, correo, cuenta);

        JOptionPane.showMessageDialog(null,
            "✅ Docente creado:\nID: " + docente.getId() +
            "\nNombre: " + docente.getNombre() +
            "\nCorreo: " + docente.getCorreo());
    }

    private static void registrarAsignatura() {
        String codigo = solicitarNoVacio("Código de la asignatura:");
        String nombre = solicitarSoloLetras("Nombre de la asignatura:");
        int creditos = solicitarEnteroPositivo("Créditos:");

        Asignatura asignatura = new Asignatura(codigo, nombre, creditos);

        JOptionPane.showMessageDialog(null,
            "✅ Asignatura creada:\nCódigo: " + asignatura.getCodigo() +
            "\nNombre: " + asignatura.getNombre() +
            "\nCréditos: " + asignatura.getCreditos());
    }

    private static void registrarGrupo() {
        String id = solicitarNoVacio("ID del grupo:");
        String nombre = solicitarSoloLetras("Nombre del grupo:");

        // Para demo: objetos auxiliares con valores válidos.
        Asignatura asignatura = new Asignatura("INF101", "Programación", 5);
        Docente docente = new Docente("D1", "Profesor Juan", "juan@mail.com", new Usuario("juan", "abcd", null));
        String dia = solicitarSoloLetras("Día del horario: Lunes, Martes, Miércoles, Jueves, Viernes:");
        String horaInicio = solicitarNoVacio("Hora de inicio (ejemplo: 08:00):");
        String horaFin = solicitarNoVacio("Hora de fin (ejemplo: 10:00):");
        Horario horario = new Horario(dia, horaInicio, horaFin);

        Grupo grupo = new Grupo(id, nombre, asignatura, docente, horario);

        JOptionPane.showMessageDialog(null,
            "✅ Grupo creado:\nID: " + grupo.getId() +
            "\nNombre: " + grupo.getNombre() +
            "\nAsignatura: " + grupo.getAsignatura().getNombre() +
            "\nDocente: " + grupo.getDocente().getNombre() +
            "\nHorario: " + grupo.getHorario().getDia() + " " +
            grupo.getHorario().getHoraInicio() + "-" + grupo.getHorario().getHoraFin());
    }
}