package utp.Ac.Pa.sistema.utils;

import javax.swing.JOptionPane;
import utp.Ac.Pa.sistema.domain.Requisito;

import static utp.Ac.Pa.sistema.utils.ValidationUtils.*;

public class RequisitoVentana {
    public static void main(String[] args) {
        String descripcion = solicitarNoVacio("Descripción del requisito:");
        Requisito requisito = new Requisito(descripcion);

        JOptionPane.showMessageDialog(null,
            "Requisito creado:\n" + requisito.getDescripcion());
    }
}