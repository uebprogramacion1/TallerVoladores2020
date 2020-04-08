package co.edu.unbosque.model;

public class Helicopter extends Airplane{
	private int numHelices;
	public Helicopter(String tipoGasolina,int numHelices) {
		super(tipoGasolina);
		this.numHelices=numHelices;
	}

	@Override
	public String takeOff() {
		return "Puedo despegar sin necesidad de impulzo";
	}

	@Override
	public String land() {
		return "Puedo aterrizar casi en cuaquier lado";
	}

	@Override
	public String fly() {
		return "puedo volar sin problemas" ;
	}

	@Override
	public String mostrarTipoGasolina() {
		return "El tipo de gasolina que uso es "+tipoGasolina;
	}
	
	public int getNumHelices() {
		return numHelices;
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
