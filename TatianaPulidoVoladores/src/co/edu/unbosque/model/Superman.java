package co.edu.unbosque.model;

public class Superman extends Kryptonian implements Flyer {
	public Superman() {

		super.raza = "Extraterrestres humanoides.";

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String defender() {
		// TODO Auto-generated method stub
		return "Posee una fuerza sobrehumana, corre a velocidades increíbles y salta distancias de 400 metros en un salto, lo que le permite defenderse.";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Se alimenta de la energía solar";
	}

	@Override
	public String toString() {
		return "" + raza;
	}

}
