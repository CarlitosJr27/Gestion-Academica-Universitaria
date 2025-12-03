package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Usuario;
import utp.Ac.Pa.sistema.domain.Rol;

public class UsuarioVentana {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Nombre de usuario:");
        String password = JOptionPane.showInputDialog("Contraseña:");
        String rolNombre = JOptionPane.showInputDialog("Rol:");

        Rol rol = new Rol(rolNombre);
        Usuario usuario = new Usuario(username, password, rol);

        JOptionPane.showMessageDialog(null,
            "Usuario creado:\nUsername: " + usuario.getUsername() +
            "\nRol: " + usuario.getRol().getNombre());
    }
}