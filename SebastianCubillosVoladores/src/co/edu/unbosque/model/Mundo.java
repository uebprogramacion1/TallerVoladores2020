package co.edu.unbosque.model;

public class Mundo {
	
	Superman superman;
	Bird bird;
	
	public Mundo() {
		superman = new Superman();
		bird = new Bird();
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
