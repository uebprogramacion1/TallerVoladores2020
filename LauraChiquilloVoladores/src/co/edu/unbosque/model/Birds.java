package co.edu.unbosque.model;

public class Birds extends Animal implements Flyer {

	public String takeoff() {
		return "volando";
	}

	public String land() {
		return "tocando la tierra";
	}

	public String fly() {
		return " en el cielo ";
	}

	public String buildNest() {
		return " nidos";
	}
	
	public String layEggs() {
		return"huevos";
	}
	
	public String eat() {
		return "semillas, frutas, insectos";
	}
}
