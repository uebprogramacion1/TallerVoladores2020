package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {

	
	
	
	public String leapBuilding() {
		
		return "Puede saltar de edificios";
	}
	
	
	public String stopBullet() {
		
		
		return "Puede detener balas";
	}
	
	
	
	@Override
	public String eat() {
		
		return "Se alimenta de la luz del sol";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Puede despegar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Puede aterrizar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Puede volar";
	}


	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habita en el planeta tierra";
	}
	
	

}
