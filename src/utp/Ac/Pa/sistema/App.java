package utp.Ac.Pa.sistema;

import utp.Ac.Pa.sistema.utils.MenuPrincipalVentana;

public class App {
    public static void main(String[] args) {
        // Punto de entrada de la aplicación
        System.out.println("=== Sistema Académico ===");
        System.out.println("Iniciando aplicación...");

        // Llamamos al menú principal con ventanas gráficas
        MenuPrincipalVentana.main(args);
    }
}