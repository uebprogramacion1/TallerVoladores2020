package co.edu.unbosque.model;

public class Seaplane extends Airplane {
	
	
	
	

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Puede despegar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Puede aterrizar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Puede volar";
	}

	@Override
	public String movilidad() {
		// TODO Auto-generated method stub
		return "Despega desde agua y no puede retroceder ";
	}

}
