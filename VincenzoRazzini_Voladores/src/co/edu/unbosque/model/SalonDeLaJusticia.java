package co.edu.unbosque.model;

public class SalonDeLaJusticia {
	
	private SeaPlane seaplane;
	private Superman superman;
	private Helicopter helicopter;
	private Bird bird;
	
	public SalonDeLaJusticia() {
		// TODO Auto-generated constructor stub
		seaplane = new SeaPlane();
		superman = new Superman();
		helicopter = new Helicopter();
		bird = new Bird();
	}
	public SeaPlane getSeaplane() {
		return seaplane;
	}
	public void setSeaplane(SeaPlane seaplane) {
		this.seaplane = seaplane;
	}
	public Superman getSuperman() {
		return superman;
	}
	public void setSuperman(Superman superman) {
		this.superman = superman;
	}
	public Helicopter getHelicopter() {
		return helicopter;
	}
	public void setHelicopter(Helicopter helicopter) {
		this.helicopter = helicopter;
	}
	public Bird getBird() {
		return bird;
	}
	public void setBird(Bird bird) {
		this.bird = bird;
	}

}
