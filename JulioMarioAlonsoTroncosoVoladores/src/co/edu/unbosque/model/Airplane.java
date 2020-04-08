package co.edu.unbosque.model;

public class Airplane implements Flyer {

	public String colorAvion() {
		
	String aux= " el avion es azul";
	
	return aux;
	}
	public String capacidadAvion() {
		
		String aux= "en el avion caben 30 personas";
		
		return aux;
		
		
	}
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String land() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
