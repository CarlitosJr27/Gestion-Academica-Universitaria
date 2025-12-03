package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Horario;

public class HorarioVentana {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Día:");
        String horaInicio = JOptionPane.showInputDialog("Hora de inicio:");
        String horaFin = JOptionPane.showInputDialog("Hora de fin:");

        Horario horario = new Horario(dia, horaInicio, horaFin);

        JOptionPane.showMessageDialog(null,
            "Horario creado:\n" + horario.getDia() +
            " de " + horario.getHoraInicio() + " a " + horario.getHoraFin());
    }
}