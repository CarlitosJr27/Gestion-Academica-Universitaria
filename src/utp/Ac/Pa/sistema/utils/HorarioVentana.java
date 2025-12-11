package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Horario;

public class HorarioVentana {
    public static void main(String[] args) {
        String dia = solicitarSoloLetras("Día (solo letras):");
        String horaInicio = solicitarNoVacio("Hora de inicio (ejemplo: 08:00):");
        String horaFin = solicitarNoVacio("Hora de fin (ejemplo: 10:00):");

        Horario horario = new Horario(dia, horaInicio, horaFin);

        JOptionPane.showMessageDialog(null,
            "Horario creado:\n" + horario.getDia() +
            " de " + horario.getHoraInicio() + " a " + horario.getHoraFin());
    }

    private static String solicitarNoVacio(String mensaje) {
        String valor;
        while (true) {
            valor = JOptionPane.showInputDialog(mensaje);
            if (valor == null) System.exit(0);
            if (!valor.trim().isEmpty()) return valor.trim();
            JOptionPane.showMessageDialog(null, "Valor no válido. Intente de nuevo.");
        }
    }

    private static String solicitarSoloLetras(String mensaje) {
        String valor;
        while (true) {
            valor = JOptionPane.showInputDialog(mensaje);
            if (valor == null) System.exit(0);
            valor = valor.trim();
            if (!valor.isEmpty() && valor.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) return valor;
            JOptionPane.showMessageDialog(null, "Solo se permiten letras y espacios.");
        }
    }
}