package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Superman is taking off";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Superman will land now";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Superman is flying";
	}

	@Override
	public String listen2World() {
		// TODO Auto-generated method stub
		return "Superman is listening to you. Just because he can do it";
	}

	@Override
	public String useLaserEyes() {
		// TODO Auto-generated method stub
		return "Superman is using laser eyes during a combat";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Superman is eating a pretzel";
	}
	
	public String leapBuilding() {
		return "Superman will leap the Chrysler Building";
	}
	
	public String stopBullet() {
		return "Superman will stop the bullet with his fingers";
	}

}
