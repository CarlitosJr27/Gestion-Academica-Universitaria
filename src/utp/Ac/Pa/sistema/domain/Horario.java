package utp.Ac.Pa.sistema.domain;

public class Horario {
    private String dia;
    private String horaInicio;
    private String horaFin;

    public Horario(String dia, String horaInicio, String horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public boolean validarConflicto(Horario otro) {
        return this.dia.equals(otro.dia) &&
               this.horaInicio.equals(otro.horaInicio);
    }
}

