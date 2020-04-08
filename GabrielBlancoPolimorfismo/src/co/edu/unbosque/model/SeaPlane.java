package co.edu.unbosque.model;

public class SeaPlane extends Airplane {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "SeaPlane will take off on H-13 ramp";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "SeaPlane will land on H-31 ramp";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "SeaPlane will fly above you";
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "SeaPlane will turn on. VRRRRRRROOOOOOO";
	}

	@Override
	public String stopEngine() {
		// TODO Auto-generated method stub
		return "OOOOOOOOOOORRRRVPKADPDPS SeaPlane has stopped the engine";
	}

}
