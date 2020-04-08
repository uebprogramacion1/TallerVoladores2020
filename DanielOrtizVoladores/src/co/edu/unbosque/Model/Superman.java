package co.edu.unbosque.Model;

public class Superman extends Kryptonian implements Flyer {
	
	private String dato;
	
	public Superman() {
		
		dato = "Hola, soy Superman, el alien más humano. " + raza() + " " +
			   eat() + ". " + fly() + ", y puedo " + takeOff() + " y " + land();
		
	}
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Me alimento del Sol, pero también puedo comer la comida Terrícola";
	}

	@Override
	public String raza() {
		// TODO Auto-generated method stub
		return "Soy un Kriptoniano";
	}
	
	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Despegar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Aterrizar";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Puedo Volar";
	}

	public String getDato() {
		return dato;
	}
	
}
