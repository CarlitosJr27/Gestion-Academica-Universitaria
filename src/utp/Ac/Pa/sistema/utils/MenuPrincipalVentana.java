package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;

public class MenuPrincipalVentana {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String menu = "Menú Principal\n\n"
                   + "1. Registrar Usuario\n"
                   + "2. Registrar Asignatura\n"
                   + "3. Consultar Grupo\n"
                   + "4. Consultar Carrera\n"
                   + "5. Reporte\n"
                   + "6. Salir\n\n"
                   + "Ingrese una opción:";
            String opcion = JOptionPane.showInputDialog(menu);

            if (opcion == null) {
                continuar = false;
                break;
            }

            switch (opcion) {
                case "1":
                    UsuarioVentana.main(args);
                    break;
                case "2":
                    AsignaturaVentana.main(args);
                    break;
                case "3":
                    GrupoVentana.main(args);
                    break;
                case "4":
                    CarreraVentana.main(args);
                    break;
                case "5":
                    ReporteVentana.main(args);
                    return;
                case "6":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}