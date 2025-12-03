package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Asignatura;

public class AsignaturaVentana {
    public static void main(String[] args) {
        String codigo = JOptionPane.showInputDialog("Ingrese el código de la asignatura:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la asignatura:");
        int creditos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los créditos:"));

        Asignatura asignatura = new Asignatura(codigo, nombre, creditos);

        JOptionPane.showMessageDialog(null,
            "Asignatura creada:\nCódigo: " + asignatura.getCodigo() +
            "\nNombre: " + asignatura.getNombre() +
            "\nCréditos: " + asignatura.getCreditos());
    }
}