package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Estudiante;
import utp.Ac.Pa.sistema.domain.Usuario;

public class EstudianteVentana {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String correo = JOptionPane.showInputDialog("Ingrese el correo del estudiante:");

        Usuario cuenta = new Usuario("usuarioEstudiante", "clave123", null);
        Estudiante estudiante = new Estudiante(id, nombre, correo, cuenta);

        JOptionPane.showMessageDialog(null,
            "Estudiante creado:\nID: " + estudiante.getId() +
            "\nNombre: " + estudiante.getNombre() +
            "\nCorreo: " + estudiante.getCorreo());
    }
}