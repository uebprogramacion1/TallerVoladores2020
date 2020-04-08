package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Superman esta despegando...";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Superman esta aterrizando...";
		
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Superman esta en el aire...";
	}
	
	public String leapBuilding() {
		return "¡¡¡Superman, salta desde un edificio!!!";
		
	}
	
	public String stopBullet() {
		return "¡¡¡Superman detuvo una bala!!!";
		
	}

	@Override
	public String  eat() {
		// TODO Auto-generated method stub
		return "Superman come normal";
	}

	
}
