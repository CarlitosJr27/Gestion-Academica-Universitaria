package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import utp.Ac.Pa.sistema.domain.*;
import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class EstudianteVentana {
    public static void main(String[] args) {
        String id = solicitarNoVacio("ID del estudiante:");
        String nombre = solicitarSoloLetras("Nombre del estudiante (solo letras):");
        String correo = solicitarCorreo("Correo del estudiante:");

        Usuario cuenta = new Usuario("usuarioEst", "clave123", null);
        Estudiante estudiante = new Estudiante(id, nombre, correo, cuenta);

        // Carrera asociada
        String carreraNombre = solicitarSoloLetras("Nombre de la carrera del estudiante:");
        List<Asignatura> asignaturas = new ArrayList<>();
        List<Requisito> requisitos = new ArrayList<>();
        asignaturas.add(new Asignatura("INF101", "Programación", 5));
        requisitos.add(new Requisito("Haber aprobado Matemáticas Básicas"));

        Carrera carrera = new Carrera(carreraNombre, asignaturas, requisitos);

        JOptionPane.showMessageDialog(null,
            "Estudiante creado:\nID: " + estudiante.getId() +
            "\nNombre: " + estudiante.getNombre() +
            "\nCorreo: " + estudiante.getCorreo() +
            "\nCarrera: " + carrera.getNombre());
    }
}