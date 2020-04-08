package co.edu.unbosque.model;

public class Superman extends Kriptoniano implements Flyer {

	public String despegar() {
		return "Despega para salvar";

	}

	public String aterrizar() {
		return "\nAterriza";

	}

	public String volar() {
		return "\nVuela";

	}
	
	public String leapBuilding() {
		return "\nSalta sobre edificios";
		
	}
	
	public String stopBullet() {
		return "\nDetiene las  balas";
		
	}

	public String alimentar() {

		return "\nCome super comida";
	}

}
