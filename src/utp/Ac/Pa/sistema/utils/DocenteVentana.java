package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Docente;
import utp.Ac.Pa.sistema.domain.Usuario;

public class DocenteVentana {
    public static void main(String[] args) {
        String id = solicitarNoVacio("ID del docente:");
        String nombre = solicitarSoloLetras("Nombre del docente:");
        String correo = solicitarCorreo("Correo del docente:");

        Usuario cuenta = new Usuario("usuarioDoc", "clave456", null);
        Docente docente = new Docente(id, nombre, correo, cuenta);

        JOptionPane.showMessageDialog(null,
            "Docente creado:\nID: " + docente.getId() +
            "\nNombre: " + docente.getNombre() +
            "\nCorreo: " + docente.getCorreo());
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

    private static String solicitarCorreo(String mensaje) {
        String valor;
        String regex = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
        while (true) {
            valor = JOptionPane.showInputDialog(mensaje);
            if (valor == null) System.exit(0);
            valor = valor.trim();
            if (!valor.isEmpty() && valor.matches(regex)) return valor;
            JOptionPane.showMessageDialog(null, "Correo inválido. Ejemplo: usuario@dominio.com");
        }
    }
}