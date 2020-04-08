package co.edu.unbosque.model;

public class Bird implements Flyer {
	
	public String datos;
	
	Bird(){
		
	datos = buildNest();
		
	}
	
	public String buildNest() {
		
		String aux = "construye  nidos";
		
		return aux;
	}
	
	public String layEggs() {
		String layEggs = "pone huevos";
		return layEggs;
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

         String aux= " vuelan";
         
         return aux;
	}

}
