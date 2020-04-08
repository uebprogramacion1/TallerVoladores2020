package co.edu.unbosque.model;

//HidroAvion
public class SeaPlane extends Airplane {

	// Tipo de vehículo
	public String vehicleType() {
		return "Un hidro avion o avion anfibio.";
	}

	// Despegar
	public String takeOff() {
		return "Puedo aterrizar y despegar en el agua y en la tierra.";
	}

	// Terreno
	public String land() {
		return "Mi terreno es supercifies de agua y aerodromos.\n\nMe utilizan para reconocimento, rescate y \nlucha antisubmarina.";
	}

	// Volar
	public String fly() {
		return "Puedo durar de 14 a 16 horas en el aire un poco mas de un dia.";
	}

}