package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Despejar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Aterrizar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Volar";
	}
	public String buildNest() {
		return "Construir nido";
	}
	public String layeggs() {
		return "Colocar Huevos";
	}
	public String eat() {
		return "Comer gusanos";
	}

}
