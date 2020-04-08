package co.edu.unbosque.model;

public class Aeroplano extends Vehiculo implements Flyer{

	public String despegar() {
		return "Despega ";
	
	}

	public String aterrizar() {
		return "\nAterriza " ;
		
	}

	public String volar() {
		return "\nVuela";
		
	}

}
