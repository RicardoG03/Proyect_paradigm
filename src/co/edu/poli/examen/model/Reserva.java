package co.edu.poli.examen.model;

import java.util.*;

/**
 * 
 */
public class Reserva {

    /**
     * Default constructor
     */
    public Reserva() {
    }

    /**
     * 
     */
    private Estudiante estudiante;

    /**
     * 
     */
    private Horario horario;

    /**
     * 
     */
    private String id;

    /**
     * @param estudiante 
     * @param horario
     */
    public void Reserva(Estudiante estudiante, Horario horario) {
        // TODO implement here
    }

    /**
     * @param Reserva 
     * @return
     */
    public String gestionarReserva(String Reserva) {
        // TODO implement here
        return "";
    }

	public Reserva(Estudiante estudiante, Horario horario, String id) {
		super();
		this.estudiante = estudiante;
		this.horario = horario;
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Reserva [estudiante=" + estudiante + ", horario=" + horario + ", id=" + id + ", getEstudiante()="
				+ getEstudiante() + ", getHorario()=" + getHorario() + ", getId()=" + getId() + "]";
	}
    
    

}