package co.edu.unbosque.model;

public class Avion extends Vehiculo implements Volador {

	public String despegar() {

		return "despega a las 7:30 AM";
	}

	public String aterrrizar() {

		return "El vuelo HK20 aterrizar� con dos horas de atraso";
	}

	public String volar() {

		return "El vuelo Bogot� Paris durar� 11 horas";
	}

	public String taquearGasolina() {
		
	    return "El Helicoptero hizo una parada para tanquear";

	}

}
