package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{

	
	
	public String buildNest() {
		
		return "Puede crear nidos";
	}
	
	
	public String layEggs() {
		
		return "Puede poner huevos";
	}
	

	
	
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Se alimenta de gusanos";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Puede despegar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Puede aterrizar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Puede volar";
	}

}
