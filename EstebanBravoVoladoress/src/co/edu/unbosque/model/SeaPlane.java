package co.edu.unbosque.model;

public class SeaPlane extends Airplane {
	public SeaPlane() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "TAKE OFF SEA PLANE";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "LAND SEAPLANE";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "FLY SEAPLANE";
	}

	@Override
	public String capacidadCOmbustible() {

		return "5000 listros de puro diessel";
	}

}
