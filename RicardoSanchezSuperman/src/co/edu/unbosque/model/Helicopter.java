package co.edu.unbosque.model;

public class Helicopter extends Airplane implements Flyer {
	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Despejar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Aterrizar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Volar";
	}

}
