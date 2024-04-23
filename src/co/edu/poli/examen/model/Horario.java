package co.edu.poli.examen.model;

import java.util.*;

/**
 * 
 */
public class Horario {

    /**
     * Default constructor
     */
    public Horario() {
    }

    /**
     * 
     */
    private String horaInicio;

    /**
     * 
     */
    private String horaFinalización;

    /**
     * 
     */
    private Profesor profesor;

    /**
     * 
     */
    private Disponibilidad Disponibilidad;

    /**
     * @param horaInicio 
     * @param horaFinalizacion 
     * @param diaSemana 
     * @param profesor
     */
    public void Horario(String horaInicio, String horaFinalizacion, String diaSemana, Profesor profesor) {
        // TODO implement here
    }

    /**
     * @param Horario 
     * @return
     */
    public String proporcionarHorario(String Horario) {
        // TODO implement here
        return "";
    }

	public Horario(String horaInicio, String horaFinalización, Profesor profesor,
			co.edu.poli.examen.model.Disponibilidad disponibilidad) {
		super();
		this.horaInicio = horaInicio;
		this.horaFinalización = horaFinalización;
		this.profesor = profesor;
		Disponibilidad = disponibilidad;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFinalización() {
		return horaFinalización;
	}

	public void setHoraFinalización(String horaFinalización) {
		this.horaFinalización = horaFinalización;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Disponibilidad getDisponibilidad() {
		return Disponibilidad;
	}

	public void setDisponibilidad(Disponibilidad disponibilidad) {
		Disponibilidad = disponibilidad;
	}

	@Override
	public String toString() {
		return "Horario [horaInicio=" + horaInicio + ", horaFinalización=" + horaFinalización + ", profesor=" + profesor
				+ ", Disponibilidad=" + Disponibilidad + ", getHoraInicio()=" + getHoraInicio()
				+ ", getHoraFinalización()=" + getHoraFinalización() + ", getProfesor()=" + getProfesor()
				+ ", getDisponibilidad()=" + getDisponibilidad() + "]";
	}
    
    

}