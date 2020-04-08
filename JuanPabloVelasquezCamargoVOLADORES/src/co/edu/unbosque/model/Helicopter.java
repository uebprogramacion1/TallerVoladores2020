package co.edu.unbosque.model;

//Helicoptero
public class Helicopter extends Airplane {

	// Tipo de vehículo
	public String vehicleType() {
		return "Helicoptero.";
	}

	// Despegar
	public String takeOff() {
		return "Puedo Despegar y aterizar veticalmente.\nSin necedidad de pista.";
	}

	// Terreno
	public String land() {
		return "Mi terreno es en tierra firme. En cualquier sitio de la tierra :)";
	}

	// Volar
	public String fly() {
		return "Soy mucho mas seguro que un avion y mas versatil.\n\nAunque nunca me veras volar mas de 400 km/h.\nEs mi velocidad maxima.";
	}
}