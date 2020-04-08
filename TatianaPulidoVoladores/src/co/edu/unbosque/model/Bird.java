package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {
	public Bird() {
		super.raza = "Psittaciformes, Passeriformes, Columbiformes, entre otras.";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fly() {
		return "Al planear las aves obtienen a partir de sus alas tanto una fuerza vertical como una fuerza de empuje adelante.";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Se alimentan de semillas, gusanos, plantas, la savia, bayas y frutos secos";
	}

	@Override
	public String toString() {
		return raza;
	}

}
