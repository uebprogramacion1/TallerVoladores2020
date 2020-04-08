package co.edu.unbosque.Model;

public abstract class Aircraft extends Vehicle implements Flyer{
	
	public abstract String infoAircraft();
	
	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Despegar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Aterrizar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Puedo Volar";
	}

}
