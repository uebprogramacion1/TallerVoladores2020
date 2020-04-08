package co.edu.unbosque.model;

public class Helicopter extends Airplane {
	public Helicopter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "El Helicoptero despega";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El Helicopeto Aterriza";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El Helicoptero vuela";
	}

	@Override
	public String capacidadCOmbustible() {

		return "4000 listros de puro diessel";
	}

}
