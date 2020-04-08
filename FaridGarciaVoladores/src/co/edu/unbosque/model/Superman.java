package co.edu.unbosque.model;

public class Superman extends Kriptonian implements Flyer {

	public Superman(int edad) {
		super(edad);
	}

	
	public String takeOff() {
		return "soy el que mas rapido despega ";
	}

	
	public String land() {
		return "soy el que mas rapido aterriza ";
	}


	public String fly() {
		return "sigo siendo el mas rapido";
	}

	
	public String mostrarEdad() {
		return "Mi  "+edad+ "años";
	}

	
	public String eat() {
		return "soy mas fuerte cerca del sol";
	}
	
	public String leapBuilding() {
		return "salto muy alto"; 
	}
	public String stopBullet() {
		return "Puedo detener cualquier cosa";
	}
	
	public String mostrarDatos() {
		String cadena="";
		cadena+=takeOff()+"\n";
		cadena+=land()+"\n";
		cadena+=fly()+"\n";
		cadena+=mostrarEdad()+"\n";
		cadena+=eat()+"\n";
		cadena+=leapBuilding()+"\n";
		cadena+=stopBullet()+"\n";
		return cadena;
	}

	
	public String darEdad() {
		
		return null;
	} 

}
