package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	
	public String takeOff() {
		return "voy  a despergar";
	}

	
	public String land() {
		return "voy a aterrizar";
	}

	
	public String fly() {
		return "volar";
	}

	
	public String eat() {
		return "debo comer";
	}
	
	public String buidNest() {
		return " construir mi propio nido";
	}
	
	public String layEggs() {
		return " pongo huevos";
	}
	
	public String mostrarDatos() {
		String cadena="";
		cadena += takeOff()+"\n";
		cadena += land()+"\n";
		cadena += fly()+"\n";
		cadena+=buidNest()+"\n";
		cadena+=layEggs()+"\n";
		cadena += eat();
		return cadena;
	}

}
