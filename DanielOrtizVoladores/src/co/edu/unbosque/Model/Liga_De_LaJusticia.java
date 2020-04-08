package co.edu.unbosque.Model;

public class Liga_De_LaJusticia {
	
	public Superman superman;
	public Bird ave;
	public SeaPlane hidroavion;
	public Helicopter helicoptero;
	
	public Liga_De_LaJusticia() {
		
		superman = new Superman();
		ave = new Bird();
		hidroavion = new SeaPlane();
		helicoptero = new Helicopter();
		
	}
	
}