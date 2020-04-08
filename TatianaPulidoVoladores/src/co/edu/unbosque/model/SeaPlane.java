package co.edu.unbosque.model;

public class SeaPlane extends Airplane {
	
	public SeaPlane() {
		super.numeroPasajeros = 12;
	}

	@Override
	public String takeOff() {
		return "Despegues en una superficie de agua";
	}

	@Override
	public String land() {
		return "Aterrizajes en una superficie de agua";
	}

	@Override
	public String fly() {
		return "Los Hidro-aviones pueden alcanzar los 15.850 metros";
	}

	@Override
	public String tanquear() {
		return "Utilizan un combustible llamado queroseno y puede atrerizar si este carece.";
	}

	@Override
	public String toString() {
		return ""+numeroPasajeros ;
	}

	

}
