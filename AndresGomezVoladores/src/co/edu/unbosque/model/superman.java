package co.edu.unbosque.model;

public class superman extends kryptonian  implements flyer{

	public superman() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "come kriptonita";
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "el vuela";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return " sabe aterrizar ";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return " vuela";
	}
	
	public String leapBuilding() {
		return " el salta edificios";
	
	}
	
	public String stopBullet() {
		return " no le hace daño las balas ";
	}
	
	
	

}
