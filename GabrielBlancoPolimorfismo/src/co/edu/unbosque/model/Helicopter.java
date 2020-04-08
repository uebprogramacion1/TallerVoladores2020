package co.edu.unbosque.model;

public class Helicopter extends Airplane {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Helicopter will take off from Hangar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Helicopter will land in Hangar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Helicopter is flying in New York City as UberChopper";
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Helicopter will turn on it's rotors\ntac... tac... tacka tacka tacka TAKATAKATAKATAKATAKAKTAKATAKA";
	}

	@Override
	public String stopEngine() {
		// TODO Auto-generated method stub
		return "TAKATAKATAKATAKATAKATAKTATAKA tacka tacka tac tac tac tac tac... tac... tac.\nHelicopter has stopped it's rotors";
	}

}
