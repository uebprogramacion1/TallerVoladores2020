package co.edu.unbosque.model;

public class SalonJusticia {

	private SeaPlane hidroAvion;
	private Helicopter helicoptero;
	private Bird pajaro;
	private Superman superman;

	public SalonJusticia() {

		hidroAvion = new SeaPlane();
		helicoptero = new Helicopter();
		pajaro = new Bird();
		superman = new Superman();
	}

	public SeaPlane getHidroAvion() {
		return hidroAvion;
	}

	public void setHidroAvion(SeaPlane hidroAvion) {
		this.hidroAvion = hidroAvion;
	}

	public Helicopter getHelicoptero() {
		return helicoptero;
	}

	public void setHelicoptero(Helicopter helicoptero) {
		this.helicoptero = helicoptero;
	}

	public Bird getPajaro() {
		return pajaro;
	}

	public void setPajaro(Bird pajaro) {
		this.pajaro = pajaro;
	}

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}

}
