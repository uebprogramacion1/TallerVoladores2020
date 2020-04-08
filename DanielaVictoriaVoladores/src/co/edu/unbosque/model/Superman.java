package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public String takeoff() {
		return "Despega para salvar";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String land() {
		return "\nAterriza con poder";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String fly() {
		return "\nVuela con su capa";
		// TODO Auto-generated method stub
		
	}
	
	public String leapBuilding() {
		return "\nSalta edificios";
		
	}
	
	public String stopBullet() {
		return "\nDetiene balas";
		
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "\nNo se que come";
	}

}
