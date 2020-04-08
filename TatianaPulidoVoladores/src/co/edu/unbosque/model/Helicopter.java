package co.edu.unbosque.model;

public class Helicopter extends Airplane {
	
	public Helicopter() {
		super.numeroPasajeros = 6;
	}

	@Override
	public String takeOff() {
		return "Despegues vertical sin necesidad de pista.";
	}

	@Override
	public String land() {
		return "Aterrizajes vertical sin necesidad de pista.";
	}

	@Override
	public String fly() {
		return "Hay dos condiciones básicas de vuelo para un helicóptero: el vuelo estacionario, y el vuelo traslacional.";
	}

	@Override
	public String tanquear() {
		return "Utilizan un combustible llamado queroseno.";
	}

	@Override
	public String toString() {
		return ""+numeroPasajeros;
	}

}
