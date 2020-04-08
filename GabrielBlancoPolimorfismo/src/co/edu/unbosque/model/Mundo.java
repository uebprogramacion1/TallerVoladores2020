package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.GabenFile;
import co.edu.unbosque.model.persistence.GabenProperties;

/**
 * @author Gabriel Blanco Clase "multitoma" donde se define la solución de la
 *         problemática
 */
public class Mundo {
	private GabenFile archivo = new GabenFile();
	private GabenProperties propiedad = new GabenProperties();
	private Bird bird = new Bird();
	private Superman superman = new Superman();
	private SeaPlane seaplane = new SeaPlane();
	private Helicopter helicopter = new Helicopter();

	public Bird getBird() {
		return bird;
	}

	public Superman getSuperman() {
		return superman;
	}

	public SeaPlane getSeaplane() {
		return seaplane;
	}

	public Helicopter getHelicopter() {
		return helicopter;
	}

	public GabenFile getArchivo() {
		return archivo;
	}

	public GabenProperties getPropiedad() {
		return propiedad;
	}
}
