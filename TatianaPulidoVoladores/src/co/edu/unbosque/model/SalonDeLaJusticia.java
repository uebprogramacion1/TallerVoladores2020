package co.edu.unbosque.model;

public class SalonDeLaJusticia {
private SeaPlane seaPlane;
private Helicopter helicopter;
private Bird bird; 
private Superman superman;

	public SalonDeLaJusticia() {
		bird =new Bird();
		superman =new Superman();
		helicopter= new Helicopter();
		seaPlane = new SeaPlane();
	}

	public SeaPlane getSeaPlane() {
		return seaPlane;
	}

	public void setSeaPlane(SeaPlane seaPlane) {
		this.seaPlane = seaPlane;
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

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}

	
}
