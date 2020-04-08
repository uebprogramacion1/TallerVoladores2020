package co.edu.unbosque.model;

public class Mundo {
	private Airplane air;
	private Bird bir;
	private Superman sup;
	private Kryptonian kry;
	private SeaPlane sea;
	private Helicopter hel;

	public Mundo() {

		air = new Airplane();
		bir = new Bird();
		sup = new Superman();
		kry = new Kryptonian();
		sea = new SeaPlane();
		hel = new Helicopter();
		// TODO Auto-generated constructor stub
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

	public SeaPlane getSea() {
		return sea;
	}

	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}

	public Helicopter getHel() {
		return hel;
	}

	public void setHel(Helicopter hel) {
		this.hel = hel;
	}

}
