package utp.Ac.Pa.sistema.domain;

public class Asignatura {
    private String codigo;
    private String nombre;
    private int creditos;

    public Asignatura(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void asignarGrupo(String grupoId) {
        // lógica de asignación
    }

    public void obtenerEvaluaciones() {
        // lógica de consulta
    }
}
