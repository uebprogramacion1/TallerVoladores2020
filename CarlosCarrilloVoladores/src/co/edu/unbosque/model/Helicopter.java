package co.edu.unbosque.model;

public class Helicopter extends Airplane{
	private int numeroHelices;
	public Helicopter(String tipoGasolina,int numeroHelices) {
		super(tipoGasolina);
		this.numeroHelices=numeroHelices;
	}

	
	public String takeOff() {
		return "Puedo yo Despejo muy rapido";
	}


	public String land() {
		return "Aterrizo sin ningun problema ";
	}

	
	public String fly() {
		return "Vuelo muy alto " ;
	}


	public String mostrarTipoGasolina() {
		return "Mi tipo de combustible es "+tipoGasolina;
	}
	
	public int getNumHelices() {
		return numeroHelices;
	}
	
	public String mostrarDatos() {
		String cadena="";
		cadena+=takeOff()+"\n";
		cadena+=land()+"\n";
		cadena+=fly()+"\n";
		cadena+="Helices que tengo es de "+getNumHelices()+"\n";
		cadena+=mostrarTipoGasolina()+"\n";
		return cadena;
	}

}
