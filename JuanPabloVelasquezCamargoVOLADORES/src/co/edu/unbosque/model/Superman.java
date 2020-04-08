package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {

	// Tipo de clase
	public String classType() {
		return "Superman.";
	}

	// Despegar
	public String takeOff() {
		return "Puedo volar en todas las circustancias, cuando se me antoja.";
	}

	// Terreno
	public String land() {
		return "Mi terreno es ¡Toda la galaxia!.";
	}

	// Volar
	public String fly() {
		return "No hay mas satisfacion que \nvolar y ayudar a los demas.";
	}

	// Salto de un edificio
	public String leapBuilding() {
		return "Puedo levitar no me hace daño ninguna caida.";
	}

	// Parar Bala
	public String stopBullet() {
		return "Ninguna bala \nme puede destruir.";
	}

	// Comida
	public String eat() {
		return "Mi mejor alimento es el sol. ¡Asi es, me alimento a travez del \nsol!.";
	}

}