package co.edu.unbosque.model;

public class Pajaro extends Kriptoniano implements Voladores {

	@Override
	public String comer() {
		
		return "Pajaro comiendo";
	}

	@Override
	public String despegar() {
		return "Pajaro despengando";
	}

	@Override
	public String aterrizar() {
		return "Pajaro aterrizando";
	}

	@Override
	public String volar() {
		return "Pajaro volando";
	}
	
	public String construirNido() {
		
		return "Pajaro construyendo nido";
	}
	public String ponerHuevos() {
		
		return "Pajaro poniendo huevos";
	}
}