package co.edu.unbosque.model;

public class Superman extends Kriptoniano implements Voladores {

	@Override
	public String comer() {
		
		return "Superman comiendo";
	}

	@Override
	public String despegar() {
		return "Superman despengando";
	}

	@Override
	public String aterrizar() {
		return "Superman aterrizando";
	}

	@Override
	public String volar() {
		return "Superman volando";
	}
	
	public String saltarEdificio() {
		
		return "Superman saltando edificio";
	}
	public String detenerBala() {
		
		return "Superman deteniendo una bala";
	}
}