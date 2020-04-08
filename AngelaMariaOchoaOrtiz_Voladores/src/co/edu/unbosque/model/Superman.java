package co.edu.unbosque.model;

public class Superman extends Kriptonian implements Flyer {

	@Override
	public String takeOFF() {
		
		return " super man despega con fuerza";
	}

	@Override
	public String land() {
		
		return " super man aterriza de pie ";
	}

	@Override
	public String fly() {
	
		return " super man vuela de lado ";
	}

	@Override
	public String planeta() {
		
		return " super man es de Kriptonian ";
	}

	@Override
	public String eat() {
		
		return " super man se alimenta de la luz del sol ";
	}
	public String leapBuilding(){
		return " superman salta edificios!";
	}
	public String stopBullet(){
		return " superman puede detener las balas";
	}

}
