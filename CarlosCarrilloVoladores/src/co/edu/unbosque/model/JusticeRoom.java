package co.edu.unbosque.model;

public class JusticeRoom {
	private SeaPlane seaPlane;
	private Helicopter helicopter;
	private Superman superman;
	private Bird bird;
	public JusticeRoom() {
		seaPlane= new SeaPlane("Diesel",10);
		helicopter= new Helicopter("Diesel",2);
		superman= new Superman(2000);
		bird = new Bird();
		
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
	
}
