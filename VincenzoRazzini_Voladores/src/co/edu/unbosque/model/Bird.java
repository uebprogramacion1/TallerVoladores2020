package co.edu.unbosque.model;

public class Bird extends Animal implements Flyer {

	String raza;

	public Bird() {
		super();
		this.raza = "Copete";
	}

	public Boolean fly() {
		return true;
	}

	public Boolean land() {
		return true;
	}

	public boolean bulidnest() {
		return true;
	};

	public int layEggs() {
		return 0;
	};

	public String eat() {
		return "Yo como gusanos ";
	}

	@Override
	public Boolean takeOff() {
		// TODO Auto-generated method stub
		return true;
	}

}
