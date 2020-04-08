package co.edu.unbosque.model;

public class Helicopter extends Airplane {

	@Override
	public String takeOFF() {
		
		return  "el helicoptero despega";
	}

	@Override
	public String land() {
		
		return " el helicoptero aterrisa ";
	}

	@Override
	public String fly() {
		
		return " el helicoptero vuela ";
	}

	@Override
	public String gasolina() {
		
		return " el helicoptero necesita gasolina para todo lo anterior ";
	}

}
