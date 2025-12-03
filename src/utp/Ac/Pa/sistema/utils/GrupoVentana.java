package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;

import utp.Ac.Pa.sistema.domain.Asignatura;
import utp.Ac.Pa.sistema.domain.Docente;
import utp.Ac.Pa.sistema.domain.Grupo;
import utp.Ac.Pa.sistema.domain.Horario;
import utp.Ac.Pa.sistema.domain.Usuario;

public class GrupoVentana {
    private String id;
    private String nombre;
    private Asignatura asignatura;
    private Docente docente;
    private Horario horario;
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("ID del grupo:");
        String nombre = JOptionPane.showInputDialog("Nombre del grupo:");

        Asignatura asignatura = new Asignatura("INF101", "Programación", 5);
        Docente docente = new Docente("D1", "Profesor Juan", "juan@mail.com", new Usuario("juan", "abcd", null));
        Horario horario = new Horario("Lunes", "08:00", "10:00");

        Grupo grupo = new Grupo( id, nombre, asignatura, docente, horario); {

        JOptionPane.showMessageDialog(null,
            "Grupo creado:\nID: " + grupo.getId() +
            "\nNombre: " + grupo.getNombre() +
            "\nAsignatura: " + grupo.getAsignatura().getNombre() +
            "\nDocente: " + grupo.getDocente().getNombre() +
            "\nHorario: " + grupo.getHorario().getDia() + " " +
            grupo.getHorario().getHoraInicio() + "-" + grupo.getHorario().getHoraFin());
    }
    }
}