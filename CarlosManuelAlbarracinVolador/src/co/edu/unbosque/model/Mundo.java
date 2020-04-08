package co.edu.unbosque.model;

public class Mundo {
	
   Superman superMan;
   Ave ave;
   Avion Avion;
   hidroAvion hidroavi;
   Helicoptero heli;
	
	public Mundo() {
		
		Avion = new  Avion();
	    superMan = new Superman();
	    ave = new Ave();
	    hidroavi = new hidroAvion();
	    heli = new Helicoptero();
	}

	public Ave getAve() {
		return ave;
	}

	public void setAve(Ave ave) {
		this.ave = ave;
	}

	public Avion getAvion() {
		return Avion;
	}

	public void setAvion(Avion avion) {
		Avion = avion;
	}

	public hidroAvion getHidroavi() {
		return hidroavi;
	}

	public void setHidroavi(hidroAvion hidroavi) {
		this.hidroavi = hidroavi;
	}

	public Helicoptero getHeli() {
		return heli;
	}

	public void setHeli(Helicoptero heli) {
		this.heli = heli;
	}


	public Superman getSuperMan() {
		return superMan;
	}

	public void setSuperMan(Superman superMan) {
		this.superMan = superMan;
	}
	
}
