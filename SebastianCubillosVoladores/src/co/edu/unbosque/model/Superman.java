package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer{

	public String leapBuilding() {
		String leapBuilding = "Salta de edificios";
		return leapBuilding;
	}
	public String stopBullet() {
		String stopBullet = "Detiene balas";
		return stopBullet;
	}
	@Override
	public String takeOff() {
		String takeoff = "Despega para volar";
		return takeoff;
	}

	@Override
	public String land() {
		String land = "Camina largas distancias";
		return land;
	}

	@Override
	public String fly() {
		String fly = "Vuela hasta otros planetas";
		return fly;
	}

}
