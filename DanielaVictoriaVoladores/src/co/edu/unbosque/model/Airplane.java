package co.edu.unbosque.model;

public class Airplane extends Vehicle implements Flyer{

	@Override
	public String takeoff() {
		return "Despega rodando por una larga pista ";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String land() {
		return "\nAterriza en lugares permitidos" ;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fly() {
		return "\nVuela transportando personas u objetos";
		// TODO Auto-generated method stub
		
	}

}
