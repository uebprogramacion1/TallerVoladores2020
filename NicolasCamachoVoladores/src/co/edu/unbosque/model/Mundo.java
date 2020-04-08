package co.edu.unbosque.model;



public class Mundo {
	private Airplane air;
	private Bird bir;
	private Superman sup;
	private Kryptonian kry;
	private Seaplane sea;
	private Helicopter hel;
	
	private Eagle eag;
	public Mundo() {
		eag = new Eagle();
		
		air = new Airplane();
		bir = new Bird();
		sup = new Superman();
		kry = new Kryptonian();
		sea = new Seaplane();
		hel = new Helicopter();
		// TODO Auto-generated constructor stub
	}
	
	public Eagle getEag() {
		return eag;
	}

	public void setEag(Eagle eag) {
		this.eag = eag;
	}


	
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
	public Superman getSup() {
		return sup;
	}
	public void setSup(Superman sup) {
		this.sup = sup;
	}
	public Kryptonian getKry() {
		return kry;
	}
	public void setKry(Kryptonian kry) {
		this.kry = kry;
	}
	public Seaplane getSea() {
		return sea;
	}
	public void setSea(Seaplane sea) {
		this.sea = sea;
	}
	public Helicopter getHel() {
		return hel;
	}
	public void setHel(Helicopter hel) {
		this.hel = hel;
	}
}
