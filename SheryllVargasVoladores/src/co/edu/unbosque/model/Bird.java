package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{
	
	
	

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Ave voladora";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El ave toca tierra";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Ave en el cielo";
		
	}
	
	public String buildNest() {
		return "Ave en el nido ";
		
	}

	public String layEggs() {
		return "El ave pone huevos";
		
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Ave come lombrises";
		
	}

}
