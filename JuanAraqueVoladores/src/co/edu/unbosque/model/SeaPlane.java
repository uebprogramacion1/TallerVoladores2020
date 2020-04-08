package co.edu.unbosque.model;

public class SeaPlane extends  Airplane  {
	private int numPasajeros;
	public SeaPlane(String tipoGasolina,int numPasajeros) {
		super(tipoGasolina);
		this.numPasajeros=numPasajeros;
	}

	@Override
	public String takeOff() {
		return "Puedo despegar sin estar en el agua";
	}

	@Override
	public String land() {
		return "Puedo aterrizar en el agua cosa que otros no pueden";
	}

	@Override
	public String fly() {
		return "Puedo volar por algunas horas";
	}

	@Override
	public String mostrarTipoGasolina() {
		return "Mi tipo de gasolina es "+tipoGasolina;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	
	public String mostrarDatos() {
		String cadena="";
		cadena+=takeOff()+"\n";
		cadena+=land()+"\n";
		cadena+=fly()+"\n";
		cadena+="El numero de pasajeros que puedo llevar es de "+getNumPasajeros()+"\n";
		cadena+=mostrarTipoGasolina()+"\n";
		
		
		return cadena;
	}

}
