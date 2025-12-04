package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Asignatura;

public class AsignaturaVentana {
    public static void main(String[] args) {
        String codigo = solicitarNoVacio("Código de la asignatura:");
        String nombre = solicitarSoloLetras("Nombre de la asignatura:");
        int creditos = solicitarEnteroPositivo("Créditos:");

        Asignatura asignatura = new Asignatura(codigo, nombre, creditos);

        JOptionPane.showMessageDialog(null,
            "Asignatura creada:\nCódigo: " + asignatura.getCodigo() +
            "\nNombre: " + asignatura.getNombre() +
            "\nCréditos: " + asignatura.getCreditos());
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

    private static int solicitarEnteroPositivo(String mensaje) {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog(mensaje);
                if (entrada == null) System.exit(0);
                int numero = Integer.parseInt(entrada.trim());
                if (numero > 0) return numero;
                JOptionPane.showMessageDialog(null, "Debe ser un número positivo.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número entero.");
            }
        }
    }
}