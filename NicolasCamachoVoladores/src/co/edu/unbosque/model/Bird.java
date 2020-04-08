package co.edu.unbosque.model;



public class Bird extends Animal implements Flyer{
	public Bird() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "EAT BIRD";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "TAKE OFF BIRD";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "LAND BIRD";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "FLY BIRD";
	}
	public String  buildNeat() {
		return "BUILD NEAT BIRD";
	}
	public String layEggs() {
		return"LAY EGGS BIRD";
		
	}
}
