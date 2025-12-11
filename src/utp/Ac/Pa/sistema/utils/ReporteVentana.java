package utp.Ac.Pa.sistema.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReporteVentana {
    public static void main(String[] args) {
        // Crear ventana principal
        JFrame ventana = new JFrame("Generar Reporte Universitario");
        ventana.setSize(500, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        // Panel superior: selección de tipo de reporte
        JPanel panelSuperior = new JPanel(new FlowLayout());
        JLabel etiquetaTipo = new JLabel("Seleccione el tipo de reporte:");
        String[] tipos = {
            "Reporte Académico",
            "Reporte de Asistencia",
            "Reporte de Evaluaciones",
            "Reporte de Actividades Extracurriculares",
            "Reporte de Infraestructura",
            "Reporte de Docentes",
            "Reporte de Estudiantes"
        };
        JComboBox<String> comboTipos = new JComboBox<>(tipos);
        panelSuperior.add(etiquetaTipo);
        panelSuperior.add(comboTipos);

        // Panel central: área de texto
        JPanel panelCentral = new JPanel(new BorderLayout());
        JLabel etiquetaTexto = new JLabel("Escriba el contenido del reporte:");
        JTextArea areaTexto = new JTextArea(10, 40);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(areaTexto);
        panelCentral.add(etiquetaTexto, BorderLayout.NORTH);
        panelCentral.add(scroll, BorderLayout.CENTER);

        // Panel inferior: botones
        JPanel panelInferior = new JPanel(new FlowLayout());
        JButton botonEnviar = new JButton("Enviar");
        JButton botonCancelar = new JButton("Cancelar");
        panelInferior.add(botonEnviar);
        panelInferior.add(botonCancelar);

        // Acción al presionar "Enviar"
        botonEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tipo = (String) comboTipos.getSelectedItem();
                String contenido = areaTexto.getText().trim();

                if (contenido.isEmpty()) {
                    JOptionPane.showMessageDialog(ventana, "El contenido del reporte no puede estar vacío.");
                } else {
                    JOptionPane.showMessageDialog(ventana,
                        "Reporte enviado:\nTipo: " + tipo + "\n\nContenido:\n" + contenido);
                    ventana.dispose();
                }
            }
        });

        // Acción al presionar "Cancelar"
        botonCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
        });

        // Agregar paneles a la ventana
        ventana.add(panelSuperior, BorderLayout.NORTH);
        ventana.add(panelCentral, BorderLayout.CENTER);
        ventana.add(panelInferior, BorderLayout.SOUTH);

        // Mostrar ventana
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}