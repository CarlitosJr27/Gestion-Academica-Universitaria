
package utp.Ac.Pa.sistema.domain;

public class Usuario {
    private String username;
    private String password;
    private Rol rol;

    public Usuario(String username, String password, Rol rol) {
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public boolean autenticar(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void cambiarPassword(String nuevaPassword) {
        this.password = nuevaPassword;
    }
}
