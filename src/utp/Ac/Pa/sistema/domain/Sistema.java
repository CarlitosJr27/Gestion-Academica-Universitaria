package utp.Ac.Pa.sistema.domain;

import java.util.List;

public class Sistema {
    private List<Usuario> usuarios;

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void asignarRol(Usuario usuario, Rol rol) {
        usuario.setRol(rol);
    }

    public boolean validarAcceso(Usuario usuario, String permiso, String password) {
        return usuario.autenticar(password) && usuario.getRol().validarAcceso(permiso);
    }

    // Getters y Setters
    public List<Usuario> getUsuarios() { return usuarios; }
    public void setUsuarios(List<Usuario> usuarios) { this.usuarios = usuarios; }
}
