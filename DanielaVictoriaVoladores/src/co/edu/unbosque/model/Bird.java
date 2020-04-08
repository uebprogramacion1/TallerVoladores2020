package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer  {

	@Override
	public String takeoff() {
		return "Despega para buscar refugio";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String land() {
		return "\nAterriza donde se siente comodo";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fly() {
		return "\nVuela moviendo sus alas";
		// TODO Auto-generated method stub
		
	}
	
	public String buildNest() {
		return "\nConstruye nidos";
		
	}
	
	public String layEggs() {
		return "\nPone huevos";
		
	}

	@Override
	public String eat() {
		return "\nCome semillas";
		// TODO Auto-generated method stub
		
	}
	

}
