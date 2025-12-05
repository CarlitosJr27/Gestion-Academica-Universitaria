package utp.Ac.Pa.sistema;

import utp.Ac.Pa.sistema.utils.MenuPrincipalVentana;

public class App {
    public static void main(String[] args) {
        // Mensaje inicial en consola
        System.out.println("=== Sistema Académico ===");
        System.out.println("Iniciando aplicación...");

        // Llamamos al menú principal con todas las secciones y validaciones
        MenuPrincipalVentana.main(args);
    }
}