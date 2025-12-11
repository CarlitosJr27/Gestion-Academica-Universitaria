package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import utp.Ac.Pa.sistema.domain.*;

public class CarreraVentana {
    public static void main(String[] args) {
        // Opciones de carreras
        String[] opciones = {"Licenciatura en Ciberseguridad", "Programación", "Redes"};
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una carrera:",
                "Consulta de Carrera",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion == null) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.");
            System.exit(0);
        }

        // Asignaturas según carrera
        List<Asignatura> asignaturas = new ArrayList<>();
        List<Requisito> requisitos = new ArrayList<>();

        switch (seleccion) {
            case "Licenciatura en Ciberseguridad":
                asignaturas.add(new Asignatura("CS101", "Fundamentos de Ciberseguridad", 4));
                asignaturas.add(new Asignatura("CS201", "Criptografía", 3));
                asignaturas.add(new Asignatura("CS301", "Seguridad en Redes", 4));
                requisitos.add(new Requisito("Conocimientos básicos de informática"));
                break;

            case "Programación":
                asignaturas.add(new Asignatura("PR101", "Introducción a la Programación", 4));
                asignaturas.add(new Asignatura("PR201", "Programación Orientada a Objetos", 4));
                asignaturas.add(new Asignatura("PR301", "Estructuras de Datos", 3));
                requisitos.add(new Requisito("Matemáticas básicas"));
                break;

            case "Redes":
                asignaturas.add(new Asignatura("RD101", "Fundamentos de Redes", 4));
                asignaturas.add(new Asignatura("RD201", "Protocolos de Comunicación", 3));
                asignaturas.add(new Asignatura("RD301", "Administración de Redes", 4));
                requisitos.add(new Requisito("Conocimientos básicos de hardware"));
                break;
        }

        Carrera carrera = new Carrera(seleccion, asignaturas, requisitos);

        // Mostrar resumen
        StringBuilder resumen = new StringBuilder("Consulta de Carrera:\n");
        resumen.append("Nombre: ").append(carrera.getNombre()).append("\n");
        resumen.append("Asignaturas:\n");
        for (Asignatura a : carrera.getAsignaturas()) {
            resumen.append(" - ").append(a.getCodigo()).append(": ").append(a.getNombre())
                   .append(" (").append(a.getCreditos()).append(" créditos)\n");
        }
        resumen.append("Requisitos:\n");
        for (Requisito r : carrera.getRequisitos()) {
            resumen.append(" - ").append(r.getDescripcion()).append("\n");
        }

        JOptionPane.showMessageDialog(null, resumen.toString());
    }
}