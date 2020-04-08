package co.edu.unbosque.Model;

public class Bird extends Animal implements Flyer{
	
	private String datos;
	
	public Bird() {
		
		datos = "Soy un Ave. " + eat() + " y " + buildNest() + 
				fly() + ", " + takeOff() + " y " + land();
		
	}
	
	public String buildNest() {
		
		return "Puedo Construir un Nido.";
		
	}
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Yo me alimento de Semillas";
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

	public String getDatos() {
		return datos;
	}
	
}