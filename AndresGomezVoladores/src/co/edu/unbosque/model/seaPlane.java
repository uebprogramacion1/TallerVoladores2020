package co.edu.unbosque.model;

public class seaPlane extends AirPlane {

	public seaPlane() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return " el hidro avion despega";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "el hidro avion aterriza";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return " el hidro avion vuela";
	}

}
