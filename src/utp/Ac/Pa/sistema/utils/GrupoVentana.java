package utp.Ac.Pa.sistema.utils;

import utp.Ac.Pa.sistema.domain.Asignatura;
import utp.Ac.Pa.sistema.domain.Docente;
import utp.Ac.Pa.sistema.domain.Grupo;
import utp.Ac.Pa.sistema.domain.Horario;
import utp.Ac.Pa.sistema.domain.Usuario;

import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

import javax.swing.JOptionPane;

public class GrupoVentana {
    public static void main(String[] args) {
        String id = solicitarNoVacio("ID del grupo:");
        String nombre = solicitarSoloLetras("Nombre del grupo (solo letras):");

        Asignatura asignatura = new Asignatura("INF101", "Programación", 5);
        Docente docente = new Docente("D1", "Profesor Juan", "juan@mail.com", new Usuario("juan", "abcd", null));

        String dia = solicitarSoloLetras("Día del horario (solo letras):");
        String horaInicio = solicitarNoVacio("Hora de inicio (ejemplo: 08:00):");
        String horaFin = solicitarNoVacio("Hora de fin (ejemplo: 10:00):");
        Horario horario = new Horario(dia, horaInicio, horaFin);

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