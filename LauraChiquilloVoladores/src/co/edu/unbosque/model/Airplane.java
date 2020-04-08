package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer{

	public String takeoff() {
		return "despega de la tierra";
	}

	public String land() {
		return "aterriza en la tierra";
	}

	public String fly() {
		return " el aire";
	}

}
