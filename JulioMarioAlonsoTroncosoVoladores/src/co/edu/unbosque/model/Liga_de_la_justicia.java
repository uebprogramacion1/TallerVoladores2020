package co.edu.unbosque.model;


public class Liga_de_la_justicia implements Flyer{

	
	private Bird bird;
	private Kryptonian krip;
    private SeaPlane seaplane;
    private Helicopter heli;
    private Airplane air;
    private Vehicle vehi;
	
	
	
	public Liga_de_la_justicia() {
		
		bird = new Bird();
	    krip = new Kryptonian();
	    seaplane = new SeaPlane();
	    heli = new Helicopter();
	    air = new Airplane();
	    vehi = new Vehicle();
		
	}

	

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}



	public Kryptonian getKrip() {
		return krip;
	}



	public void setKrip(Kryptonian krip) {
		this.krip = krip;
	}



	public SeaPlane getSeaplane() {
		return seaplane;
	}



	public void setSeaplane(SeaPlane seaplane) {
		this.seaplane = seaplane;
	}



	public Helicopter getHeli() {
		return heli;
	}



	public void setHeli(Helicopter heli) {
		this.heli = heli;
	}



	public Airplane getAir() {
		return air;
	}



	public void setAir(Airplane air) {
		this.air = air;
	}



	public Vehicle getVehi() {
		return vehi;
	}



	public void setVehi(Vehicle vehi) {
		this.vehi = vehi;
	}



	@Override
	public String takeoff() {
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

	
}
