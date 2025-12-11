package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import java.util.*;

public class GrupoVentana {
    public static void main(String[] args) {
        // Selección de carrera
        String[] opcionesCarrera = {"Licenciatura en Ciberseguridad", "Programación", "Redes"};
        String seleccionCarrera = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una carrera para registrar grupo:",
                "Carrera",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesCarrera,
                opcionesCarrera[0]);

        if (seleccionCarrera == null) {
            JOptionPane.showMessageDialog(null, "❌ Operación cancelada.");
            System.exit(0);
        }

        // Definir grupos por turno
        Map<String, List<String>> gruposPorTurno = new LinkedHashMap<>();
        gruposPorTurno.put("Mañana (7:00 a.m - 12:45 p.m)", Arrays.asList("Grupo M1", "Grupo M2", "Grupo M3"));
        gruposPorTurno.put("Tarde (12:50 p.m - 5:45 p.m)", Arrays.asList("Grupo T1", "Grupo T2", "Grupo T3"));
        gruposPorTurno.put("Noche (5:50 p.m - 10:45 p.m)", Arrays.asList("Grupo N1", "Grupo N2", "Grupo N3"));

        // Construir mensaje con los grupos
        StringBuilder mensaje = new StringBuilder("✅ Información de grupos para la carrera: " + seleccionCarrera + "\n\n");
        for (Map.Entry<String, List<String>> entry : gruposPorTurno.entrySet()) {
            mensaje.append(entry.getKey()).append(":\n");
            for (String grupo : entry.getValue()) {
                mensaje.append(" - ").append(grupo).append("\n");
            }
            mensaje.append("\n");
        }

        // Mostrar información
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}