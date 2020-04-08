package co.edu.unbosque.model;

public class Superman extends Kriptonian implements Flyer {

	public int leapbullings(){return 0;}
	public int stopBullet(){return 0;}
	
	

	public Boolean fly() {
		return true;
	}

	public Boolean land() {
		return true;
	}

	public String eat() {
		return "Yo como alimentos  ";
	}
	@Override
	public Boolean takeOff() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public String crecer() {
		// TODO Auto-generated method stub
		return "cresco si como mucho";
	}
}
