package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Vamos a pistear que hay pa comer";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Voy aterrizar en ese tejado";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Abra las alas y eche vuelo";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Estamos volando melo";
	}

	public String buildNeat() {
		return "Costruyendo un nido pa los hijos";
	}

	public String layEggs() {
		return "Pongo mis huevos";

	}

}
