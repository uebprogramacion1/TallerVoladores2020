package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	
	public String takeOff() {
		return "Despejare";
	}

	
	public String land() {
		return "Aterrizare";
	}

	
	public String fly() {
		return "volare";
	}

	
	public String eat() {
		return "comere";
	}
	
	public String buidNest() {
		return "Hare mi nido";
	}
	
	public String layEggs() {
		return "Pondre Huevos";
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
