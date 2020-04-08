package co.edu.unbosque.model;

public class Mundo {
	
	private Airplane air;
	private Bird bir;
	private Helicopter heli;
	private SeaPlane sea;
	private Superman sup;
	
	
	
	public Mundo() {
		
		air = new Airplane();
		bir = new Bird();
		heli = new Helicopter();
		sea = new SeaPlane();
		sup = new Superman();
		
		
			
			
		
	}
	
	
//Get and Set
	
	public Airplane getAir() {
		return air;
	}
	public void setAir(Airplane air) {
		this.air = air;
	}
	
	public Bird getBir() {
		return bir;
	}
	public void setBir(Bird bir) {
		this.bir = bir;
	}
	public Helicopter getHeli() {
		return heli;
	}
	public void setHeli(Helicopter heli) {
		this.heli = heli;
	}
	
	public SeaPlane getSea() {
		return sea;
	}
	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}
	public Superman getSup() {
		return sup;
	}
	public void setSup(Superman sup) {
		this.sup = sup;
	}
	
	
	

}
