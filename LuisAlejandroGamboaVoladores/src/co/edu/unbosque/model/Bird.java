package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {
	
	public String buildNest() {
		String buildnest = "Puede construir nidos";
		return buildnest;
	}
	
	public String layEggs() {
		String layEggs = "puede poner huevos";
		return layEggs;
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		String eat = "Se aliemnta de gusanos";
		return eat;
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		String takeoff = "puede despegar";
		return takeoff;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		String land = "puede aterrizar";
		return land;
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		String fly = "puede volar";
		return fly;
	}

	

}
