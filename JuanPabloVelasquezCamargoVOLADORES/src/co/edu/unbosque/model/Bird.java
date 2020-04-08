package co.edu.unbosque.model;

//Pajaro
public class Bird extends Animal implements Flyer {

	// Tipo de clase
	public String classType() {
		return "Pajaros. Hay muchas clases.";
	}

	// Despegar
	public String takeOff() {
		return "Volamos con nuestras propias alas y no hay nadie que nos \ndetenga.";
	}

	// Terreno
	public String land() {
		return "La primavera el sol nos encantan.";
	}

	// Volar
	public String fly() {
		return "Volamos para \nsobrevivir y para procrear, y asi encontramos pareja...";
	}

	// Construir Nido
	public String buildNest() {
		return "Construimos nuestros nidos en lo mas alto de los arboles, \nasi casi no corremoss peligro, ni nuestros hijos.";
	}

	// Poner Huevos
	public String layEggs() {
		return "Nos toca \nincubar los huevos para que nuestro embrion se forme sana y \nfuertemente.";
	}

	// Comida
	public String eat() {
		return "Comemos lombrices, gusanos o semillas nos encantan, \nbuena fuente de proteinas.";
	}

}
