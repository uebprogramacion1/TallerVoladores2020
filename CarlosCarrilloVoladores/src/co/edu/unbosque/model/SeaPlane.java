package co.edu.unbosque.model;

public class SeaPlane extends  Airplane  {
	private int numPasajeros;
	private int numeroPasajeros;
	public SeaPlane(String Gasolina,int numeroPasajeros) {
		super(Gasolina);
		this.numeroPasajeros=numeroPasajeros;
	}

	
	public String takeOff() {
		return "PDespejo sin derramar un poquito de agua";
	}

	
	public String land() {
		return "Puedo aterrizar en el agua sin ningun problema";
	}

	@Override
	public String fly() {
		return "Puedo volar A muy grandes alturas";
	}

	@Override
	public String mostrarTipoGasolina() {
		return "Mi tipo de Combustible es "+tipoGasolina;
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
