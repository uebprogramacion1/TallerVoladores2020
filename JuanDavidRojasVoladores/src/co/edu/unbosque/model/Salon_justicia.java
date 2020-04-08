package co.edu.unbosque.model;

public class Salon_justicia {
	
	
	private Bird b;
	private Superman sm;
	private Helicopter h;
	private Seaplane sp;
	private Flyer f;         // dudaaaa
	
	public Salon_justicia() {
		
		b = new Bird();
		sm = new Superman();
		h = new Helicopter();
		sp = new Seaplane();
		
		
		
	}

	public Bird getB() {
		return b;
	}

	public void setB(Bird b) {
		this.b = b;
	}

	public Superman getSm() {
		return sm;
	}

	public void setSm(Superman sm) {
		this.sm = sm;
	}

	public Helicopter getH() {
		return h;
	}

	public void setH(Helicopter h) {
		this.h = h;
	}

	public Seaplane getSp() {
		return sp;
	}

	public void setSp(Seaplane sp) {
		this.sp = sp;
	}

	public Flyer getF() {
		return f;
	}

	public void setF(Flyer f) {
		this.f = f;
	}
	
	

}
