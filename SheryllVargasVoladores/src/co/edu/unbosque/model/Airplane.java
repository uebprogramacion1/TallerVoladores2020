package co.edu.unbosque.model;

public class Airplane extends Vehicule implements Flyer{

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Esta despegando...";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Esta aterrizando...";
		
		
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Esta en el aire...";
	}

}
