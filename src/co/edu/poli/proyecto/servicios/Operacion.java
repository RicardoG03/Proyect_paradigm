package co.edu.poli.proyecto.servicios;

import java.util.*;

import co.edu.poli.examen.model.Reserva;

/**
 * 
 */
public interface Operacion {

    /**
     * @param af 
     * @return
     */
    public String create(Reserva af);

    /**
     * @param id 
     * @return
     */
    public Reserva read(String id);

    /**
     * @param af 
     * @param id 
     * @return
     */
    public String update(Reserva af, String id);

    /**
     * @param id 
     * @return
     */
    public Reserva delete(String id);

}