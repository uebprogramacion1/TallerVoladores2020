package co.edu.unbosque.model;

public class Helicoptero extends Avion {

	@Override
	public String despegar() {
		
		return "Helicoptero despegando";
	}

	@Override
	public String aterrizar() {
		
		return "Helicoptero aterrizando";
	}

	@Override
	public String volar() {
		
		return "Helicoptero	 volando";
	}

	
}
