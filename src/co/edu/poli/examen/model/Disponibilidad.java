package co.edu.poli.examen.model;

import java.util.*;

/**
 * 
 */
public class Disponibilidad {

    /**
     * Default constructor
     */
    public Disponibilidad() {
    }

    /**
     * 
     */
    private boolean lunes;

    /**
     * 
     */
    private boolean martes;

    /**
     * 
     */
    private boolean miercoles;

    /**
     * 
     */
    private boolean jueves;

    /**
     * 
     */
    private boolean viernes;

    /**
     * 
     */
    private boolean sabado;

    /**
     * @param lunes 
     * @param martes 
     * @param miercoles 
     * @param jueves 
     * @param vierenes 
     * @param sabado
     */
    public void lunes(boolean lunes, boolean martes, boolean miercoles, boolean jueves, boolean vierenes, boolean sabado) {
        // TODO implement here
    }

    /**
     * @param dia 
     * @return
     */
    public String proporcionarDisponibilidad(boolean dia) {
        // TODO implement here
        return "";
    }

	public Disponibilidad(boolean lunes, boolean martes, boolean miercoles, boolean jueves, boolean viernes,
			boolean sabado) {
		super();
		this.lunes = lunes;
		this.martes = martes;
		this.miercoles = miercoles;
		this.jueves = jueves;
		this.viernes = viernes;
		this.sabado = sabado;
	}

	public boolean isLunes() {
		return lunes;
	}

	public void setLunes(boolean lunes) {
		this.lunes = lunes;
	}

	public boolean isMartes() {
		return martes;
	}

	public void setMartes(boolean martes) {
		this.martes = martes;
	}

	public boolean isMiercoles() {
		return miercoles;
	}

	public void setMiercoles(boolean miercoles) {
		this.miercoles = miercoles;
	}

	public boolean isJueves() {
		return jueves;
	}

	public void setJueves(boolean jueves) {
		this.jueves = jueves;
	}

	public boolean isViernes() {
		return viernes;
	}

	public void setViernes(boolean viernes) {
		this.viernes = viernes;
	}

	public boolean isSabado() {
		return sabado;
	}

	public void setSabado(boolean sabado) {
		this.sabado = sabado;
	}

	@Override
	public String toString() {
		return "Disponibilidad [lunes=" + lunes + ", martes=" + martes + ", miercoles=" + miercoles + ", jueves="
				+ jueves + ", viernes=" + viernes + ", sabado=" + sabado + ", isLunes()=" + isLunes() + ", isMartes()="
				+ isMartes() + ", isMiercoles()=" + isMiercoles() + ", isJueves()=" + isJueves() + ", isViernes()="
				+ isViernes() + ", isSabado()=" + isSabado() + "]";
	}
	
    
    

}