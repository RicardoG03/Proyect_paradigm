package co.edu.poli.examen.model;

import java.util.*;

/**
 * 
 */
public class Estudiante {

    /**
     * Default constructor
     */
    public Estudiante() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private String identificacion;

    /**
     * @param nombre 
     * @param apellido 
     * @param identificacion
     */
    public void Estudiante(String nombre, String apellido, String identificacion) {
        // TODO implement here
    }

    /**
     * @param estudiante 
     * @return
     */
    public String gestionarEstudiante(String estudiante) {
        // TODO implement here
        return "";
    }

	public Estudiante(String nombre, String apellido, String identificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", identificacion=" + identificacion
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getIdentificacion()="
				+ getIdentificacion() + "]";
	}
    
    

}