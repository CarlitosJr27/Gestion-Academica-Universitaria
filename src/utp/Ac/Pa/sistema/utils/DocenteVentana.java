package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Docente;
import utp.Ac.Pa.sistema.domain.Usuario;

public class DocenteVentana {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Ingrese el ID del docente:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del docente:");
        String correo = JOptionPane.showInputDialog("Ingrese el correo del docente:");

        Usuario cuenta = new Usuario("usuarioDocente", "clave123", null);
        Docente docente = new Docente(id, nombre, correo, cuenta);

        JOptionPane.showMessageDialog(null,
            "Docente creado:\nID: " + docente.getId() +
            "\nNombre: " + docente.getNombre() +
            "\nCorreo: " + docente.getCorreo());
    }
}