package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer {
	public Airplane() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String takeOff() {

		return "El avion esta despegando de la ciudad de Bogota";
	}

	@Override
	public String land() {

		return "El avion esta aterrizando en la ciudad de Bogota";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El habion vuela la ciudad de Bogota";
	}

	@Override
	public String capacidadCOmbustible() {

		return "2000 litos le cabe a este bebe";
	}

}
