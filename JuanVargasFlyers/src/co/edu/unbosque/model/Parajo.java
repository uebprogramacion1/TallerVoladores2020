package co.edu.unbosque.model;

public class Parajo extends Animal implements Flyer  {

	public String despegar() {
		return "Despega";
	}

	public String aterrizar() {
		return "\nAterriza";
	}

	public String volar() {
		return "\nVuela";
	}
	
	public String construir() {
		return "\nConstruye nidos";
	}
	
	public String poner() {
		return "\nColoca huevos";
	}

	public String alimentar() {
		return "\nCome semillas";
	}
	
}
