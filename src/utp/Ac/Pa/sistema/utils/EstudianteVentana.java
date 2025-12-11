package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import utp.Ac.Pa.sistema.domain.*;
import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class EstudianteVentana {
    public static void main(String[] args) {
        // Datos básicos del estudiante
        String id = solicitarNoVacio("ID del estudiante:");
        String nombre = solicitarSoloLetras("Nombre del estudiante (solo letras):");
        String correo = solicitarCorreo("Correo del estudiante:");

        Usuario cuenta = new Usuario("usuarioEst", "clave123", null);
        Estudiante estudiante = new Estudiante(id, nombre, correo, cuenta);

        // Selección de carrera
        String[] opcionesCarrera = {"Licenciatura en Ciberseguridad", "Programación", "Redes"};
        String seleccionCarrera = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una carrera para el estudiante:",
                "Carrera",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesCarrera,
                opcionesCarrera[0]);

        if (seleccionCarrera == null) {
            JOptionPane.showMessageDialog(null, "❌ Operación cancelada.");
            System.exit(0);
        }

        // Asignaturas y requisitos según carrera
        List<Asignatura> asignaturas = new ArrayList<>();
        List<Requisito> requisitos = new ArrayList<>();

        switch (seleccionCarrera) {
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

        Carrera carrera = new Carrera(seleccionCarrera, asignaturas, requisitos);

        // Selección de horario con rangos
        String[] opcionesHorario = {"Mañana", "Tarde", "Noche"};
        String seleccionHorario = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione un horario para el estudiante:",
                "Horario",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcionesHorario,
                opcionesHorario[0]);

        if (seleccionHorario == null) {
            JOptionPane.showMessageDialog(null, "❌ Operación cancelada.");
            System.exit(0);
        }

        String rangoHorario = "";
        switch (seleccionHorario) {
            case "Mañana":
                rangoHorario = "7:00 a.m - 12:45 p.m";
                break;
            case "Tarde":
                rangoHorario = "12:50 p.m - 5:45 p.m";
                break;
            case "Noche":
                rangoHorario = "5:50 p.m - 10:45 p.m";
                break;
        }

        // Resumen final
        StringBuilder resumen = new StringBuilder("✅ Estudiante registrado:\n");
        resumen.append("ID: ").append(estudiante.getId()).append("\n");
        resumen.append("Nombre: ").append(estudiante.getNombre()).append("\n");
        resumen.append("Correo: ").append(estudiante.getCorreo()).append("\n");
        resumen.append("Carrera: ").append(carrera.getNombre()).append("\n");
        resumen.append("Horario: ").append(seleccionHorario)
               .append(" (").append(rangoHorario).append(")\n");
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