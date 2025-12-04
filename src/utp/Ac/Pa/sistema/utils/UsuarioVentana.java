package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Usuario;
import utp.Ac.Pa.sistema.domain.Rol;

public class UsuarioVentana {
    public static void main(String[] args) {
        String username = solicitarNoVacio("Nombre de usuario:");
        String password = solicitarNoVacio("Contraseña:");
        String rolNombre = solicitarSoloLetras("Rol (solo letras):");

        Rol rol = new Rol(rolNombre);
        Usuario usuario = new Usuario(username, password, rol);

        JOptionPane.showMessageDialog(null,
            "Usuario creado:\nUsername: " + usuario.getUsername() +
            "\nRol: " + usuario.getRol().getNombre());
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