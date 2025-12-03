package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class Rol {
    private String nombre;
    private List<String> permisos;

    // Constructor completo
    public Rol(String nombre, List<String> permisos) {
        this.nombre = nombre;
        this.permisos = permisos;
    }

    // Constructor alternativo
    public Rol(String nombre) {
        this.nombre = nombre;
        this.permisos = new java.util.ArrayList<>();
    }


    public void asignarPermiso(String permiso) {
        this.permisos.add(permiso);
    }

    public boolean validarAcceso(String permiso) {
        return permisos.contains(permiso);
    }

    public void mostrarRol() {
        System.out.println("Rol: " + nombre);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<String> permisos) {
        this.permisos = permisos;
    }
}
