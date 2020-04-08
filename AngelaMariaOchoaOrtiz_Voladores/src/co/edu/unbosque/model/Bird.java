package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer{

	@Override
	public String takeOFF() {
		
		return " el pajaro toma vuelo ";
	}

	@Override
	public String land() {
	
		return " el pajaro cae en el suelo  ";
	}

	@Override
	public String fly() {
	
		return " el pajaro vuela " ;
	}

	@Override
	public String eat() {
		
		return " el pajaro come gusanos ";
	}
	public String buildNest(){
		return " el pajaro construye nidos ";
	}
	public String layEggs(){
		return " el pajaro pone huevos";
	}
	

}
