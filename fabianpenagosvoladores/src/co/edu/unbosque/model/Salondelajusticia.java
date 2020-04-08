package co.edu.unbosque.model;

public class Salondelajusticia {

	Helicoptero hel;
	Hidroavion hid;
	Pajaro paj;
	Superman sup;
	
	public Salondelajusticia() {
		hel=new Helicoptero();
		hid=new Hidroavion();
		paj=new Pajaro();
		sup=new Superman();
		
	
	}
	
	public Helicoptero getHel() {
		return hel;
	}

	public void setHel(Helicoptero hel) {
		this.hel = hel;
	}

	public Hidroavion getHid() {
		return hid;
	}

	public void setHid(Hidroavion hid) {
		this.hid = hid;
	}

	public Pajaro getPaj() {
		return paj;
	}

	public void setPaj(Pajaro paj) {
		this.paj = paj;
	}

	public Superman getSup() {
		return sup;
	}

	public void setSup(Superman sup) {
		this.sup = sup;
	}
	
	
}

