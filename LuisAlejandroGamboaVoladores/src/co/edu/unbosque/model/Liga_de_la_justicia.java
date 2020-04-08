package co.edu.unbosque.model;

public class Liga_de_la_justicia {

	private Superman superman;
	private Bird bird;
	private Helicopter helicopter;
	private SeaPlane seaplane;
	
	public Liga_de_la_justicia() {
		superman = new Superman();
		bird = new Bird();
		helicopter = new Helicopter();
		seaplane= new SeaPlane();
		
	}

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public Helicopter getHelicopter() {
		return helicopter;
	}

	public void setHelicopter(Helicopter helicopter) {
		this.helicopter = helicopter;
	}

	public SeaPlane getSeaplane() {
		return seaplane;
	}

	public void setSeaplane(SeaPlane seaplane) {
		this.seaplane = seaplane;
	}
}
