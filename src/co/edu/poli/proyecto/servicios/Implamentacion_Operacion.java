package co.edu.poli.proyecto.servicios;

import java.util.*;


import co.edu.poli.examen.model.Reserva;

/**
 * 
 */
public class Implamentacion_Operacion implements Operacion {

	
	private Reserva [] arr = new Reserva[3];
    /**
     * Default constructor
     */
    public Implamentacion_Operacion() {
    	Reserva [] arr = new Reserva [3];
    }

    /**
     * 
     */
    public Reserva [ ] arreglo;

    /**
     * @param af 
     * @return
     */
    public String create(Reserva af) {
    	for(int i= 0; i<arr.length; i++) {
			if (arr[i]==null) {
				arr[i] = read(null);
				return "El objeto se agrego correctamente";
			}
		}
		if (arr.length>3) {
			Reserva [ ] arr2 = new Reserva [arr.length*2];
			for (int j = 0; j<arr.length;j++) {
				arr2 [j] = arr [j];
			}
			arr = arr2;				
			for(int c= 0; c<arr.length; c++) {
				if (arr[c]==null) {
					arr[c] = read(null);
					return "El objeto se agrego correctamente";
				}
			}
		}
		return "El objeto se ha agregado";
    }

    /**
     * @param id 
     * @return
     */
    public Reserva read(String id) {
    	for (int i = 0; i<arr.length; i++) {
			if (arr[i].getId()==id);
			return arr[i];
		}
		return null;
    }

    /**
     * @param af 
     * @param id 
     * @return
     */
    public String update(Reserva af, String id) {
    	for (int i = 0; i<arr.length; i++) {
			if (arr[i].getId()==id) {
			arr[i] = read(null);
			return "El objeto ha sido actualizado.";
			}
		}
		return "El objeto no existe";
    }

    /**
     * @param id 
     * @return
     */
    public Reserva delete(String id) {
    	for (int i = 0; i<arr.length; i++) {
			Reserva n = arr[i];
			if (arr[i].getId()==id) {
			arr[i] = null;
			return n;
			}
		}
		return null; 
    }

}