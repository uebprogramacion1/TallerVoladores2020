package co.edu.unbosque.model;

public class mundo {
	
	private AirPlane ar;
	private animal  al;
	private bird br;

	private helicopter hc;
	private kryptonian kp;
	private seaPlane sp;
	private superman su;
	private vehicle vh;
	
	
	public mundo() {
		
		ar= new AirPlane();
		al=new animal();
		br=new bird();
		hc=new helicopter();
		kp=new kryptonian();
		sp=new seaPlane();
		su=new superman();
		vh= new vehicle();
		
	
	}


	public AirPlane getAr() {
		return ar;
	}


	public void setAr(AirPlane ar) {
		this.ar = ar;
	}


	public animal getAl() {
		return al;
	}


	public void setAl(animal al) {
		this.al = al;
	}


	public bird getBr() {
		return br;
	}


	public void setBr(bird br) {
		this.br = br;
	}


	public helicopter getHc() {
		return hc;
	}


	public void setHc(helicopter hc) {
		this.hc = hc;
	}


	public kryptonian getKp() {
		return kp;
	}


	public void setKp(kryptonian kp) {
		this.kp = kp;
	}


	public seaPlane getSp() {
		return sp;
	}


	public void setSp(seaPlane sp) {
		this.sp = sp;
	}


	public superman getSu() {
		return su;
	}


	public void setSu(superman su) {
		this.su = su;
	}


	public vehicle getVh() {
		return vh;
	}


	public void setVh(vehicle vh) {
		this.vh = vh;
	}
	
	
}
