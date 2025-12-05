package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import utp.Ac.Pa.sistema.domain.*;

import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class CarreraVentana {
    public static void main(String[] args) {
        String nombre = solicitarSoloLetras("Nombre de la carrera:");
        List<Asignatura> asignaturas = new ArrayList<>();
        List<Requisito> requisitos = new ArrayList<>();

        asignaturas.add(new Asignatura("INF101", "Programación", 5));
        requisitos.add(new Requisito("Haber aprobado Matemáticas Básicas"));

        Carrera carrera = new Carrera(nombre, asignaturas, requisitos);

        JOptionPane.showMessageDialog(null,
            "✅ Carrera creada:\nNombre: " + carrera.getNombre() +
            "\nAsignaturas: " + carrera.getAsignaturas().size() +
            "\nRequisitos: " + carrera.getRequisitos().size());
    }
}