package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;

public class MenuPrincipalVentana {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String menu = "Menú Principal\n\n"
                    + "1. Registrar Estudiante\n"
                    + "2. Registrar Docente\n"
                    + "3. Registrar Asignatura\n"
                    + "4. Consultar Grupo\n"
                    + "5. Consultar Carrera\n"
                    + "6. Reporte\n"
                    + "7. Salir\n\n"
                    + "Ingrese una opción:";

            String opcion = JOptionPane.showInputDialog(menu);

            if (opcion == null) {
                continuar = false;
                break;
            }

            switch (opcion) {
                case "1":
                    EstudianteVentana.main(args);
                    break;
                case "2":
                    DocenteVentana.main(args);
                    break;
                case "3":
                    AsignaturaVentana.main(args);
                    break;
                case "4":
                    GrupoVentana.main(args);
                    break;
                case "5":
                    CarreraVentana.main(args);
                    break;
                case "6":
                    ReporteVentana.main(args);
                    return;
                case "7":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "⚠️ Opción inválida.");
            }
        }
    }
}