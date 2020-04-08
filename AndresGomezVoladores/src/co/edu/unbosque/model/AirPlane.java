package co.edu.unbosque.model;

public class AirPlane extends vehicle implements flyer {

	public AirPlane() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return " el avion despega";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "el avion aterriza";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return " el avion vuela";
	}

}
