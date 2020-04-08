package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {
	public Superman() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Superman Comen";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Superman Aterriza ";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Superman Despega";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Superman vuela";
	}

	public String leapBuilding() {
		return "Superman salta costrucciones";
	}

	public String stopBullet() {
		return "Superman para Balas";
	}

}
