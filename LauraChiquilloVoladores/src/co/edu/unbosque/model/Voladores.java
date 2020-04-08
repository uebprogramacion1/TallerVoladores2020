package co.edu.unbosque.model;

public class Voladores {

	private Birds aves;
	private Airplane aviones;
	private Seaplane hidroavión;
	private Helicopter helicoptero;
	private Superman superman;
	
	public Voladores() {
		aves= new Birds();
		aviones= new Airplane();
		hidroavión= new Seaplane();
		helicoptero= new Helicopter();
		superman= new Superman();
	}

	
	public Birds getAves() {
		return aves;
	}

	public void setAves(Birds aves) {
		this.aves = aves;
	}

	public Airplane getAviones() {
		return aviones;
	}

	public void setAviones(Airplane aviones) {
		this.aviones = aviones;
	}

	public Seaplane getHidroavión() {
		return hidroavión;
	}

	public void setHidroavión(Seaplane hidroavión) {
		this.hidroavión = hidroavión;
	}

	public Helicopter getHelicoptero() {
		return helicoptero;
	}

	public void setHelicoptero(Helicopter helicoptero) {
		this.helicoptero = helicoptero;
	}

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}
}
