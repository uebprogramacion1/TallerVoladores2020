package co.edu.unbosque.model;

public class Superman extends Kriptonian implements Flyer {

	public Superman(int edad) {
		super(edad);
	}

	@Override
	public String takeOff() {
		return "Puedo despegar más rapido que un helicoptero";
	}

	@Override
	public String land() {
		return "Puedo aterizar más rapido que un avión";
	}

	@Override
	public String fly() {
		return "Obviamente vuelo más rapido que un pajaro";
	}

	@Override
	public String mostrarEdad() {
		return "Mi verdadera edad es de "+edad+ "años";
	}

	@Override
	public String eat() {
		return "Me alimento del sol por eso nunca me canzo";
	}
	
	public String leapBuilding() {
		return "Soy capaz de saltar un edificio"; 
	}
	public String stopBullet() {
		return "Puedo detener balas no importa cuantas dispares";
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

}
