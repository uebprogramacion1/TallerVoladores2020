package co.edu.unbosque.model;

public abstract class Vehicle {
	protected String tipoGasolina;
	public Vehicle(String tipoGasolina) {
		this.tipoGasolina=tipoGasolina;
	}
	public abstract String mostrarTipoGasolina();
}
