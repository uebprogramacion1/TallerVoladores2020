package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {
	
	public String leapBuilding() {
		String leapBuilding = "Puede saltar edificios";
		return leapBuilding;
		
	}
	public String stopBullet() {
		String stopBullet = "puede detener balas";
		return stopBullet;
	}
	
	
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		String eat = "se aliemnta de luz solar";
		return eat;
	}



	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		String takeoff = "puede despegar";
		return takeoff;
	}



	@Override
	public String land() {
		// TODO Auto-generated method stub
		String land = "puede aterrizar";
		return land;
	}



	@Override
	public String fly() {
		// TODO Auto-generated method stub
		String fly = "puede volar";
		return fly;
	}
	@Override
	public String debilidad() {
		// TODO Auto-generated method stub
		String debilidad = "su debilidad es la kryptonita";
		return debilidad;
	}
	

}
