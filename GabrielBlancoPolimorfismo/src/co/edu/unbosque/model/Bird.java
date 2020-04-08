package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Bird is taking off";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Bird will land in a tree";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "WATCHOUT! Bird is flying over you";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Bird is eating worms";
	}
	
	public String layEggs() {
		return "Bird is laying eggs";
	}
	
	public String buildNest() {
		return "Bird is building a nest";
	}

}
