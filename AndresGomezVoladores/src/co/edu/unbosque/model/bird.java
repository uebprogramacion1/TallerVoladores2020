package co.edu.unbosque.model;

public class bird extends animal implements flyer {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "el ave descansa en el suelo";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return " el ave vuela muy alto";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "el ave come gusanos";
	}
	
	public String layEgss() {
		return " el ave pone huevos de diferentes tamaños";
		
	}
	public String bulidNest() {
		return " el ave contrulle nidos de ramas";
		
	}
	
	

}
