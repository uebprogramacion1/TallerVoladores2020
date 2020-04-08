package co.edu.unbosque.model;

public class Ave  extends Animal implements Volador{

	
	public String despegar() {
		
		return "El Ave despego de su nido";
	}

	
	public String aterrrizar() {
		
		return "El Ave a aterrrizo en su nido";
	}

	
	public String volar() {
	
		return "EL ave voló de su nido";
	}
	
	public String contruirNido(){
		
		return "El ave Empezó a contruir su nido";
	}
	
	public String ponerHuevo(){
		
		return "EL ave puso un huevo";
	}


	
	public String comer() {
		
		return "El ave se comio unas lombrices";
	}
	

}
