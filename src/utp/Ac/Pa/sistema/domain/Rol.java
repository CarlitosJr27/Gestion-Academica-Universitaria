package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class Rol {
    private String nombre;
    private List<String> permisos;

    public Rol(String nombre, List<String> permisos) {
        this.nombre = nombre;
        this.permisos = permisos;
    }

    public void asignarPermiso(String permiso) {
        this.permisos.add(permiso);
    }

    public boolean validarAcceso(String permiso) {
        return permisos.contains(permiso);
    }
}
