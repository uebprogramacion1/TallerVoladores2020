package co.edu.unbosque.model;


public class Airplane extends Vehicle implements Flyer{
	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String takeOff() {
		
		return "TAKE OFF AIRPLANE";
	}

	@Override
	public String land() {
		
		return "LAND AIRPLANE";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "FLY AIRPALNE";
	}
}