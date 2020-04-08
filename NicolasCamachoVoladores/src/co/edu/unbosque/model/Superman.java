package co.edu.unbosque.model;




public class Superman extends Kryptonian implements Flyer{
	public Superman() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "EAT SUPERMAN";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "TAKE OFF SUPERMAN ";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "LAND SUPERMAN";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "FLY SUPERMAN";
	}
	public String leapBuilding() {
		return "LEAP BUILDING SUPERMAN";
	}
	public String stopBullet() {
		return "STOP BULLET SUPERMAN";
	}

}
