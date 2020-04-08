package co.edu.unbosque.model;

public class Mundo {

	private Vehiculo veh;
	private Aeroplano air;
	private Hidroavion sea;
	private Helicoptero hel;
	private Parajo bird;
	private Kriptoniano kry;
	private Superman sman;

	public Vehiculo getVeh() {
		return veh;
	}
	public void setVeh(Vehiculo veh) {
		this.veh = veh;
	}
	public Aeroplano getAir() {
		return air;
	}
	public void setAir(Aeroplano air) {
		this.air = air;
	}
	public Hidroavion getSea() {
		return sea;
	}
	public void setSea(Hidroavion sea) {
		this.sea = sea;
	}
	public Helicoptero getHel() {
		return hel;
	}
	public void setHel(Helicoptero hel) {
		this.hel = hel;
	}
	public Parajo getBird() {
		return bird;
	}
	public void setBird(Parajo bird) {
		this.bird = bird;
	}
	public Kriptoniano getKry() {
		return kry;
	}
	public void setKry(Kriptoniano kry) {
		this.kry = kry;
	}
	public Superman getSman() {
		return sman;
	}
	public void setSman(Superman sman) {
		this.sman = sman;
	}
	

	public Mundo() {
		
		veh = new Vehiculo();
		air = new Aeroplano();
		sea = new Hidroavion();
		hel = new Helicoptero();
		bird = new Parajo();
		kry = new Kriptoniano();
		sman = new Superman(); 
	}

}
