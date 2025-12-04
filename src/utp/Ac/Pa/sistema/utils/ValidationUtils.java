package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;

public final class ValidationUtils {

    private ValidationUtils() {} // Evitar instanciación

    public static String solicitarNoVacio(String mensaje) {
        String valor;
        while (true) {
            valor = JOptionPane.showInputDialog(mensaje);
            if (valor == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                System.exit(0);
            }
            if (!valor.trim().isEmpty()) return valor.trim();
            JOptionPane.showMessageDialog(null, "Valor no válido. Intente de nuevo.");
        }
    }

    public static String solicitarSoloLetras(String mensaje) {
        String valor;
        while (true) {
            valor = JOptionPane.showInputDialog(mensaje);
            if (valor == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                System.exit(0);
            }
            valor = valor.trim();
            if (!valor.isEmpty() && valor.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) return valor;
            JOptionPane.showMessageDialog(null, "Solo se permiten letras y espacios.");
        }
    }

    public static String solicitarCorreo(String mensaje) {
        String valor;
        String regex = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
        while (true) {
            valor = JOptionPane.showInputDialog(mensaje);
            if (valor == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                System.exit(0);
            }
            valor = valor.trim();
            if (!valor.isEmpty() && valor.matches(regex)) return valor;
            JOptionPane.showMessageDialog(null, "Correo inválido. Ejemplo: usuario@dominio.com");
        }
    }

    public static int solicitarEnteroPositivo(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(mensaje);
            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                System.exit(0);
            }
            try {
                int numero = Integer.parseInt(entrada.trim());
                if (numero > 0) return numero;
                JOptionPane.showMessageDialog(null, "Debe ser un número positivo.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número entero.");
            }
        }
    }
}