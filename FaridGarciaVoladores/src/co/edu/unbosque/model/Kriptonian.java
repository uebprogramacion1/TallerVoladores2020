package co.edu.unbosque.model;

public abstract class Kriptonian extends Animal implements Flyer {
	protected int edad;
	public Kriptonian(int edad) {
		this.edad= edad;
	}
	public abstract String darEdad(); 
}
