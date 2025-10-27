package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class Sistema {
    private List<Usuario> usuarios;
    private List<Estudiante> estudiantes;
    private List<Docente> docentes;

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void asignarRol(Usuario usuario, Rol rol) {
        usuario.setRol(rol);
    }

    public boolean validarAcceso(Usuario usuario, String permiso) {
        return usuario.getRol().validarAcceso(permiso);
    }

    // Getters y Setters
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }
}
