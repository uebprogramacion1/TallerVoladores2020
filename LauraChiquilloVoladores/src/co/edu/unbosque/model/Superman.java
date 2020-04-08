package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{

	public String takeoff() {
		return "despega";
	}

	public String land() {
		return " aterriza";
	}

	public String fly() {
		return "esta en el aire";
	}

	public String leapBuilding() {
		return"salta desde un edificio";
	}
	
	public String stopBullet() {
		return"detener una bala";
	}
	
	public String eat() {
		return "come igual que los humanos";
	}

}
