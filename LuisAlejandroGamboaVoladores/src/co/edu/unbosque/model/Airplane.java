package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer {

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

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		String acelerar = "puede acelerar";
		return acelerar;
	}

}
