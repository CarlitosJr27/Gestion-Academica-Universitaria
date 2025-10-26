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
        usuario = new Usuario(usuario.getUsername(), usuario.getPassword(), rol);
    }

    public boolean validarAcceso(Usuario usuario, String permiso) {
        return usuario.getRol().validarAcceso(permiso);
    }
}

