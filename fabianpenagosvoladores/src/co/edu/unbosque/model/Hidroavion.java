package co.edu.unbosque.model;

public class Hidroavion extends Avion {

	@Override
	public String despegar() {
		
		return "hidroavion despegando";
	}

	@Override
	public String aterrizar() {
		
		return "hidroavion aterrizando";
	}

	@Override
	public String volar() {
		
		return "hidroavion volando";
	}

	
}
