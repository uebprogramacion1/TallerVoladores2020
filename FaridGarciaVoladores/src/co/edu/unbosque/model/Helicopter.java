package co.edu.unbosque.model;

public class Helicopter extends Airplane{
	private int numeroHelices;
	public Helicopter(String tipoGasolina,int numeroHelices) {
		super(tipoGasolina);
		this.numeroHelices=numeroHelices;
	}

	
	public String takeOff() {
		return "Puedo despegar en vertical";
	}


	public String land() {
		return "Puedo aterrizar con poco riesgo ";
	}

	
	public String fly() {
		return "puedo volar sin problemas" ;
	}


	public String mostrarTipoGasolina() {
		return "El tipo de gasolina que uso es "+tipoGasolina;
	}
	
	public int getNumHelices() {
		return numeroHelices;
	}
	
	public String mostrarDatos() {
		String cadena="";
		cadena+=takeOff()+"\n";
		cadena+=land()+"\n";
		cadena+=fly()+"\n";
		cadena+="El numero de helices que tengo es de "+getNumHelices()+"\n";
		cadena+=mostrarTipoGasolina()+"\n";
		return cadena;
	}

}
