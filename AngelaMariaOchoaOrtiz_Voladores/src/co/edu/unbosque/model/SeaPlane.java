package co.edu.unbosque.model;

public class SeaPlane extends Airplane{

	@Override
	public String takeOFF() {
	
		return "el avion despega";
	}

	@Override
	public String land() {
		
		return " el avion aterrisa ";
	}

	@Override
	public String fly() {
		
		return " el avion vuela ";
	}

	@Override
	public String gasolina() {
	
	   return " el avion necesita gasolina para todo lo anterior ";
	}

}
