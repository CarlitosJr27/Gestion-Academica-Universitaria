package utp.Ac.Pa.sistema;

import utp.Ac.Pa.sistema.utils.MenuPrincipalVentana;

public class App {
    public static void main(String[] args) {
        // Ventana de bienvenida
        javax.swing.JOptionPane.showMessageDialog(
            null,
            "Bienvenido al Sistema Académico\n\n" +
            "Podrá registrar estudiantes, docentes, asignaturas, grupos,\n" +
            "así como carreras y reportes."
        );

        // Llamamos al menú principal con todas las secciones y validaciones
        MenuPrincipalVentana.main(args);
    }
}