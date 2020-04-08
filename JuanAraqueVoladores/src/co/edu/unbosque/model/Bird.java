package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	@Override
	public String takeOff() {
		return "Soy capaz de despegar ";
	}

	@Override
	public String land() {
		return "Soy capaz de aterrizar";
	}

	@Override
	public String fly() {
		return "Puedo volar";
	}

	@Override
	public String eat() {
		return "Tengo que comer para poder realizar todo lo anterior";
	}
	
	public String buidNest() {
		return "Soy capaz de construir mi propio nido";
	}
	
	public String layEggs() {
		return "Para reproducirme pongo huevos";
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
